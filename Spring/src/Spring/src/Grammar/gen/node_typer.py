#!/usr/bin/python3

import fileinput

mapping = \
"""
RULE_varid = 0, RULE_conid = 1, RULE_ascSymbol = 2, RULE_varsym = 3, RULE_consym = 4, 
RULE_con = 5, RULE_varop = 6, RULE_conop = 7, RULE_op = 8, RULE_module = 9, 
RULE_tycon = 10, RULE_atype = 11, RULE_type = 12, RULE_constr = 13, RULE_constrs = 14, 
RULE_simpletype = 15, RULE_var = 16, RULE_vars = 17, RULE_gendecl = 18, 
RULE_integer = 19, RULE_pfloat = 20, RULE_pchar = 21, RULE_pstring = 22, 
RULE_literal = 23, RULE_apat = 24, RULE_funlhs = 25, RULE_lexp = 26, RULE_qop = 27, 
RULE_exp = 28, RULE_rhs = 29, RULE_decl = 30, RULE_topdecl = 31
"""


def gen_class(name_upper):
    clazz_name = str(name_upper[0]) + name_upper[1:].lower()
    camel_name = 'Haskell' + clazz_name
    res1 = '''\
    public class {} : CompositeElement
    {{
        public override NodeType NodeType => HaskellCompositeNodeType.{};

        public override PsiLanguageType Language => HaskellLanguage.Instance;
    }}\
    '''.format(camel_name, name_upper)

    res2 = '''\
    if (this == {})
        return new {}();\
    '''.format(name_upper, camel_name)

    res3 = '''\
    public override object Visit{}(GHaskellParser.{}Context context)
        {{
            var mark = _psiBuilder.Mark();
            base.VisitChildren(context);
            _psiBuilder.Done(mark, HaskellCompositeNodeType.{}, context);

            return null;
        }}\
    '''.format(clazz_name, clazz_name, name_upper)
    
    return res1, res2, res3


def make_token(s):
    symbol, id = s.rsplit('=', 1)
    symbol = symbol.strip()
    symbol_name = symbol.upper()[5:]

    return f'public static readonly HaskellCompositeNodeType {symbol_name} = new HaskellCompositeNodeType("{symbol}", {id});', \
           gen_class(symbol_name)


if __name__ == '__main__':
    with open('clazz.txt', 'w') as clazz, open('create.txt', 'w') as create, \
            open('node_types.txt', 'w') as node_types, open('visit.txt', 'w') as visit:

        for line in mapping.strip().split(', '):
            nt, (clz, cr, vs) = make_token(line.strip())

            clazz.write(clz + '\n')
            create.write(cr + '\n')
            node_types.write(nt + '\n')
            visit.write(vs + '\n')
