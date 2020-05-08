using System.Collections.Generic;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.ExtensionsAPI.Tree;
using JetBrains.ReSharper.Psi.Parsing;
using JetBrains.Text;
using JetBrains.Util;
using JetBrains.Util.Collections;
using Mono.CSharp;

namespace JetBrains.ReSharper.Plugins.Haskell.Lexer
{
    public class HaskellTokenType : TokenNodeType
    {
        private static readonly HashMap<int, HaskellTokenType> IntToTokenType = new HashMap<int, HaskellTokenType>();

        public static readonly HaskellTokenType NEWLINE = new HaskellTokenType("NEWLINE", 1);
        public static readonly HaskellTokenType TAB = new HaskellTokenType("TAB", 2);
        public static readonly HaskellTokenType WS = new HaskellTokenType("WS", 3);
        public static readonly HaskellTokenType COMMENT = new HaskellTokenType("COMMENT", 4);
        public static readonly HaskellTokenType NCOMMENT = new HaskellTokenType("NCOMMENT", 5);
        public static readonly HaskellTokenType OCURLY = new HaskellTokenType("OCURLY", 6);
        public static readonly HaskellTokenType CCURLY = new HaskellTokenType("CCURLY", 7);
        public static readonly HaskellTokenType VOCURLY = new HaskellTokenType("VOCURLY", 8);
        public static readonly HaskellTokenType VCCURLY = new HaskellTokenType("VCCURLY", 9);
        public static readonly HaskellTokenType SEMI = new HaskellTokenType("SEMI", 10);
        public static readonly HaskellTokenType CASE = new HaskellTokenType("CASE", 11);
        public static readonly HaskellTokenType CLASS = new HaskellTokenType("CLASS", 12);
        public static readonly HaskellTokenType DATA = new HaskellTokenType("DATA", 13);
        public static readonly HaskellTokenType DEFAULT = new HaskellTokenType("DEFAULT", 14);
        public static readonly HaskellTokenType DERIVING = new HaskellTokenType("DERIVING", 15);
        public static readonly HaskellTokenType DO = new HaskellTokenType("DO", 16);
        public static readonly HaskellTokenType ELSE = new HaskellTokenType("ELSE", 17);
        public static readonly HaskellTokenType EXPORT = new HaskellTokenType("EXPORT", 18);
        public static readonly HaskellTokenType FOREIGN = new HaskellTokenType("FOREIGN", 19);
        public static readonly HaskellTokenType IF = new HaskellTokenType("IF", 20);
        public static readonly HaskellTokenType IMPORT = new HaskellTokenType("IMPORT", 21);
        public static readonly HaskellTokenType IN = new HaskellTokenType("IN", 22);
        public static readonly HaskellTokenType INFIX = new HaskellTokenType("INFIX", 23);
        public static readonly HaskellTokenType INFIXL = new HaskellTokenType("INFIXL", 24);
        public static readonly HaskellTokenType INFIXR = new HaskellTokenType("INFIXR", 25);
        public static readonly HaskellTokenType INSTANCE = new HaskellTokenType("INSTANCE", 26);
        public static readonly HaskellTokenType LET = new HaskellTokenType("LET", 27);
        public static readonly HaskellTokenType MODULE = new HaskellTokenType("MODULE", 28);
        public static readonly HaskellTokenType NEWTYPE = new HaskellTokenType("NEWTYPE", 29);
        public static readonly HaskellTokenType OF = new HaskellTokenType("OF", 30);
        public static readonly HaskellTokenType THEN = new HaskellTokenType("THEN", 31);
        public static readonly HaskellTokenType TYPE = new HaskellTokenType("TYPE", 32);
        public static readonly HaskellTokenType WHERE = new HaskellTokenType("WHERE", 33);
        public static readonly HaskellTokenType WILDCARD = new HaskellTokenType("WILDCARD", 34);
        public static readonly HaskellTokenType QUALIFIED = new HaskellTokenType("QUALIFIED", 35);
        public static readonly HaskellTokenType AS = new HaskellTokenType("AS", 36);
        public static readonly HaskellTokenType HIDING = new HaskellTokenType("HIDING", 37);
        public static readonly HaskellTokenType LANGUAGE = new HaskellTokenType("LANGUAGE", 38);
        public static readonly HaskellTokenType INLINE = new HaskellTokenType("INLINE", 39);
        public static readonly HaskellTokenType NOINLINE = new HaskellTokenType("NOINLINE", 40);
        public static readonly HaskellTokenType SPECIALIZE = new HaskellTokenType("SPECIALIZE", 41);
        public static readonly HaskellTokenType CCALL = new HaskellTokenType("CCALL", 42);
        public static readonly HaskellTokenType STDCALL = new HaskellTokenType("STDCALL", 43);
        public static readonly HaskellTokenType CPPCALL = new HaskellTokenType("CPPCALL", 44);
        public static readonly HaskellTokenType JVMCALL = new HaskellTokenType("JVMCALL", 45);
        public static readonly HaskellTokenType DOTNETCALL = new HaskellTokenType("DOTNETCALL", 46);
        public static readonly HaskellTokenType SAFE = new HaskellTokenType("SAFE", 47);
        public static readonly HaskellTokenType UNSAFE = new HaskellTokenType("UNSAFE", 48);
        public static readonly HaskellTokenType DOUBLEARROW = new HaskellTokenType("DoubleArrow", 49);
        public static readonly HaskellTokenType DOUBLECOLON = new HaskellTokenType("DoubleColon", 50);
        public static readonly HaskellTokenType ARROW = new HaskellTokenType("Arrow", 51);
        public static readonly HaskellTokenType REVARROW = new HaskellTokenType("Revarrow", 52);
        public static readonly HaskellTokenType HASH = new HaskellTokenType("Hash", 53);
        public static readonly HaskellTokenType LESS = new HaskellTokenType("Less", 54);
        public static readonly HaskellTokenType GREATER = new HaskellTokenType("Greater", 55);
        public static readonly HaskellTokenType AMPERSAND = new HaskellTokenType("Ampersand", 56);
        public static readonly HaskellTokenType PIPE = new HaskellTokenType("Pipe", 57);
        public static readonly HaskellTokenType BANG = new HaskellTokenType("Bang", 58);
        public static readonly HaskellTokenType CARET = new HaskellTokenType("Caret", 59);
        public static readonly HaskellTokenType PLUS = new HaskellTokenType("Plus", 60);
        public static readonly HaskellTokenType MINUS = new HaskellTokenType("Minus", 61);
        public static readonly HaskellTokenType ASTERISK = new HaskellTokenType("Asterisk", 62);
        public static readonly HaskellTokenType PERCENT = new HaskellTokenType("Percent", 63);
        public static readonly HaskellTokenType DIVIDE = new HaskellTokenType("Divide", 64);
        public static readonly HaskellTokenType TILDE = new HaskellTokenType("Tilde", 65);
        public static readonly HaskellTokenType ATSIGN = new HaskellTokenType("Atsign", 66);
        public static readonly HaskellTokenType DOLLAR = new HaskellTokenType("Dollar", 67);
        public static readonly HaskellTokenType DOT = new HaskellTokenType("Dot", 68);
        public static readonly HaskellTokenType SEMI_2 = new HaskellTokenType("Semi", 69);
        public static readonly HaskellTokenType DOUBLEDOT = new HaskellTokenType("DoubleDot", 70);
        public static readonly HaskellTokenType QUESTIONMARK = new HaskellTokenType("QuestionMark", 71);
        public static readonly HaskellTokenType OPENROUNDBRACKET = new HaskellTokenType("OpenRoundBracket", 72);
        public static readonly HaskellTokenType CLOSEROUNDBRACKET = new HaskellTokenType("CloseRoundBracket", 73);
        public static readonly HaskellTokenType OPENSQUAREBRACKET = new HaskellTokenType("OpenSquareBracket", 74);
        public static readonly HaskellTokenType CLOSESQUAREBRACKET = new HaskellTokenType("CloseSquareBracket", 75);
        public static readonly HaskellTokenType OPENCOMMENTBRACKET = new HaskellTokenType("OpenCommentBracket", 76);
        public static readonly HaskellTokenType CLOSECOMMENTBRACKET = new HaskellTokenType("CloseCommentBracket", 77);
        public static readonly HaskellTokenType COMMA = new HaskellTokenType("Comma", 78);
        public static readonly HaskellTokenType COLON = new HaskellTokenType("Colon", 79);
        public static readonly HaskellTokenType EQ = new HaskellTokenType("Eq", 80);
        public static readonly HaskellTokenType QUOTE = new HaskellTokenType("Quote", 81);
        public static readonly HaskellTokenType DOUBLEQUOTE = new HaskellTokenType("DoubleQuote", 82);
        public static readonly HaskellTokenType BACKQUOTE = new HaskellTokenType("BackQuote", 83);
        public static readonly HaskellTokenType CHAR = new HaskellTokenType("CHAR", 84);
        public static readonly HaskellTokenType STRING = new HaskellTokenType("STRING", 85);
        public static readonly HaskellTokenType VARID = new HaskellTokenType("VARID", 86);
        public static readonly HaskellTokenType CONID = new HaskellTokenType("CONID", 87);
        public static readonly HaskellTokenType DECIMAL = new HaskellTokenType("DECIMAL", 88);
        public static readonly HaskellTokenType OCTAL = new HaskellTokenType("OCTAL", 89);
        public static readonly HaskellTokenType HEXADECIMAL = new HaskellTokenType("HEXADECIMAL", 90);
        public static readonly HaskellTokenType FLOAT = new HaskellTokenType("FLOAT", 91);
        public static readonly HaskellTokenType EXPONENT = new HaskellTokenType("EXPONENT", 92);
        public static readonly HaskellTokenType ASCSYMBOL = new HaskellTokenType("ASCSYMBOL", 93);
        public static readonly HaskellTokenType UNISYMBOL = new HaskellTokenType("UNISYMBOL", 94);

        public static readonly HashSet<HaskellTokenType> Keywords = new HashSet<HaskellTokenType>
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

        public HaskellTokenType(string s, int index) : base(s, index)
        {
            IntToTokenType.Add(index, this);
        }

        public static HaskellTokenType GetTokenType(int i) =>
            IntToTokenType.GetValue(i, "value not found");

        public override LeafElementBase Create(IBuffer buffer, TreeOffset startOffset, TreeOffset endOffset)
        {
            return new HaskellLeafToken(buffer.GetText(new TextRange(startOffset.Offset, endOffset.Offset)), this);
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