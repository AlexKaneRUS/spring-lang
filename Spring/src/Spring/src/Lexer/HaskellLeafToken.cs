using System.Text;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Tree;
using JetBrains.ReSharper.Psi.Parsing;
using JetBrains.ReSharper.Psi.Tree;
using JetBrains.Text;

namespace JetBrains.ReSharper.Plugins.Haskell.Lexer
{
    public class HaskellLeafToken : LeafElementBase, ITokenNode
    {
        private readonly string _text;
        private readonly HaskellTokenType _type;

        public HaskellLeafToken(string text, HaskellTokenType tokenType)
        {
            _text = text;
            _type = tokenType;
        }

        public override int GetTextLength() => _text.Length;
        public override string GetText() => _text;

        public override StringBuilder GetText(StringBuilder to)
        {
            to.Append(GetText());
            return to;
        }

        public override IBuffer GetTextAsBuffer() => new StringBuffer(GetText());
        public override string ToString() => base.ToString() + $"(type: {_type}, text: {_text})";
        public override NodeType NodeType => _type;
        public override PsiLanguageType Language { get; }
        public TokenNodeType GetTokenType()
        {
            return _type;
        }
    }
}