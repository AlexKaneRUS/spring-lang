#!/usr/bin/python3

import fileinput

mapping = \
"""
NEWLINE=1, TAB=2, WS=3, COMMENT=4, NCOMMENT=5, OCURLY=6, CCURLY=7, VOCURLY=8, 
VCCURLY=9, SEMI=10, CASE=11, CLASS=12, DATA=13, DEFAULT=14, DERIVING=15, 
DO=16, ELSE=17, EXPORT=18, FOREIGN=19, IF=20, IMPORT=21, IN=22, INFIX=23, 
INFIXL=24, INFIXR=25, INSTANCE=26, LET=27, MODULE=28, NEWTYPE=29, OF=30, 
THEN=31, TYPE=32, WHERE=33, WILDCARD=34, QUALIFIED=35, AS=36, HIDING=37, 
LANGUAGE=38, INLINE=39, NOINLINE=40, SPECIALIZE=41, CCALL=42, STDCALL=43, 
CPPCALL=44, JVMCALL=45, DOTNETCALL=46, SAFE=47, UNSAFE=48, DoubleArrow=49, 
DoubleColon=50, Arrow=51, Revarrow=52, Hash=53, Less=54, Greater=55, Ampersand=56, 
Pipe=57, Bang=58, Caret=59, Plus=60, Minus=61, Asterisk=62, Percent=63, 
Divide=64, Tilde=65, Atsign=66, Dollar=67, Dot=68, Semi=69, DoubleDot=70, 
QuestionMark=71, OpenRoundBracket=72, CloseRoundBracket=73, OpenSquareBracket=74, 
CloseSquareBracket=75, OpenCommentBracket=76, CloseCommentBracket=77, 
Comma=78, Colon=79, Eq=80, Quote=81, DoubleQuote=82, BackQuote=83, CHAR=84, 
STRING=85, VARID=86, CONID=87, DECIMAL=88, OCTAL=89, HEXADECIMAL=90, FLOAT=91, 
EXPONENT=92, ASCSYMBOL=93, UNISYMBOL=94
"""

def make_token(s):
    symbol, id = s.rsplit('=', 1)
    symbol = symbol.strip("'")
    symbol_name = symbol.upper()
    return f'public static readonly SpringTokenType {symbol_name} = new SpringTokenType("{symbol}", {id});'
    
if __name__ == '__main__':
    for line in mapping.strip().split(', '):
        print(make_token(line.strip()))