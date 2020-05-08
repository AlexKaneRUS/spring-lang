using System;
using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;
using JetBrains.Application.Settings;
using JetBrains.DataFlow;
using JetBrains.Lifetimes;
using JetBrains.ReSharper.Daemon.CSharp.Errors;
using JetBrains.ReSharper.Feature.Services.Daemon;
using JetBrains.ReSharper.I18n.Services.Daemon;
using JetBrains.ReSharper.Plugins.Haskell.Lexer;
using JetBrains.ReSharper.Plugins.Spring;
using JetBrains.ReSharper.Plugins.Spring.Parser;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Tree;
using JetBrains.ReSharper.Psi.Files;
using JetBrains.ReSharper.Psi.Parsing;
using JetBrains.ReSharper.Psi.Tree;
using JetBrains.ReSharper.Psi.TreeBuilder;
using JetBrains.Text;

namespace JetBrains.ReSharper.Plugins.Haskell.Parser
{
    public class HaskellParser : IParser
    {
        private readonly ILexer _lexer;

        public HaskellParser(ILexer lexer)
        {
            _lexer = lexer;
        }

        public IFile ParseFile()
        {
            using (var def = Lifetime.Define())
            {
                var builder = new PsiBuilder(new HaskellLexer(_lexer.Buffer), HaskellCompositeNodeType.FILE,
                    new TokenFactory(), def.Lifetime);

                var parser =
                    new GHaskellParser(
                        new CommonTokenStream(
                            new GHaskellLexer(new AntlrInputStream(new BufferTextReader(_lexer.Buffer)))));
                parser.AddErrorListener(new HaskellErrorListener(builder));

                var fileMark = builder.Mark();
                new HaskellParserVisitor(builder).Visit(parser.module());
                builder.Done(fileMark, HaskellCompositeNodeType.FILE, null);

                var file = (IFile) builder.BuildTree();
                return file;
            }
        }

        class HaskellErrorListener : BaseErrorListener
        {
            private readonly PsiBuilder _builder;

            public HaskellErrorListener(PsiBuilder builder)
            {
                _builder = builder;
            }

            public override void SyntaxError(
                TextWriter output, IRecognizer recognizer, IToken offendingSymbol,
                int line, int charPositionInLine, string msg, RecognitionException e
            )
            {
                var currentLexeme = _builder.GetCurrentLexeme();
                var currentNonCommentLexeme = _builder.GetCurrentNonCommentLexeme();

                _builder.ResetCurrentLexeme(offendingSymbol.TokenIndex, offendingSymbol.TokenIndex);

                var mark = _builder.Mark();
                var length = offendingSymbol.StopIndex - offendingSymbol.StartIndex + 1;
                _builder.Done(mark, HaskellCompositeNodeType.ERROR, new HaskellErrorNodeType.Message(msg, length));

                _builder.ResetCurrentLexeme(currentLexeme, currentNonCommentLexeme);
            }
        }
    }

    public class TokenFactory : IPsiBuilderTokenFactory
    {
        public LeafElementBase CreateToken(TokenNodeType tokenNodeType, IBuffer buffer, int startOffset, int endOffset)
        {
            return tokenNodeType.Create(buffer, new TreeOffset(startOffset), new TreeOffset(endOffset));
        }
    }
    
    [DaemonStage]
    class HaskellDaemonStage : DaemonStageBase<HaskellFile>
    {
        protected override IDaemonStageProcess CreateDaemonProcess(
            IDaemonProcess process,
            DaemonProcessKind processKind,
            HaskellFile file,
            IContextBoundSettingsStore settingsStore
        )
        {
            return new HaskellDaemonProcess(process, file);
        }

        private class HaskellDaemonProcess : IDaemonStageProcess
        {
            private readonly HaskellFile _file;

            public HaskellDaemonProcess(IDaemonProcess process, HaskellFile file)
            {
                DaemonProcess = process;
                _file = file;
            }

            public void Execute(Action<DaemonStageResult> committer)
            {
                var highs = new List<HighlightingInfo>();
                
                foreach (var treeNode in _file.Descendants())
                {
                    if (treeNode is HaskellErrorElement error)
                    {
                        var a = error.GetTreeTextRange();
                        var range = error.GetDocumentRange().ExtendRight(error.Length);
                        highs.Add(new HighlightingInfo(range, new CSharpSyntaxError(error.ErrorDescription, range)));
                    }
                }
                
                committer(new DaemonStageResult(highs));
            }

            public IDaemonProcess DaemonProcess { get; }
        }

        protected override IEnumerable<HaskellFile> GetPsiFiles(IPsiSourceFile sourceFile)
        {
            yield return (HaskellFile) sourceFile.GetDominantPsiFile<SpringLanguage>();
        }
    }
}