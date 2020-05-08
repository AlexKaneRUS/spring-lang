using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using JetBrains.ReSharper.Plugins.Haskell;
using JetBrains.ReSharper.Psi.TreeBuilder;

namespace JetBrains.ReSharper.Plugins.Spring.Parser
{
    public class HaskellParserVisitor : GHaskellParserBaseVisitor<object>
    {
        private readonly PsiBuilder _psiBuilder;

        public HaskellParserVisitor(PsiBuilder psiBuilder)
        {
            _psiBuilder = psiBuilder;
        }

        public override object VisitVarid(GHaskellParser.VaridContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.VARID, context);

            return null;
        }

        public override object VisitConid(GHaskellParser.ConidContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.CONID, context);

            return null;
        }

        public override object VisitAscSymbol(GHaskellParser.AscSymbolContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.ASCSYMBOL, context);

            return null;
        }

        public override object VisitVarsym(GHaskellParser.VarsymContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.VARSYM, context);

            return null;
        }

        public override object VisitConsym(GHaskellParser.ConsymContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.CONSYM, context);

            return null;
        }

        public override object VisitCon(GHaskellParser.ConContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.CON, context);

            return null;
        }

        public override object VisitVarop(GHaskellParser.VaropContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.VAROP, context);

            return null;
        }

        public override object VisitConop(GHaskellParser.ConopContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.CONOP, context);

            return null;
        }

        public override object VisitOp(GHaskellParser.OpContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.OP, context);

            return null;
        }

        public override object VisitModule(GHaskellParser.ModuleContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.MODULE, context);

            return null;
        }

        public override object VisitTycon(GHaskellParser.TyconContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.TYCON, context);

            return null;
        }

        public override object VisitAtype(GHaskellParser.AtypeContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.ATYPE, context);

            return null;
        }

        public override object VisitType(GHaskellParser.TypeContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.TYPE, context);

            return null;
        }

        public override object VisitConstr(GHaskellParser.ConstrContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.CONSTR, context);

            return null;
        }

        public override object VisitConstrs(GHaskellParser.ConstrsContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.CONSTRS, context);

            return null;
        }

        public override object VisitSimpletype(GHaskellParser.SimpletypeContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.SIMPLETYPE, context);

            return null;
        }

        public override object VisitVar(GHaskellParser.VarContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.VAR, context);

            return null;
        }

        public override object VisitGendecl(GHaskellParser.GendeclContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.GENDECL, context);

            return null;
        }

        public override object VisitInteger(GHaskellParser.IntegerContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.INTEGER, context);

            return null;
        }

        public override object VisitPfloat(GHaskellParser.PfloatContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.PFLOAT, context);

            return null;
        }

        public override object VisitPchar(GHaskellParser.PcharContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.PCHAR, context);

            return null;
        }

        public override object VisitPstring(GHaskellParser.PstringContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.PSTRING, context);

            return null;
        }

        public override object VisitLiteral(GHaskellParser.LiteralContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.LITERAL, context);

            return null;
        }

        public override object VisitApat(GHaskellParser.ApatContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.APAT, context);

            return null;
        }

        public override object VisitFunlhs(GHaskellParser.FunlhsContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.FUNLHS, context);

            return null;
        }

        public override object VisitLexp(GHaskellParser.LexpContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.LEXP, context);

            return null;
        }

        public override object VisitQop(GHaskellParser.QopContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.QOP, context);

            return null;
        }

        public override object VisitExp(GHaskellParser.ExpContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.EXP, context);

            return null;
        }

        public override object VisitRhs(GHaskellParser.RhsContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.RHS, context);

            return null;
        }

        public override object VisitDecl(GHaskellParser.DeclContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.DECL, context);

            return null;
        }

        public override object VisitTopdecl(GHaskellParser.TopdeclContext context)
        {
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.TOPDECL, context);

            return null;
        }


        private ITerminalNode previousGoodToken;

        public override object VisitTerminal(ITerminalNode node)
        {
            if (node.Symbol.TokenIndex != -1)
            {
                var counter = 0;

                while (counter < node.Symbol.TokenIndex - (previousGoodToken?.Symbol.TokenIndex ?? -1) - 1)
                {
                    if (!_psiBuilder.Eof())
                    {
                        _psiBuilder.AdvanceLexer();
                    }

                    counter++;
                }
            }

            if (!_psiBuilder.Eof())
            {
                _psiBuilder.AdvanceLexer();
            }

            previousGoodToken = node;

            return null;
        }
    }
}