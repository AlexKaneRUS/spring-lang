using System.Collections.Generic;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Tree;
using JetBrains.ReSharper.Psi.Parsing;
using JetBrains.Text;
using JetBrains.Util;
using JetBrains.Util.Collections;
using Mono.CSharp;

namespace JetBrains.ReSharper.Plugins.Spring.Lexer
{
    public class SpringTokenType : TokenNodeType
    {
        private static readonly HashMap<int, SpringTokenType> IntToTokenType = new HashMap<int, SpringTokenType>();

        public static readonly SpringTokenType NEWLINE = new SpringTokenType("NEWLINE", 1);
        public static readonly SpringTokenType TAB = new SpringTokenType("TAB", 2);
        public static readonly SpringTokenType WS = new SpringTokenType("WS", 3);
        public static readonly SpringTokenType COMMENT = new SpringTokenType("COMMENT", 4);
        public static readonly SpringTokenType NCOMMENT = new SpringTokenType("NCOMMENT", 5);
        public static readonly SpringTokenType OCURLY = new SpringTokenType("OCURLY", 6);
        public static readonly SpringTokenType CCURLY = new SpringTokenType("CCURLY", 7);
        public static readonly SpringTokenType VOCURLY = new SpringTokenType("VOCURLY", 8);
        public static readonly SpringTokenType VCCURLY = new SpringTokenType("VCCURLY", 9);
        public static readonly SpringTokenType SEMI = new SpringTokenType("SEMI", 10);
        public static readonly SpringTokenType CASE = new SpringTokenType("CASE", 11);
        public static readonly SpringTokenType CLASS = new SpringTokenType("CLASS", 12);
        public static readonly SpringTokenType DATA = new SpringTokenType("DATA", 13);
        public static readonly SpringTokenType DEFAULT = new SpringTokenType("DEFAULT", 14);
        public static readonly SpringTokenType DERIVING = new SpringTokenType("DERIVING", 15);
        public static readonly SpringTokenType DO = new SpringTokenType("DO", 16);
        public static readonly SpringTokenType ELSE = new SpringTokenType("ELSE", 17);
        public static readonly SpringTokenType EXPORT = new SpringTokenType("EXPORT", 18);
        public static readonly SpringTokenType FOREIGN = new SpringTokenType("FOREIGN", 19);
        public static readonly SpringTokenType IF = new SpringTokenType("IF", 20);
        public static readonly SpringTokenType IMPORT = new SpringTokenType("IMPORT", 21);
        public static readonly SpringTokenType IN = new SpringTokenType("IN", 22);
        public static readonly SpringTokenType INFIX = new SpringTokenType("INFIX", 23);
        public static readonly SpringTokenType INFIXL = new SpringTokenType("INFIXL", 24);
        public static readonly SpringTokenType INFIXR = new SpringTokenType("INFIXR", 25);
        public static readonly SpringTokenType INSTANCE = new SpringTokenType("INSTANCE", 26);
        public static readonly SpringTokenType LET = new SpringTokenType("LET", 27);
        public static readonly SpringTokenType MODULE = new SpringTokenType("MODULE", 28);
        public static readonly SpringTokenType NEWTYPE = new SpringTokenType("NEWTYPE", 29);
        public static readonly SpringTokenType OF = new SpringTokenType("OF", 30);
        public static readonly SpringTokenType THEN = new SpringTokenType("THEN", 31);
        public static readonly SpringTokenType TYPE = new SpringTokenType("TYPE", 32);
        public static readonly SpringTokenType WHERE = new SpringTokenType("WHERE", 33);
        public static readonly SpringTokenType WILDCARD = new SpringTokenType("WILDCARD", 34);
        public static readonly SpringTokenType QUALIFIED = new SpringTokenType("QUALIFIED", 35);
        public static readonly SpringTokenType AS = new SpringTokenType("AS", 36);
        public static readonly SpringTokenType HIDING = new SpringTokenType("HIDING", 37);
        public static readonly SpringTokenType LANGUAGE = new SpringTokenType("LANGUAGE", 38);
        public static readonly SpringTokenType INLINE = new SpringTokenType("INLINE", 39);
        public static readonly SpringTokenType NOINLINE = new SpringTokenType("NOINLINE", 40);
        public static readonly SpringTokenType SPECIALIZE = new SpringTokenType("SPECIALIZE", 41);
        public static readonly SpringTokenType CCALL = new SpringTokenType("CCALL", 42);
        public static readonly SpringTokenType STDCALL = new SpringTokenType("STDCALL", 43);
        public static readonly SpringTokenType CPPCALL = new SpringTokenType("CPPCALL", 44);
        public static readonly SpringTokenType JVMCALL = new SpringTokenType("JVMCALL", 45);
        public static readonly SpringTokenType DOTNETCALL = new SpringTokenType("DOTNETCALL", 46);
        public static readonly SpringTokenType SAFE = new SpringTokenType("SAFE", 47);
        public static readonly SpringTokenType UNSAFE = new SpringTokenType("UNSAFE", 48);
        public static readonly SpringTokenType DOUBLEARROW = new SpringTokenType("DoubleArrow", 49);
        public static readonly SpringTokenType DOUBLECOLON = new SpringTokenType("DoubleColon", 50);
        public static readonly SpringTokenType ARROW = new SpringTokenType("Arrow", 51);
        public static readonly SpringTokenType REVARROW = new SpringTokenType("Revarrow", 52);
        public static readonly SpringTokenType HASH = new SpringTokenType("Hash", 53);
        public static readonly SpringTokenType LESS = new SpringTokenType("Less", 54);
        public static readonly SpringTokenType GREATER = new SpringTokenType("Greater", 55);
        public static readonly SpringTokenType AMPERSAND = new SpringTokenType("Ampersand", 56);
        public static readonly SpringTokenType PIPE = new SpringTokenType("Pipe", 57);
        public static readonly SpringTokenType BANG = new SpringTokenType("Bang", 58);
        public static readonly SpringTokenType CARET = new SpringTokenType("Caret", 59);
        public static readonly SpringTokenType PLUS = new SpringTokenType("Plus", 60);
        public static readonly SpringTokenType MINUS = new SpringTokenType("Minus", 61);
        public static readonly SpringTokenType ASTERISK = new SpringTokenType("Asterisk", 62);
        public static readonly SpringTokenType PERCENT = new SpringTokenType("Percent", 63);
        public static readonly SpringTokenType DIVIDE = new SpringTokenType("Divide", 64);
        public static readonly SpringTokenType TILDE = new SpringTokenType("Tilde", 65);
        public static readonly SpringTokenType ATSIGN = new SpringTokenType("Atsign", 66);
        public static readonly SpringTokenType DOLLAR = new SpringTokenType("Dollar", 67);
        public static readonly SpringTokenType DOT = new SpringTokenType("Dot", 68);
        public static readonly SpringTokenType SEMI_2 = new SpringTokenType("Semi", 69);
        public static readonly SpringTokenType DOUBLEDOT = new SpringTokenType("DoubleDot", 70);
        public static readonly SpringTokenType QUESTIONMARK = new SpringTokenType("QuestionMark", 71);
        public static readonly SpringTokenType OPENROUNDBRACKET = new SpringTokenType("OpenRoundBracket", 72);
        public static readonly SpringTokenType CLOSEROUNDBRACKET = new SpringTokenType("CloseRoundBracket", 73);
        public static readonly SpringTokenType OPENSQUAREBRACKET = new SpringTokenType("OpenSquareBracket", 74);
        public static readonly SpringTokenType CLOSESQUAREBRACKET = new SpringTokenType("CloseSquareBracket", 75);
        public static readonly SpringTokenType OPENCOMMENTBRACKET = new SpringTokenType("OpenCommentBracket", 76);
        public static readonly SpringTokenType CLOSECOMMENTBRACKET = new SpringTokenType("CloseCommentBracket", 77);
        public static readonly SpringTokenType COMMA = new SpringTokenType("Comma", 78);
        public static readonly SpringTokenType COLON = new SpringTokenType("Colon", 79);
        public static readonly SpringTokenType EQ = new SpringTokenType("Eq", 80);
        public static readonly SpringTokenType QUOTE = new SpringTokenType("Quote", 81);
        public static readonly SpringTokenType DOUBLEQUOTE = new SpringTokenType("DoubleQuote", 82);
        public static readonly SpringTokenType BACKQUOTE = new SpringTokenType("BackQuote", 83);
        public static readonly SpringTokenType CHAR = new SpringTokenType("CHAR", 84);
        public static readonly SpringTokenType STRING = new SpringTokenType("STRING", 85);
        public static readonly SpringTokenType VARID = new SpringTokenType("VARID", 86);
        public static readonly SpringTokenType CONID = new SpringTokenType("CONID", 87);
        public static readonly SpringTokenType DECIMAL = new SpringTokenType("DECIMAL", 88);
        public static readonly SpringTokenType OCTAL = new SpringTokenType("OCTAL", 89);
        public static readonly SpringTokenType HEXADECIMAL = new SpringTokenType("HEXADECIMAL", 90);
        public static readonly SpringTokenType FLOAT = new SpringTokenType("FLOAT", 91);
        public static readonly SpringTokenType EXPONENT = new SpringTokenType("EXPONENT", 92);
        public static readonly SpringTokenType ASCSYMBOL = new SpringTokenType("ASCSYMBOL", 93);
        public static readonly SpringTokenType UNISYMBOL = new SpringTokenType("UNISYMBOL", 94);

        public static readonly HashSet<SpringTokenType> Keywords = new HashSet<SpringTokenType>
        {
            CASE,
            CLASS,
            DATA,
            DEFAULT,
            DERIVING,
            DO,
            ELSE,
            EXPORT,
            FOREIGN,
            IF,
            IMPORT,
            IN,
            INFIX,
            INFIXL,
            INFIXR,
            INSTANCE,
            LET,
            MODULE,
            NEWTYPE,
            OF,
            THEN,
            TYPE,
            WHERE,
            WILDCARD,
            QUALIFIED
        };

        public SpringTokenType(string s, int index) : base(s, index)
        {
            IntToTokenType.Add(index, this);
        }

        public static SpringTokenType GetTokenType(int i) =>
            IntToTokenType.GetValue(i, "value not found");

        public override LeafElementBase Create(IBuffer buffer, TreeOffset startOffset, TreeOffset endOffset)
        {
            return new SpringLeafToken(buffer.GetText(new TextRange(startOffset.Offset, endOffset.Offset)), this);
        }

        public override bool IsWhitespace => this == WS;

        public override bool IsComment =>
            this == COMMENT || this == NCOMMENT ||
            this == OPENCOMMENTBRACKET
            || this == CLOSECOMMENTBRACKET;

        public override bool IsStringLiteral => this == STRING;
        public override bool IsConstantLiteral { get; }
        public override bool IsIdentifier => this == VARID || this == CONID;
        public override bool IsKeyword => Keywords.Contains(this);
        public override string TokenRepresentation { get; }
    }
}