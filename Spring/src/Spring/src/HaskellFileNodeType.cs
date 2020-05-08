using System;
using System.Collections.Generic;
using System.Linq;
using System.Xml;
using Antlr4.Runtime;
using JetBrains.Annotations;
using JetBrains.Diagnostics;
using JetBrains.ReSharper.Plugins.Spring;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Resolve;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Tree;
using JetBrains.ReSharper.Psi.Parsing;
using JetBrains.ReSharper.Psi.Resolve;
using JetBrains.ReSharper.Psi.Tree;
using JetBrains.ReSharper.Psi.TreeBuilder;
using JetBrains.Text;
using JetBrains.Util;
using JetBrains.Util.DataStructures;

namespace JetBrains.ReSharper.Plugins.Haskell
{
    public class HaskellCompositeNodeType : CompositeNodeType
    {
        public HaskellCompositeNodeType(string s, int index) : base(s, index)
        {
        }

        public static readonly HaskellCompositeNodeType VARID = new HaskellCompositeNodeType("RULE_varid", 0);
        public static readonly HaskellCompositeNodeType CONID = new HaskellCompositeNodeType("RULE_conid", 1);
        public static readonly HaskellCompositeNodeType ASCSYMBOL = new HaskellCompositeNodeType("RULE_ascSymbol", 2);
        public static readonly HaskellCompositeNodeType VARSYM = new HaskellCompositeNodeType("RULE_varsym", 3);
        public static readonly HaskellCompositeNodeType CONSYM = new HaskellCompositeNodeType("RULE_consym", 4);
        public static readonly HaskellCompositeNodeType CON = new HaskellCompositeNodeType("RULE_con", 5);
        public static readonly HaskellCompositeNodeType VAROP = new HaskellCompositeNodeType("RULE_varop", 6);
        public static readonly HaskellCompositeNodeType CONOP = new HaskellCompositeNodeType("RULE_conop", 7);
        public static readonly HaskellCompositeNodeType OP = new HaskellCompositeNodeType("RULE_op", 8);
        public static readonly HaskellCompositeNodeType MODULE = new HaskellCompositeNodeType("RULE_module", 9);
        public static readonly HaskellCompositeNodeType TYCON = new HaskellCompositeNodeType("RULE_tycon", 10);
        public static readonly HaskellCompositeNodeType ATYPE = new HaskellCompositeNodeType("RULE_atype", 11);
        public static readonly HaskellCompositeNodeType TYPE = new HaskellCompositeNodeType("RULE_type", 12);
        public static readonly HaskellCompositeNodeType CONSTR = new HaskellCompositeNodeType("RULE_constr", 13);
        public static readonly HaskellCompositeNodeType CONSTRS = new HaskellCompositeNodeType("RULE_constrs", 14);

        public static readonly HaskellCompositeNodeType
            SIMPLETYPE = new HaskellCompositeNodeType("RULE_simpletype", 15);

        public static readonly ContextNodeType VAR = new ContextNodeType("RULE_var", 16);
        public static readonly HaskellCompositeNodeType VARS = new HaskellCompositeNodeType("RULE_vars", 17);
        public static readonly HaskellCompositeNodeType GENDECL = new HaskellCompositeNodeType("RULE_gendecl", 18);
        public static readonly HaskellCompositeNodeType INTEGER = new HaskellCompositeNodeType("RULE_integer", 19);
        public static readonly HaskellCompositeNodeType PFLOAT = new HaskellCompositeNodeType("RULE_pfloat", 20);
        public static readonly HaskellCompositeNodeType PCHAR = new HaskellCompositeNodeType("RULE_pchar", 21);
        public static readonly HaskellCompositeNodeType PSTRING = new HaskellCompositeNodeType("RULE_pstring", 22);
        public static readonly HaskellCompositeNodeType LITERAL = new HaskellCompositeNodeType("RULE_literal", 23);
        public static readonly HaskellCompositeNodeType APAT = new HaskellCompositeNodeType("RULE_apat", 24);
        public static readonly ContextNodeType FUNLHS = new ContextNodeType("RULE_funlhs", 25);
        public static readonly HaskellCompositeNodeType LEXP = new HaskellCompositeNodeType("RULE_lexp", 26);
        public static readonly HaskellCompositeNodeType QOP = new HaskellCompositeNodeType("RULE_qop", 27);
        public static readonly HaskellCompositeNodeType EXP = new HaskellCompositeNodeType("RULE_exp", 28);
        public static readonly HaskellCompositeNodeType RHS = new HaskellCompositeNodeType("RULE_rhs", 29);
        public static readonly HaskellCompositeNodeType DECL = new HaskellCompositeNodeType("RULE_decl", 30);
        public static readonly HaskellCompositeNodeType TOPDECL = new HaskellCompositeNodeType("RULE_topdecl", 31);

        public static readonly HaskellErrorNodeType ERROR = new HaskellErrorNodeType("RULE_ERROR", 32);
        public static readonly HaskellCompositeNodeType FILE = new HaskellCompositeNodeType("RULE_FILE", 33);

        public override CompositeElement Create()
        {
            if (this == VARID)
                return new HaskellVarid();
            if (this == CONID)
                return new HaskellConid();
            if (this == ASCSYMBOL)
                return new HaskellAscsymbol();
            if (this == VARSYM)
                return new HaskellVarsym();
            if (this == CONSYM)
                return new HaskellConsym();
            if (this == CON)
                return new HaskellCon();
            if (this == VAROP)
                return new HaskellVarop();
            if (this == CONOP)
                return new HaskellConop();
            if (this == OP)
                return new HaskellOp();
            if (this == MODULE)
                return new HaskellModule();
            if (this == TYCON)
                return new HaskellTycon();
            if (this == ATYPE)
                return new HaskellAtype();
            if (this == TYPE)
                return new HaskellType();
            if (this == CONSTR)
                return new HaskellConstr();
            if (this == CONSTRS)
                return new HaskellConstrs();
            if (this == SIMPLETYPE)
                return new HaskellSimpletype();
            if (this == VARS)
                return new HaskellVars();
            if (this == GENDECL)
                return new HaskellGendecl();
            if (this == INTEGER)
                return new HaskellInteger();
            if (this == PFLOAT)
                return new HaskellPfloat();
            if (this == PCHAR)
                return new HaskellPchar();
            if (this == PSTRING)
                return new HaskellPstring();
            if (this == LITERAL)
                return new HaskellLiteral();
            if (this == APAT)
                return new HaskellApat();
            if (this == LEXP)
                return new HaskellLexp();
            if (this == QOP)
                return new HaskellQop();
            if (this == EXP)
                return new HaskellExp();
            if (this == RHS)
                return new HaskellRhs();
            if (this == DECL)
                return new HaskellDecl();
            if (this == TOPDECL)
                return new HaskellTopdecl();
            if (this == FILE)
                return new HaskellFile();
            else
                throw new InvalidOperationException();
        }
    }

    public class HaskellErrorNodeType : CompositeNodeWithArgumentType
    {
        public HaskellErrorNodeType(string s, int index) : base(s, index)
        {
        }

        public class Message
        {
            public Message(string text, int length)
            {
                Text = text;
                Length = length;
            }

            public string Text { get; }
            public int Length { get; }
        }

        public override CompositeElement Create(object userData)
        {
            var message = (Message) userData;
            return new HaskellErrorElement(message.Text, message.Length);
        }

        public override CompositeElement Create()
        {
            Assertion.Fail("This can't be");
            return null;
        }
    }

    public class HaskellErrorElement : CompositeElement, IErrorElement
    {
        public HaskellErrorElement(string text, int length)
        {
            ErrorDescription = text;
            Length = length;
        }

        public override NodeType NodeType => HaskellCompositeNodeType.ERROR;
        public override PsiLanguageType Language => SpringLanguage.Instance;
        public string ErrorDescription { get; }
        public int Length { get; }
    }

    public class ContextNodeType : CompositeNodeWithArgumentType
    {
        public ContextNodeType(string s, int index) : base(s, index)
        {
        }

        public override CompositeElement Create(object userData)
        {
            var context = (RuleContext) userData;

            if (this == HaskellCompositeNodeType.FUNLHS)
            {
                return new FDecl(context);
            }

            if (this == HaskellCompositeNodeType.VAR)
            {
                return new VarNode(context);
            }
            else
            {
                throw new InvalidOperationException();
            }
        }

        public override CompositeElement Create()
        {
            Assertion.Fail("This can't be");
            return null;
        }
    }

    public class VarNode : CompositeElement
    {
        public VarNode(RuleContext context)
        {
            Context = context;
        }

        public RuleContext Context { get; }

        public string Name => (Context as GHaskellParser.VarContext)?.varid().VARID().GetText();
        public override NodeType NodeType => HaskellCompositeNodeType.VARID;
        public override PsiLanguageType Language => SpringLanguage.Instance;
    }

    public class FDecl : CompositeElement, IDeclaration
    {
        public FDecl(RuleContext context)
        {
            Context = context;
            DeclaredElement = new FDeclared(this);
        }

        public RuleContext Context { get; }

        public ITreeNode Child => this.Children().First();
        public override NodeType NodeType => HaskellCompositeNodeType.FUNLHS;
        public override PsiLanguageType Language => SpringLanguage.Instance;

        public XmlNode GetXMLDoc(bool inherit)
        {
            return null;
        }

        public void SetName(string name)
        {
        }

        public TreeTextRange GetNameRange()
        {
            return Child.GetTreeTextRange();
        }

        public bool IsSynthetic()
        {
            return false;
        }

        public IDeclaredElement DeclaredElement { get; }
        public string DeclaredName => (Context as GHaskellParser.FunlhsContext)?.varid().VARID().GetText();
    }

    public class FDeclared : IDeclaredElement
    {
        private readonly FDecl _decl;

        public FDeclared(FDecl decl)
        {
            _decl = decl;
        }

        public IPsiServices GetPsiServices()
        {
            return _decl.GetPsiServices();
        }

        public IList<IDeclaration> GetDeclarations()
        {
            return new List<IDeclaration> {_decl};
        }

        public IList<IDeclaration> GetDeclarationsIn(IPsiSourceFile sourceFile)
        {
            var file = _decl.GetSourceFile();

            if (file == null || sourceFile != file)
            {
                return ICSharpCode.NRefactory.EmptyList<IDeclaration>.Instance;
            }

            return GetDeclarations();
        }

        public DeclaredElementType GetElementType()
        {
            return CLRDeclaredElementType.METHOD;
        }

        public XmlNode GetXMLDoc(bool inherit)
        {
            return null;
        }

        public XmlNode GetXMLDescriptionSummary(bool inherit)
        {
            return null;
        }

        public bool IsValid()
        {
            return _decl.IsValid();
        }

        public bool IsSynthetic()
        {
            return _decl.IsSynthetic();
        }

        public HybridCollection<IPsiSourceFile> GetSourceFiles()
        {
            var file = _decl.GetSourceFile();

            if (file == null)
            {
                return HybridCollection<IPsiSourceFile>.Empty;
            }

            return new HybridCollection<IPsiSourceFile> {file};
        }

        public bool HasDeclarationsIn(IPsiSourceFile sourceFile)
        {
            return !GetDeclarationsIn(sourceFile).IsEmpty();
        }

        public string ShortName => _decl.DeclaredName;
        public bool CaseSensitiveName => true;

        public PsiLanguageType PresentationLanguage => SpringLanguage.Instance;
    }

    public class VarReference : TreeReferenceBase<VarNode>
    {
        public VarReference([NotNull] VarNode owner) : base(owner)
        {
        }
        
        public static List<IDeclaration> GetSiblingDecls(ITreeNode element)
        {
            var res = new List<IDeclaration>();
            
            if (element is HaskellTopdecl || element is HaskellDecl || element is HaskellFunlhs || element is HaskellApat)
            {
                res = element.Children().SelectMany(x => GetSiblingDecls(x)).ToList();
            }
            
            if (element is IDeclaration d)
            {
                res.Add(d);
            }

            return res;
        }

        public override ResolveResultWithInfo ResolveWithoutCache()
        {
            var file = myOwner.GetContainingFile();
            if (file == null)
            {
                return ResolveResultWithInfo.Unresolved;
            }

            foreach (var containingNode in myOwner.ContainingNodes())
            {
                foreach (var d in containingNode.Children().SelectMany(x => GetSiblingDecls(x)))
                {
                    if (d.DeclaredName == GetName())
                    {
                        return new ResolveResultWithInfo(new SimpleResolveResult(d.DeclaredElement),
                            ResolveErrorType.OK);
                    }
                }
            }

            return ResolveResultWithInfo.Unresolved;
        }

        public override string GetName()
        {
            return myOwner.Name;
        }

        public override ISymbolTable GetReferenceSymbolTable(bool useReferenceName)
        {
            throw new NotImplementedException();
        }

        public override TreeTextRange GetTreeTextRange()
        {
            return myOwner.GetTreeTextRange();
        }

        public override IReference BindTo(IDeclaredElement element)
        {
            return this;
        }

        public override IReference BindTo(IDeclaredElement element, ISubstitution substitution)
        {
            return this;
        }

        public override IAccessContext GetAccessContext()
        {
            return new DefaultAccessContext(myOwner);
        }

        public override bool IsValid()
        {
            return true;
        }
    }
}