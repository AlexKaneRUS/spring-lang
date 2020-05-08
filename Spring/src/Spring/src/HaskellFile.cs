using JetBrains.ReSharper.Plugins.Haskell;
using JetBrains.ReSharper.Plugins.Spring;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Tree;
using JetBrains.ReSharper.Psi.Tree;

namespace JetBrains.ReSharper.Plugins.Haskell
{

    public class HaskellFile : FileElementBase
    {
        public override NodeType NodeType => HaskellCompositeNodeType.FILE;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }

        public class HaskellVarid : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.VARID;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellConid : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.CONID;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellAscsymbol : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.ASCSYMBOL;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellVarsym : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.VARSYM;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellConsym : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.CONSYM;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellCon : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.CON;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellVarop : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.VAROP;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellConop : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.CONOP;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellOp : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.OP;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellModule : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.MODULE;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellTycon : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.TYCON;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellAtype : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.ATYPE;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellType : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.TYPE;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellConstr : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.CONSTR;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellConstrs : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.CONSTRS;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellSimpletype : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.SIMPLETYPE;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellVar : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.VAR;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellVars : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.VARS;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellGendecl : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.GENDECL;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellInteger : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.INTEGER;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellPfloat : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.PFLOAT;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellPchar : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.PCHAR;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellPstring : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.PSTRING;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellLiteral : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.LITERAL;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellApat : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.APAT;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellFunlhs : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.FUNLHS;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellLexp : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.LEXP;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellQop : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.QOP;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellExp : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.EXP;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellRhs : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.RHS;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellDecl : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.DECL;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }    
    public class HaskellTopdecl : CompositeElement
    {
        public override NodeType NodeType => HaskellCompositeNodeType.TOPDECL;

        public override PsiLanguageType Language => SpringLanguage.Instance;
    }
}