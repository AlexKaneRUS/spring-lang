// Generated from /Users/alexkane/study/spring-lang/Spring/src/Spring/src/Grammar/HaskellLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellLexer extends HaskellBaseLexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
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
		EXPONENT=92, ASCSYMBOL=93, UNISYMBOL=94;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "TAB", "WS", "COMMENT", "NCOMMENT", "OCURLY", "CCURLY", "VOCURLY", 
			"VCCURLY", "SEMI", "CASE", "CLASS", "DATA", "DEFAULT", "DERIVING", "DO", 
			"ELSE", "EXPORT", "FOREIGN", "IF", "IMPORT", "IN", "INFIX", "INFIXL", 
			"INFIXR", "INSTANCE", "LET", "MODULE", "NEWTYPE", "OF", "THEN", "TYPE", 
			"WHERE", "WILDCARD", "QUALIFIED", "AS", "HIDING", "LANGUAGE", "INLINE", 
			"NOINLINE", "SPECIALIZE", "CCALL", "STDCALL", "CPPCALL", "JVMCALL", "DOTNETCALL", 
			"SAFE", "UNSAFE", "DoubleArrow", "DoubleColon", "Arrow", "Revarrow", 
			"Hash", "Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", 
			"Minus", "Asterisk", "Percent", "Divide", "Tilde", "Atsign", "Dollar", 
			"Dot", "Semi", "DoubleDot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
			"OpenSquareBracket", "CloseSquareBracket", "OpenCommentBracket", "CloseCommentBracket", 
			"Comma", "Colon", "Eq", "Quote", "DoubleQuote", "BackQuote", "CHAR", 
			"STRING", "VARID", "CONID", "DECIMAL", "OCTAL", "HEXADECIMAL", "DIGIT", 
			"ASCDIGIT", "UNIDIGIT", "OCTIT", "HEXIT", "FLOAT", "EXPONENT", "LARGE", 
			"ASCLARGE", "UNILARGE", "SMALL", "ASCSMALL", "UNISMALL", "ASCSYMBOL", 
			"UNISYMBOL", "CLASSIFY_Sc", "CLASSIFY_Sk", "CLASSIFY_Sm", "CLASSIFY_So"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'{'", "'}'", "'VOCURLY'", "'VCCURLY'", 
			"'SEMI'", "'case'", "'class'", "'data'", "'default'", "'deriving'", "'do'", 
			"'else'", "'export'", "'foreign'", "'if'", "'import'", "'in'", "'infix'", 
			"'infixl'", "'infixr'", "'instance'", "'let'", "'module'", "'newtype'", 
			"'of'", "'then'", "'type'", "'where'", "'_'", "'qualified'", "'as'", 
			"'hiding'", "'LANGUAGE'", "'INLINE'", "'NOINLINE'", "'SPECIALIZE'", "'ccall'", 
			"'stdcall'", "'cplusplus'", "'jvm'", "'dotnet'", "'safe'", "'unsafe'", 
			"'=>'", "'::'", "'->'", "'<-'", "'#'", "'<'", "'>'", "'&'", "'|'", "'!'", 
			"'^'", "'+'", "'-'", "'*'", "'%'", "'/'", "'~'", "'@'", "'$'", "'.'", 
			"';'", "'..'", "'?'", "'('", "')'", "'['", "']'", "'{-#'", "'#-}'", "','", 
			"':'", "'='", "'''", "'\\'", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "TAB", "WS", "COMMENT", "NCOMMENT", "OCURLY", "CCURLY", 
			"VOCURLY", "VCCURLY", "SEMI", "CASE", "CLASS", "DATA", "DEFAULT", "DERIVING", 
			"DO", "ELSE", "EXPORT", "FOREIGN", "IF", "IMPORT", "IN", "INFIX", "INFIXL", 
			"INFIXR", "INSTANCE", "LET", "MODULE", "NEWTYPE", "OF", "THEN", "TYPE", 
			"WHERE", "WILDCARD", "QUALIFIED", "AS", "HIDING", "LANGUAGE", "INLINE", 
			"NOINLINE", "SPECIALIZE", "CCALL", "STDCALL", "CPPCALL", "JVMCALL", "DOTNETCALL", 
			"SAFE", "UNSAFE", "DoubleArrow", "DoubleColon", "Arrow", "Revarrow", 
			"Hash", "Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", 
			"Minus", "Asterisk", "Percent", "Divide", "Tilde", "Atsign", "Dollar", 
			"Dot", "Semi", "DoubleDot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
			"OpenSquareBracket", "CloseSquareBracket", "OpenCommentBracket", "CloseCommentBracket", 
			"Comma", "Colon", "Eq", "Quote", "DoubleQuote", "BackQuote", "CHAR", 
			"STRING", "VARID", "CONID", "DECIMAL", "OCTAL", "HEXADECIMAL", "FLOAT", 
			"EXPONENT", "ASCSYMBOL", "UNISYMBOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HaskellLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			TAB_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			VOCURLY_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			VCCURLY_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			SEMI_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    this.processNEWLINEToken();

			break;
		}
	}
	private void TAB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    this.processTABToken();

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    this.processWSToken();

			break;
		}
	}
	private void VOCURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 setChannel(HIDDEN); 
			break;
		}
	}
	private void VCCURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 setChannel(HIDDEN); 
			break;
		}
	}
	private void SEMI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 setChannel(HIDDEN); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2`\u02ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\5\2\u00df\n\2\3\2\3\2\5\2\u00e3\n\2\3\2\3\2\3"+
		"\3\6\3\u00e8\n\3\r\3\16\3\u00e9\3\3\3\3\3\4\6\4\u00ef\n\4\r\4\16\4\u00f0"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00f9\n\5\f\5\16\5\u00fc\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u0105\n\6\f\6\16\6\u0108\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\5U\u0276\nU\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\7V\u0282"+
		"\nV\fV\16V\u0285\13V\3V\3V\3W\3W\3W\3W\3W\7W\u028e\nW\fW\16W\u0291\13"+
		"W\3X\3X\3X\3X\3X\7X\u0298\nX\fX\16X\u029b\13X\3Y\6Y\u029e\nY\rY\16Y\u029f"+
		"\3Z\3Z\3Z\6Z\u02a5\nZ\rZ\16Z\u02a6\3[\3[\3[\6[\u02ac\n[\r[\16[\u02ad\3"+
		"\\\3\\\5\\\u02b2\n\\\3]\3]\3^\3^\3_\3_\3`\5`\u02bb\n`\3a\3a\3a\3a\5a\u02c1"+
		"\na\3a\3a\3a\5a\u02c6\na\3b\3b\5b\u02ca\nb\3b\3b\3c\3c\5c\u02d0\nc\3d"+
		"\3d\3e\3e\3f\3f\5f\u02d8\nf\3g\3g\3h\3h\3i\3i\3j\3j\3j\3j\5j\u02e4\nj"+
		"\3k\3k\3l\3l\3m\3m\3n\3n\3\u0106\2o\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7\2\u00b9\2\u00bb\2\u00bd\2"+
		"\u00bf\2\u00c1]\u00c3^\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2"+
		"\u00d1_\u00d3`\u00d5\2\u00d7\2\u00d9\2\u00db\2\3\2\31\3\2\13\13\n\2\""+
		"\"\u00a2\u00a2\u1682\u1682\u2002\u2002\u200c\u200c\u2031\u2031\u2061\u2061"+
		"\u3002\u3002\4\2\f\f\17\17\3\2%%\t\2$$*+..==]]__bb\b\2)+..==]]__bb\4\2"+
		"QQqq\4\2ZZzz\3\2\62;&\2\u0662\u066b\u06f2\u06fb\u07c2\u07cb\u0968\u0971"+
		"\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be8\u0bf1\u0c68\u0c71"+
		"\u0ce8\u0cf1\u0d68\u0d71\u0de8\u0df1\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b"+
		"\u1042\u104b\u1092\u109b\u17e2\u17eb\u1812\u181b\u1948\u1951\u19d2\u19db"+
		"\u1a82\u1a8b\u1a92\u1a9b\u1b52\u1b5b\u1bb2\u1bbb\u1c42\u1c4b\u1c52\u1c5b"+
		"\ua622\ua62b\ua8d2\ua8db\ua902\ua90b\ua9d2\ua9db\ua9f2\ua9fb\uaa52\uaa5b"+
		"\uabf2\uabfb\uff12\uff1b\3\2\629\5\2\62;CHch\4\2GGgg\4\2--//\3\2C\\\u0250"+
		"\2\u00c2\u00d8\u00da\u00e0\u0102\u0102\u0104\u0104\u0106\u0106\u0108\u0108"+
		"\u010a\u010a\u010c\u010c\u010e\u010e\u0110\u0110\u0112\u0112\u0114\u0114"+
		"\u0116\u0116\u0118\u0118\u011a\u011a\u011c\u011c\u011e\u011e\u0120\u0120"+
		"\u0122\u0122\u0124\u0124\u0126\u0126\u0128\u0128\u012a\u012a\u012c\u012c"+
		"\u012e\u012e\u0130\u0130\u0132\u0132\u0134\u0134\u0136\u0136\u0138\u0138"+
		"\u013b\u013b\u013d\u013d\u013f\u013f\u0141\u0141\u0143\u0143\u0145\u0145"+
		"\u0147\u0147\u0149\u0149\u014c\u014c\u014e\u014e\u0150\u0150\u0152\u0152"+
		"\u0154\u0154\u0156\u0156\u0158\u0158\u015a\u015a\u015c\u015c\u015e\u015e"+
		"\u0160\u0160\u0162\u0162\u0164\u0164\u0166\u0166\u0168\u0168\u016a\u016a"+
		"\u016c\u016c\u016e\u016e\u0170\u0170\u0172\u0172\u0174\u0174\u0176\u0176"+
		"\u0178\u0178\u017a\u017b\u017d\u017d\u017f\u017f\u0183\u0184\u0186\u0186"+
		"\u0188\u0189\u018b\u018d\u0190\u0193\u0195\u0196\u0198\u019a\u019e\u019f"+
		"\u01a1\u01a2\u01a4\u01a4\u01a6\u01a6\u01a8\u01a9\u01ab\u01ab\u01ae\u01ae"+
		"\u01b0\u01b1\u01b3\u01b5\u01b7\u01b7\u01b9\u01ba\u01be\u01be\u01c6\u01c6"+
		"\u01c9\u01c9\u01cc\u01cc\u01cf\u01cf\u01d1\u01d1\u01d3\u01d3\u01d5\u01d5"+
		"\u01d7\u01d7\u01d9\u01d9\u01db\u01db\u01dd\u01dd\u01e0\u01e0\u01e2\u01e2"+
		"\u01e4\u01e4\u01e6\u01e6\u01e8\u01e8\u01ea\u01ea\u01ec\u01ec\u01ee\u01ee"+
		"\u01f0\u01f0\u01f3\u01f3\u01f6\u01f6\u01f8\u01fa\u01fc\u01fc\u01fe\u01fe"+
		"\u0200\u0200\u0202\u0202\u0204\u0204\u0206\u0206\u0208\u0208\u020a\u020a"+
		"\u020c\u020c\u020e\u020e\u0210\u0210\u0212\u0212\u0214\u0214\u0216\u0216"+
		"\u0218\u0218\u021a\u021a\u021c\u021c\u021e\u021e\u0220\u0220\u0222\u0222"+
		"\u0224\u0224\u0226\u0226\u0228\u0228\u022a\u022a\u022c\u022c\u022e\u022e"+
		"\u0230\u0230\u0232\u0232\u0234\u0234\u023c\u023d\u023f\u0240\u0243\u0243"+
		"\u0245\u0248\u024a\u024a\u024c\u024c\u024e\u024e\u0250\u0250\u0372\u0372"+
		"\u0374\u0374\u0378\u0378\u0381\u0381\u0388\u0388\u038a\u038c\u038e\u038e"+
		"\u0390\u0391\u0393\u03a3\u03a5\u03ad\u03d1\u03d1\u03d4\u03d6\u03da\u03da"+
		"\u03dc\u03dc\u03de\u03de\u03e0\u03e0\u03e2\u03e2\u03e4\u03e4\u03e6\u03e6"+
		"\u03e8\u03e8\u03ea\u03ea\u03ec\u03ec\u03ee\u03ee\u03f0\u03f0\u03f6\u03f6"+
		"\u03f9\u03f9\u03fb\u03fc\u03ff\u0431\u0462\u0462\u0464\u0464\u0466\u0466"+
		"\u0468\u0468\u046a\u046a\u046c\u046c\u046e\u046e\u0470\u0470\u0472\u0472"+
		"\u0474\u0474\u0476\u0476\u0478\u0478\u047a\u047a\u047c\u047c\u047e\u047e"+
		"\u0480\u0480\u0482\u0482\u048c\u048c\u048e\u048e\u0490\u0490\u0492\u0492"+
		"\u0494\u0494\u0496\u0496\u0498\u0498\u049a\u049a\u049c\u049c\u049e\u049e"+
		"\u04a0\u04a0\u04a2\u04a2\u04a4\u04a4\u04a6\u04a6\u04a8\u04a8\u04aa\u04aa"+
		"\u04ac\u04ac\u04ae\u04ae\u04b0\u04b0\u04b2\u04b2\u04b4\u04b4\u04b6\u04b6"+
		"\u04b8\u04b8\u04ba\u04ba\u04bc\u04bc\u04be\u04be\u04c0\u04c0\u04c2\u04c3"+
		"\u04c5\u04c5\u04c7\u04c7\u04c9\u04c9\u04cb\u04cb\u04cd\u04cd\u04cf\u04cf"+
		"\u04d2\u04d2\u04d4\u04d4\u04d6\u04d6\u04d8\u04d8\u04da\u04da\u04dc\u04dc"+
		"\u04de\u04de\u04e0\u04e0\u04e2\u04e2\u04e4\u04e4\u04e6\u04e6\u04e8\u04e8"+
		"\u04ea\u04ea\u04ec\u04ec\u04ee\u04ee\u04f0\u04f0\u04f2\u04f2\u04f4\u04f4"+
		"\u04f6\u04f6\u04f8\u04f8\u04fa\u04fa\u04fc\u04fc\u04fe\u04fe\u0500\u0500"+
		"\u0502\u0502\u0504\u0504\u0506\u0506\u0508\u0508\u050a\u050a\u050c\u050c"+
		"\u050e\u050e\u0510\u0510\u0512\u0512\u0514\u0514\u0516\u0516\u0518\u0518"+
		"\u051a\u051a\u051c\u051c\u051e\u051e\u0520\u0520\u0522\u0522\u0524\u0524"+
		"\u0526\u0526\u0528\u0528\u052a\u052a\u052c\u052c\u052e\u052e\u0530\u0530"+
		"\u0533\u0558\u10a2\u10c7\u10c9\u10c9\u10cf\u10cf\u13a2\u13f7\u1e02\u1e02"+
		"\u1e04\u1e04\u1e06\u1e06\u1e08\u1e08\u1e0a\u1e0a\u1e0c\u1e0c\u1e0e\u1e0e"+
		"\u1e10\u1e10\u1e12\u1e12\u1e14\u1e14\u1e16\u1e16\u1e18\u1e18\u1e1a\u1e1a"+
		"\u1e1c\u1e1c\u1e1e\u1e1e\u1e20\u1e20\u1e22\u1e22\u1e24\u1e24\u1e26\u1e26"+
		"\u1e28\u1e28\u1e2a\u1e2a\u1e2c\u1e2c\u1e2e\u1e2e\u1e30\u1e30\u1e32\u1e32"+
		"\u1e34\u1e34\u1e36\u1e36\u1e38\u1e38\u1e3a\u1e3a\u1e3c\u1e3c\u1e3e\u1e3e"+
		"\u1e40\u1e40\u1e42\u1e42\u1e44\u1e44\u1e46\u1e46\u1e48\u1e48\u1e4a\u1e4a"+
		"\u1e4c\u1e4c\u1e4e\u1e4e\u1e50\u1e50\u1e52\u1e52\u1e54\u1e54\u1e56\u1e56"+
		"\u1e58\u1e58\u1e5a\u1e5a\u1e5c\u1e5c\u1e5e\u1e5e\u1e60\u1e60\u1e62\u1e62"+
		"\u1e64\u1e64\u1e66\u1e66\u1e68\u1e68\u1e6a\u1e6a\u1e6c\u1e6c\u1e6e\u1e6e"+
		"\u1e70\u1e70\u1e72\u1e72\u1e74\u1e74\u1e76\u1e76\u1e78\u1e78\u1e7a\u1e7a"+
		"\u1e7c\u1e7c\u1e7e\u1e7e\u1e80\u1e80\u1e82\u1e82\u1e84\u1e84\u1e86\u1e86"+
		"\u1e88\u1e88\u1e8a\u1e8a\u1e8c\u1e8c\u1e8e\u1e8e\u1e90\u1e90\u1e92\u1e92"+
		"\u1e94\u1e94\u1e96\u1e96\u1ea0\u1ea0\u1ea2\u1ea2\u1ea4\u1ea4\u1ea6\u1ea6"+
		"\u1ea8\u1ea8\u1eaa\u1eaa\u1eac\u1eac\u1eae\u1eae\u1eb0\u1eb0\u1eb2\u1eb2"+
		"\u1eb4\u1eb4\u1eb6\u1eb6\u1eb8\u1eb8\u1eba\u1eba\u1ebc\u1ebc\u1ebe\u1ebe"+
		"\u1ec0\u1ec0\u1ec2\u1ec2\u1ec4\u1ec4\u1ec6\u1ec6\u1ec8\u1ec8\u1eca\u1eca"+
		"\u1ecc\u1ecc\u1ece\u1ece\u1ed0\u1ed0\u1ed2\u1ed2\u1ed4\u1ed4\u1ed6\u1ed6"+
		"\u1ed8\u1ed8\u1eda\u1eda\u1edc\u1edc\u1ede\u1ede\u1ee0\u1ee0\u1ee2\u1ee2"+
		"\u1ee4\u1ee4\u1ee6\u1ee6\u1ee8\u1ee8\u1eea\u1eea\u1eec\u1eec\u1eee\u1eee"+
		"\u1ef0\u1ef0\u1ef2\u1ef2\u1ef4\u1ef4\u1ef6\u1ef6\u1ef8\u1ef8\u1efa\u1efa"+
		"\u1efc\u1efc\u1efe\u1efe\u1f00\u1f00\u1f0a\u1f11\u1f1a\u1f1f\u1f2a\u1f31"+
		"\u1f3a\u1f41\u1f4a\u1f4f\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f61"+
		"\u1f6a\u1f71\u1fba\u1fbd\u1fca\u1fcd\u1fda\u1fdd\u1fea\u1fee\u1ffa\u1ffd"+
		"\u2104\u2104\u2109\u2109\u210d\u210f\u2112\u2114\u2117\u2117\u211b\u211f"+
		"\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2132\u2135\u2140\u2141"+
		"\u2147\u2147\u2185\u2185\u2c02\u2c30\u2c62\u2c62\u2c64\u2c66\u2c69\u2c69"+
		"\u2c6b\u2c6b\u2c6d\u2c6d\u2c6f\u2c72\u2c74\u2c74\u2c77\u2c77\u2c80\u2c82"+
		"\u2c84\u2c84\u2c86\u2c86\u2c88\u2c88\u2c8a\u2c8a\u2c8c\u2c8c\u2c8e\u2c8e"+
		"\u2c90\u2c90\u2c92\u2c92\u2c94\u2c94\u2c96\u2c96\u2c98\u2c98\u2c9a\u2c9a"+
		"\u2c9c\u2c9c\u2c9e\u2c9e\u2ca0\u2ca0\u2ca2\u2ca2\u2ca4\u2ca4\u2ca6\u2ca6"+
		"\u2ca8\u2ca8\u2caa\u2caa\u2cac\u2cac\u2cae\u2cae\u2cb0\u2cb0\u2cb2\u2cb2"+
		"\u2cb4\u2cb4\u2cb6\u2cb6\u2cb8\u2cb8\u2cba\u2cba\u2cbc\u2cbc\u2cbe\u2cbe"+
		"\u2cc0\u2cc0\u2cc2\u2cc2\u2cc4\u2cc4\u2cc6\u2cc6\u2cc8\u2cc8\u2cca\u2cca"+
		"\u2ccc\u2ccc\u2cce\u2cce\u2cd0\u2cd0\u2cd2\u2cd2\u2cd4\u2cd4\u2cd6\u2cd6"+
		"\u2cd8\u2cd8\u2cda\u2cda\u2cdc\u2cdc\u2cde\u2cde\u2ce0\u2ce0\u2ce2\u2ce2"+
		"\u2ce4\u2ce4\u2ced\u2ced\u2cef\u2cef\u2cf4\u2cf4\ua642\ua642\ua644\ua644"+
		"\ua646\ua646\ua648\ua648\ua64a\ua64a\ua64c\ua64c\ua64e\ua64e\ua650\ua650"+
		"\ua652\ua652\ua654\ua654\ua656\ua656\ua658\ua658\ua65a\ua65a\ua65c\ua65c"+
		"\ua65e\ua65e\ua660\ua660\ua662\ua662\ua664\ua664\ua666\ua666\ua668\ua668"+
		"\ua66a\ua66a\ua66c\ua66c\ua66e\ua66e\ua682\ua682\ua684\ua684\ua686\ua686"+
		"\ua688\ua688\ua68a\ua68a\ua68c\ua68c\ua68e\ua68e\ua690\ua690\ua692\ua692"+
		"\ua694\ua694\ua696\ua696\ua698\ua698\ua69a\ua69a\ua69c\ua69c\ua724\ua724"+
		"\ua726\ua726\ua728\ua728\ua72a\ua72a\ua72c\ua72c\ua72e\ua72e\ua730\ua730"+
		"\ua734\ua734\ua736\ua736\ua738\ua738\ua73a\ua73a\ua73c\ua73c\ua73e\ua73e"+
		"\ua740\ua740\ua742\ua742\ua744\ua744\ua746\ua746\ua748\ua748\ua74a\ua74a"+
		"\ua74c\ua74c\ua74e\ua74e\ua750\ua750\ua752\ua752\ua754\ua754\ua756\ua756"+
		"\ua758\ua758\ua75a\ua75a\ua75c\ua75c\ua75e\ua75e\ua760\ua760\ua762\ua762"+
		"\ua764\ua764\ua766\ua766\ua768\ua768\ua76a\ua76a\ua76c\ua76c\ua76e\ua76e"+
		"\ua770\ua770\ua77b\ua77b\ua77d\ua77d\ua77f\ua780\ua782\ua782\ua784\ua784"+
		"\ua786\ua786\ua788\ua788\ua78d\ua78d\ua78f\ua78f\ua792\ua792\ua794\ua794"+
		"\ua798\ua798\ua79a\ua79a\ua79c\ua79c\ua79e\ua79e\ua7a0\ua7a0\ua7a2\ua7a2"+
		"\ua7a4\ua7a4\ua7a6\ua7a6\ua7a8\ua7a8\ua7aa\ua7aa\ua7ac\ua7b0\ua7b2\ua7b6"+
		"\ua7b8\ua7b8\uff23\uff3c\4\2aac|\u0259\2\u00b7\u00b7\u00e1\u00f8\u00fa"+
		"\u0101\u0103\u0103\u0105\u0105\u0107\u0107\u0109\u0109\u010b\u010b\u010d"+
		"\u010d\u010f\u010f\u0111\u0111\u0113\u0113\u0115\u0115\u0117\u0117\u0119"+
		"\u0119\u011b\u011b\u011d\u011d\u011f\u011f\u0121\u0121\u0123\u0123\u0125"+
		"\u0125\u0127\u0127\u0129\u0129\u012b\u012b\u012d\u012d\u012f\u012f\u0131"+
		"\u0131\u0133\u0133\u0135\u0135\u0137\u0137\u0139\u013a\u013c\u013c\u013e"+
		"\u013e\u0140\u0140\u0142\u0142\u0144\u0144\u0146\u0146\u0148\u0148\u014a"+
		"\u014b\u014d\u014d\u014f\u014f\u0151\u0151\u0153\u0153\u0155\u0155\u0157"+
		"\u0157\u0159\u0159\u015b\u015b\u015d\u015d\u015f\u015f\u0161\u0161\u0163"+
		"\u0163\u0165\u0165\u0167\u0167\u0169\u0169\u016b\u016b\u016d\u016d\u016f"+
		"\u016f\u0171\u0171\u0173\u0173\u0175\u0175\u0177\u0177\u0179\u0179\u017c"+
		"\u017c\u017e\u017e\u0180\u0182\u0185\u0185\u0187\u0187\u018a\u018a\u018e"+
		"\u018f\u0194\u0194\u0197\u0197\u019b\u019d\u01a0\u01a0\u01a3\u01a3\u01a5"+
		"\u01a5\u01a7\u01a7\u01aa\u01aa\u01ac\u01ad\u01af\u01af\u01b2\u01b2\u01b6"+
		"\u01b6\u01b8\u01b8\u01bb\u01bc\u01bf\u01c1\u01c8\u01c8\u01cb\u01cb\u01ce"+
		"\u01ce\u01d0\u01d0\u01d2\u01d2\u01d4\u01d4\u01d6\u01d6\u01d8\u01d8\u01da"+
		"\u01da\u01dc\u01dc\u01de\u01df\u01e1\u01e1\u01e3\u01e3\u01e5\u01e5\u01e7"+
		"\u01e7\u01e9\u01e9\u01eb\u01eb\u01ed\u01ed\u01ef\u01ef\u01f1\u01f2\u01f5"+
		"\u01f5\u01f7\u01f7\u01fb\u01fb\u01fd\u01fd\u01ff\u01ff\u0201\u0201\u0203"+
		"\u0203\u0205\u0205\u0207\u0207\u0209\u0209\u020b\u020b\u020d\u020d\u020f"+
		"\u020f\u0211\u0211\u0213\u0213\u0215\u0215\u0217\u0217\u0219\u0219\u021b"+
		"\u021b\u021d\u021d\u021f\u021f\u0221\u0221\u0223\u0223\u0225\u0225\u0227"+
		"\u0227\u0229\u0229\u022b\u022b\u022d\u022d\u022f\u022f\u0231\u0231\u0233"+
		"\u0233\u0235\u023b\u023e\u023e\u0241\u0242\u0244\u0244\u0249\u0249\u024b"+
		"\u024b\u024d\u024d\u024f\u024f\u0251\u0295\u0297\u02b1\u0373\u0373\u0375"+
		"\u0375\u0379\u0379\u037d\u037f\u0392\u0392\u03ae\u03d0\u03d2\u03d3\u03d7"+
		"\u03d9\u03db\u03db\u03dd\u03dd\u03df\u03df\u03e1\u03e1\u03e3\u03e3\u03e5"+
		"\u03e5\u03e7\u03e7\u03e9\u03e9\u03eb\u03eb\u03ed\u03ed\u03ef\u03ef\u03f1"+
		"\u03f5\u03f7\u03f7\u03fa\u03fa\u03fd\u03fe\u0432\u0461\u0463\u0463\u0465"+
		"\u0465\u0467\u0467\u0469\u0469\u046b\u046b\u046d\u046d\u046f\u046f\u0471"+
		"\u0471\u0473\u0473\u0475\u0475\u0477\u0477\u0479\u0479\u047b\u047b\u047d"+
		"\u047d\u047f\u047f\u0481\u0481\u0483\u0483\u048d\u048d\u048f\u048f\u0491"+
		"\u0491\u0493\u0493\u0495\u0495\u0497\u0497\u0499\u0499\u049b\u049b\u049d"+
		"\u049d\u049f\u049f\u04a1\u04a1\u04a3\u04a3\u04a5\u04a5\u04a7\u04a7\u04a9"+
		"\u04a9\u04ab\u04ab\u04ad\u04ad\u04af\u04af\u04b1\u04b1\u04b3\u04b3\u04b5"+
		"\u04b5\u04b7\u04b7\u04b9\u04b9\u04bb\u04bb\u04bd\u04bd\u04bf\u04bf\u04c1"+
		"\u04c1\u04c4\u04c4\u04c6\u04c6\u04c8\u04c8\u04ca\u04ca\u04cc\u04cc\u04ce"+
		"\u04ce\u04d0\u04d1\u04d3\u04d3\u04d5\u04d5\u04d7\u04d7\u04d9\u04d9\u04db"+
		"\u04db\u04dd\u04dd\u04df\u04df\u04e1\u04e1\u04e3\u04e3\u04e5\u04e5\u04e7"+
		"\u04e7\u04e9\u04e9\u04eb\u04eb\u04ed\u04ed\u04ef\u04ef\u04f1\u04f1\u04f3"+
		"\u04f3\u04f5\u04f5\u04f7\u04f7\u04f9\u04f9\u04fb\u04fb\u04fd\u04fd\u04ff"+
		"\u04ff\u0501\u0501\u0503\u0503\u0505\u0505\u0507\u0507\u0509\u0509\u050b"+
		"\u050b\u050d\u050d\u050f\u050f\u0511\u0511\u0513\u0513\u0515\u0515\u0517"+
		"\u0517\u0519\u0519\u051b\u051b\u051d\u051d\u051f\u051f\u0521\u0521\u0523"+
		"\u0523\u0525\u0525\u0527\u0527\u0529\u0529\u052b\u052b\u052d\u052d\u052f"+
		"\u052f\u0531\u0531\u0563\u0589\u13fa\u13ff\u1c82\u1c8a\u1d02\u1d2d\u1d6d"+
		"\u1d79\u1d7b\u1d9c\u1e03\u1e03\u1e05\u1e05\u1e07\u1e07\u1e09\u1e09\u1e0b"+
		"\u1e0b\u1e0d\u1e0d\u1e0f\u1e0f\u1e11\u1e11\u1e13\u1e13\u1e15\u1e15\u1e17"+
		"\u1e17\u1e19\u1e19\u1e1b\u1e1b\u1e1d\u1e1d\u1e1f\u1e1f\u1e21\u1e21\u1e23"+
		"\u1e23\u1e25\u1e25\u1e27\u1e27\u1e29\u1e29\u1e2b\u1e2b\u1e2d\u1e2d\u1e2f"+
		"\u1e2f\u1e31\u1e31\u1e33\u1e33\u1e35\u1e35\u1e37\u1e37\u1e39\u1e39\u1e3b"+
		"\u1e3b\u1e3d\u1e3d\u1e3f\u1e3f\u1e41\u1e41\u1e43\u1e43\u1e45\u1e45\u1e47"+
		"\u1e47\u1e49\u1e49\u1e4b\u1e4b\u1e4d\u1e4d\u1e4f\u1e4f\u1e51\u1e51\u1e53"+
		"\u1e53\u1e55\u1e55\u1e57\u1e57\u1e59\u1e59\u1e5b\u1e5b\u1e5d\u1e5d\u1e5f"+
		"\u1e5f\u1e61\u1e61\u1e63\u1e63\u1e65\u1e65\u1e67\u1e67\u1e69\u1e69\u1e6b"+
		"\u1e6b\u1e6d\u1e6d\u1e6f\u1e6f\u1e71\u1e71\u1e73\u1e73\u1e75\u1e75\u1e77"+
		"\u1e77\u1e79\u1e79\u1e7b\u1e7b\u1e7d\u1e7d\u1e7f\u1e7f\u1e81\u1e81\u1e83"+
		"\u1e83\u1e85\u1e85\u1e87\u1e87\u1e89\u1e89\u1e8b\u1e8b\u1e8d\u1e8d\u1e8f"+
		"\u1e8f\u1e91\u1e91\u1e93\u1e93\u1e95\u1e95\u1e97\u1e9f\u1ea1\u1ea1\u1ea3"+
		"\u1ea3\u1ea5\u1ea5\u1ea7\u1ea7\u1ea9\u1ea9\u1eab\u1eab\u1ead\u1ead\u1eaf"+
		"\u1eaf\u1eb1\u1eb1\u1eb3\u1eb3\u1eb5\u1eb5\u1eb7\u1eb7\u1eb9\u1eb9\u1ebb"+
		"\u1ebb\u1ebd\u1ebd\u1ebf\u1ebf\u1ec1\u1ec1\u1ec3\u1ec3\u1ec5\u1ec5\u1ec7"+
		"\u1ec7\u1ec9\u1ec9\u1ecb\u1ecb\u1ecd\u1ecd\u1ecf\u1ecf\u1ed1\u1ed1\u1ed3"+
		"\u1ed3\u1ed5\u1ed5\u1ed7\u1ed7\u1ed9\u1ed9\u1edb\u1edb\u1edd\u1edd\u1edf"+
		"\u1edf\u1ee1\u1ee1\u1ee3\u1ee3\u1ee5\u1ee5\u1ee7\u1ee7\u1ee9\u1ee9\u1eeb"+
		"\u1eeb\u1eed\u1eed\u1eef\u1eef\u1ef1\u1ef1\u1ef3\u1ef3\u1ef5\u1ef5\u1ef7"+
		"\u1ef7\u1ef9\u1ef9\u1efb\u1efb\u1efd\u1efd\u1eff\u1eff\u1f01\u1f09\u1f12"+
		"\u1f17\u1f22\u1f29\u1f32\u1f39\u1f42\u1f47\u1f52\u1f59\u1f62\u1f69\u1f72"+
		"\u1f7f\u1f82\u1f89\u1f92\u1f99\u1fa2\u1fa9\u1fb2\u1fb6\u1fb8\u1fb9\u1fc0"+
		"\u1fc0\u1fc4\u1fc6\u1fc8\u1fc9\u1fd2\u1fd5\u1fd8\u1fd9\u1fe2\u1fe9\u1ff4"+
		"\u1ff6\u1ff8\u1ff9\u210c\u210c\u2110\u2111\u2115\u2115\u2131\u2131\u2136"+
		"\u2136\u213b\u213b\u213e\u213f\u2148\u214b\u2150\u2150\u2186\u2186\u2c32"+
		"\u2c60\u2c63\u2c63\u2c67\u2c68\u2c6a\u2c6a\u2c6c\u2c6c\u2c6e\u2c6e\u2c73"+
		"\u2c73\u2c75\u2c76\u2c78\u2c7d\u2c83\u2c83\u2c85\u2c85\u2c87\u2c87\u2c89"+
		"\u2c89\u2c8b\u2c8b\u2c8d\u2c8d\u2c8f\u2c8f\u2c91\u2c91\u2c93\u2c93\u2c95"+
		"\u2c95\u2c97\u2c97\u2c99\u2c99\u2c9b\u2c9b\u2c9d\u2c9d\u2c9f\u2c9f\u2ca1"+
		"\u2ca1\u2ca3\u2ca3\u2ca5\u2ca5\u2ca7\u2ca7\u2ca9\u2ca9\u2cab\u2cab\u2cad"+
		"\u2cad\u2caf\u2caf\u2cb1\u2cb1\u2cb3\u2cb3\u2cb5\u2cb5\u2cb7\u2cb7\u2cb9"+
		"\u2cb9\u2cbb\u2cbb\u2cbd\u2cbd\u2cbf\u2cbf\u2cc1\u2cc1\u2cc3\u2cc3\u2cc5"+
		"\u2cc5\u2cc7\u2cc7\u2cc9\u2cc9\u2ccb\u2ccb\u2ccd\u2ccd\u2ccf\u2ccf\u2cd1"+
		"\u2cd1\u2cd3\u2cd3\u2cd5\u2cd5\u2cd7\u2cd7\u2cd9\u2cd9\u2cdb\u2cdb\u2cdd"+
		"\u2cdd\u2cdf\u2cdf\u2ce1\u2ce1\u2ce3\u2ce3\u2ce5\u2ce6\u2cee\u2cee\u2cf0"+
		"\u2cf0\u2cf5\u2cf5\u2d02\u2d27\u2d29\u2d29\u2d2f\u2d2f\ua643\ua643\ua645"+
		"\ua645\ua647\ua647\ua649\ua649\ua64b\ua64b\ua64d\ua64d\ua64f\ua64f\ua651"+
		"\ua651\ua653\ua653\ua655\ua655\ua657\ua657\ua659\ua659\ua65b\ua65b\ua65d"+
		"\ua65d\ua65f\ua65f\ua661\ua661\ua663\ua663\ua665\ua665\ua667\ua667\ua669"+
		"\ua669\ua66b\ua66b\ua66d\ua66d\ua66f\ua66f\ua683\ua683\ua685\ua685\ua687"+
		"\ua687\ua689\ua689\ua68b\ua68b\ua68d\ua68d\ua68f\ua68f\ua691\ua691\ua693"+
		"\ua693\ua695\ua695\ua697\ua697\ua699\ua699\ua69b\ua69b\ua69d\ua69d\ua725"+
		"\ua725\ua727\ua727\ua729\ua729\ua72b\ua72b\ua72d\ua72d\ua72f\ua72f\ua731"+
		"\ua733\ua735\ua735\ua737\ua737\ua739\ua739\ua73b\ua73b\ua73d\ua73d\ua73f"+
		"\ua73f\ua741\ua741\ua743\ua743\ua745\ua745\ua747\ua747\ua749\ua749\ua74b"+
		"\ua74b\ua74d\ua74d\ua74f\ua74f\ua751\ua751\ua753\ua753\ua755\ua755\ua757"+
		"\ua757\ua759\ua759\ua75b\ua75b\ua75d\ua75d\ua75f\ua75f\ua761\ua761\ua763"+
		"\ua763\ua765\ua765\ua767\ua767\ua769\ua769\ua76b\ua76b\ua76d\ua76d\ua76f"+
		"\ua76f\ua771\ua771\ua773\ua77a\ua77c\ua77c\ua77e\ua77e\ua781\ua781\ua783"+
		"\ua783\ua785\ua785\ua787\ua787\ua789\ua789\ua78e\ua78e\ua790\ua790\ua793"+
		"\ua793\ua795\ua797\ua799\ua799\ua79b\ua79b\ua79d\ua79d\ua79f\ua79f\ua7a1"+
		"\ua7a1\ua7a3\ua7a3\ua7a5\ua7a5\ua7a7\ua7a7\ua7a9\ua7a9\ua7ab\ua7ab\ua7b7"+
		"\ua7b7\ua7b9\ua7b9\ua7fc\ua7fc\uab32\uab5c\uab62\uab67\uab72\uabc1\ufb02"+
		"\ufb08\ufb15\ufb19\uff43\uff5c\f\2##%(,-/\61<<>B^^``~~\u0080\u0080\23"+
		"\2&&\u00a4\u00a7\u0591\u0591\u060d\u060d\u09f4\u09f5\u09fd\u09fd\u0af3"+
		"\u0af3\u0bfb\u0bfb\u0e41\u0e41\u17dd\u17dd\u20a2\u20c0\ua83a\ua83a\ufdfe"+
		"\ufdfe\ufe6b\ufe6b\uff06\uff06\uffe2\uffe3\uffe7\uffe8\36\2``bb\u00aa"+
		"\u00aa\u00b1\u00b1\u00b6\u00b6\u00ba\u00ba\u02c4\u02c7\u02d4\u02e1\u02e7"+
		"\u02ed\u02ef\u02ef\u02f1\u0301\u0377\u0377\u0386\u0387\u1fbf\u1fbf\u1fc1"+
		"\u1fc3\u1fcf\u1fd1\u1fdf\u1fe1\u1fef\u1ff1\u1fff\u2000\u309d\u309e\ua702"+
		"\ua718\ua722\ua723\ua78b\ua78c\uab5d\uab5d\ufbb4\ufbc3\uff40\uff40\uff42"+
		"\uff42\uffe5\uffe5\67\2-->@~~\u0080\u0080\u00ae\u00ae\u00b3\u00b3\u00d9"+
		"\u00d9\u00f9\u00f9\u03f8\u03f8\u0608\u060a\u2046\u2046\u2054\u2054\u207c"+
		"\u207e\u208c\u208e\u211a\u211a\u2142\u2146\u214d\u214d\u2192\u2196\u219c"+
		"\u219d\u21a2\u21a2\u21a5\u21a5\u21a8\u21a8\u21b0\u21b0\u21d0\u21d1\u21d4"+
		"\u21d4\u21d6\u21d6\u21f6\u2301\u2322\u2323\u237e\u237e\u239d\u23b5\u23de"+
		"\u23e3\u25b9\u25b9\u25c3\u25c3\u25fa\u2601\u2671\u2671\u27c2\u27c6\u27c9"+
		"\u27e7\u27f2\u2801\u2902\u2984\u299b\u29d9\u29de\u29fd\u2a00\u2b01\u2b32"+
		"\u2b46\u2b49\u2b4e\ufb2b\ufb2b\ufe64\ufe64\ufe66\ufe68\uff0d\uff0d\uff1e"+
		"\uff20\uff5e\uff5e\uff60\uff60\uffe4\uffe4\uffeb\uffeeu\2\u00a8\u00a8"+
		"\u00ab\u00ab\u00b0\u00b0\u00b2\u00b2\u0484\u0484\u058f\u0590\u0610\u0611"+
		"\u06e0\u06e0\u06eb\u06eb\u06ff\u0700\u07f8\u07f8\u09fc\u09fc\u0b72\u0b72"+
		"\u0bf5\u0bfa\u0bfc\u0bfc\u0c81\u0c81\u0d51\u0d51\u0d7b\u0d7b\u0f03\u0f05"+
		"\u0f15\u0f15\u0f17\u0f19\u0f1c\u0f21\u0f36\u0f36\u0f38\u0f38\u0f3a\u0f3a"+
		"\u0fc0\u0fc7\u0fc9\u0fce\u0fd0\u0fd1\u0fd7\u0fda\u10a0\u10a1\u1392\u139b"+
		"\u1942\u1942\u19e0\u1a01\u1b63\u1b6c\u1b76\u1b7e\u2102\u2103\u2105\u2108"+
		"\u210a\u210b\u2116\u2116\u2118\u2119\u2120\u2125\u2127\u2127\u2129\u2129"+
		"\u212b\u212b\u2130\u2130\u213c\u213d\u214c\u214c\u214e\u214f\u2151\u2151"+
		"\u218c\u218d\u2197\u219b\u219e\u21a1\u21a3\u21a4\u21a6\u21a7\u21a9\u21af"+
		"\u21b1\u21cf\u21d2\u21d3\u21d5\u21d5\u21d7\u21f5\u2302\u2309\u230e\u2321"+
		"\u2324\u232a\u232d\u237d\u237f\u239c\u23b6\u23dd\u23e4\u2400\u2402\u2428"+
		"\u2442\u244c\u249e\u24eb\u2502\u25b8\u25ba\u25c2\u25c4\u25f9\u2602\u2670"+
		"\u2672\u2769\u2796\u27c1\u2802\u2901\u2b02\u2b31\u2b47\u2b48\u2b4f\u2b75"+
		"\u2b78\u2b97\u2b9a\u2bbb\u2bbf\u2bca\u2bcc\u2bd3\u2bee\u2bf1\u2ce7\u2cec"+
		"\u2e82\u2e9b\u2e9d\u2ef5\u2f02\u2fd7\u2ff2\u2ffd\u3006\u3006\u3014\u3015"+
		"\u3022\u3022\u3038\u3039\u3040\u3041\u3192\u3193\u3198\u31a1\u31c2\u31e5"+
		"\u3202\u3220\u322c\u3249\u3252\u3252\u3262\u3281\u328c\u32b2\u32c2\u3300"+
		"\u3302\u3401\u4dc2\u4e01\ua492\ua4c8\ua82a\ua82d\ua838\ua839\ua83b\ua83b"+
		"\uaa79\uaa7b\ufdff\ufdff\uffe6\uffe6\uffea\uffea\uffef\ufff0\ufffe\uffff"+
		"\2\u0304\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\3\u00e2\3\2\2\2\5\u00e7\3\2\2"+
		"\2\7\u00ee\3\2\2\2\t\u00f4\3\2\2\2\13\u00ff\3\2\2\2\r\u010e\3\2\2\2\17"+
		"\u0110\3\2\2\2\21\u0112\3\2\2\2\23\u011c\3\2\2\2\25\u0126\3\2\2\2\27\u012d"+
		"\3\2\2\2\31\u0132\3\2\2\2\33\u0138\3\2\2\2\35\u013d\3\2\2\2\37\u0145\3"+
		"\2\2\2!\u014e\3\2\2\2#\u0151\3\2\2\2%\u0156\3\2\2\2\'\u015d\3\2\2\2)\u0165"+
		"\3\2\2\2+\u0168\3\2\2\2-\u016f\3\2\2\2/\u0172\3\2\2\2\61\u0178\3\2\2\2"+
		"\63\u017f\3\2\2\2\65\u0186\3\2\2\2\67\u018f\3\2\2\29\u0193\3\2\2\2;\u019a"+
		"\3\2\2\2=\u01a2\3\2\2\2?\u01a5\3\2\2\2A\u01aa\3\2\2\2C\u01af\3\2\2\2E"+
		"\u01b5\3\2\2\2G\u01b7\3\2\2\2I\u01c1\3\2\2\2K\u01c4\3\2\2\2M\u01cb\3\2"+
		"\2\2O\u01d4\3\2\2\2Q\u01db\3\2\2\2S\u01e4\3\2\2\2U\u01ef\3\2\2\2W\u01f5"+
		"\3\2\2\2Y\u01fd\3\2\2\2[\u0207\3\2\2\2]\u020b\3\2\2\2_\u0212\3\2\2\2a"+
		"\u0217\3\2\2\2c\u021e\3\2\2\2e\u0221\3\2\2\2g\u0224\3\2\2\2i\u0227\3\2"+
		"\2\2k\u022a\3\2\2\2m\u022c\3\2\2\2o\u022e\3\2\2\2q\u0230\3\2\2\2s\u0232"+
		"\3\2\2\2u\u0234\3\2\2\2w\u0236\3\2\2\2y\u0238\3\2\2\2{\u023a\3\2\2\2}"+
		"\u023c\3\2\2\2\177\u023e\3\2\2\2\u0081\u0240\3\2\2\2\u0083\u0242\3\2\2"+
		"\2\u0085\u0244\3\2\2\2\u0087\u0246\3\2\2\2\u0089\u0248\3\2\2\2\u008b\u024a"+
		"\3\2\2\2\u008d\u024c\3\2\2\2\u008f\u024f\3\2\2\2\u0091\u0251\3\2\2\2\u0093"+
		"\u0253\3\2\2\2\u0095\u0255\3\2\2\2\u0097\u0257\3\2\2\2\u0099\u0259\3\2"+
		"\2\2\u009b\u025d\3\2\2\2\u009d\u0261\3\2\2\2\u009f\u0263\3\2\2\2\u00a1"+
		"\u0265\3\2\2\2\u00a3\u0267\3\2\2\2\u00a5\u0269\3\2\2\2\u00a7\u026b\3\2"+
		"\2\2\u00a9\u026d\3\2\2\2\u00ab\u0279\3\2\2\2\u00ad\u0288\3\2\2\2\u00af"+
		"\u0292\3\2\2\2\u00b1\u029d\3\2\2\2\u00b3\u02a1\3\2\2\2\u00b5\u02a8\3\2"+
		"\2\2\u00b7\u02b1\3\2\2\2\u00b9\u02b3\3\2\2\2\u00bb\u02b5\3\2\2\2\u00bd"+
		"\u02b7\3\2\2\2\u00bf\u02ba\3\2\2\2\u00c1\u02c5\3\2\2\2\u00c3\u02c7\3\2"+
		"\2\2\u00c5\u02cf\3\2\2\2\u00c7\u02d1\3\2\2\2\u00c9\u02d3\3\2\2\2\u00cb"+
		"\u02d7\3\2\2\2\u00cd\u02d9\3\2\2\2\u00cf\u02db\3\2\2\2\u00d1\u02dd\3\2"+
		"\2\2\u00d3\u02e3\3\2\2\2\u00d5\u02e5\3\2\2\2\u00d7\u02e7\3\2\2\2\u00d9"+
		"\u02e9\3\2\2\2\u00db\u02eb\3\2\2\2\u00dd\u00df\7\17\2\2\u00de\u00dd\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\7\f\2\2\u00e1"+
		"\u00e3\7\17\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\b\2\2\2\u00e5\4\3\2\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b\3\3\2\u00ec\6\3\2\2\2\u00ed\u00ef\t\3\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\4\4\2\u00f3\b\3\2\2\2\u00f4"+
		"\u00f5\7/\2\2\u00f5\u00f6\7/\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\n\4\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\b\5\5\2\u00fe"+
		"\n\3\2\2\2\u00ff\u0100\7}\2\2\u0100\u0101\7/\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0106\n\5\2\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7/\2\2\u010a\u010b\7\177\2\2\u010b\u010c\3"+
		"\2\2\2\u010c\u010d\b\6\5\2\u010d\f\3\2\2\2\u010e\u010f\7}\2\2\u010f\16"+
		"\3\2\2\2\u0110\u0111\7\177\2\2\u0111\20\3\2\2\2\u0112\u0113\7X\2\2\u0113"+
		"\u0114\7Q\2\2\u0114\u0115\7E\2\2\u0115\u0116\7W\2\2\u0116\u0117\7T\2\2"+
		"\u0117\u0118\7N\2\2\u0118\u0119\7[\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\b\t\6\2\u011b\22\3\2\2\2\u011c\u011d\7X\2\2\u011d\u011e\7E\2\2\u011e"+
		"\u011f\7E\2\2\u011f\u0120\7W\2\2\u0120\u0121\7T\2\2\u0121\u0122\7N\2\2"+
		"\u0122\u0123\7[\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\n\7\2\u0125\24\3"+
		"\2\2\2\u0126\u0127\7U\2\2\u0127\u0128\7G\2\2\u0128\u0129\7O\2\2\u0129"+
		"\u012a\7K\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b\13\b\2\u012c\26\3\2\2"+
		"\2\u012d\u012e\7e\2\2\u012e\u012f\7c\2\2\u012f\u0130\7u\2\2\u0130\u0131"+
		"\7g\2\2\u0131\30\3\2\2\2\u0132\u0133\7e\2\2\u0133\u0134\7n\2\2\u0134\u0135"+
		"\7c\2\2\u0135\u0136\7u\2\2\u0136\u0137\7u\2\2\u0137\32\3\2\2\2\u0138\u0139"+
		"\7f\2\2\u0139\u013a\7c\2\2\u013a\u013b\7v\2\2\u013b\u013c\7c\2\2\u013c"+
		"\34\3\2\2\2\u013d\u013e\7f\2\2\u013e\u013f\7g\2\2\u013f\u0140\7h\2\2\u0140"+
		"\u0141\7c\2\2\u0141\u0142\7w\2\2\u0142\u0143\7n\2\2\u0143\u0144\7v\2\2"+
		"\u0144\36\3\2\2\2\u0145\u0146\7f\2\2\u0146\u0147\7g\2\2\u0147\u0148\7"+
		"t\2\2\u0148\u0149\7k\2\2\u0149\u014a\7x\2\2\u014a\u014b\7k\2\2\u014b\u014c"+
		"\7p\2\2\u014c\u014d\7i\2\2\u014d \3\2\2\2\u014e\u014f\7f\2\2\u014f\u0150"+
		"\7q\2\2\u0150\"\3\2\2\2\u0151\u0152\7g\2\2\u0152\u0153\7n\2\2\u0153\u0154"+
		"\7u\2\2\u0154\u0155\7g\2\2\u0155$\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7z\2\2\u0158\u0159\7r\2\2\u0159\u015a\7q\2\2\u015a\u015b\7t\2\2\u015b"+
		"\u015c\7v\2\2\u015c&\3\2\2\2\u015d\u015e\7h\2\2\u015e\u015f\7q\2\2\u015f"+
		"\u0160\7t\2\2\u0160\u0161\7g\2\2\u0161\u0162\7k\2\2\u0162\u0163\7i\2\2"+
		"\u0163\u0164\7p\2\2\u0164(\3\2\2\2\u0165\u0166\7k\2\2\u0166\u0167\7h\2"+
		"\2\u0167*\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a\7o\2\2\u016a\u016b\7"+
		"r\2\2\u016b\u016c\7q\2\2\u016c\u016d\7t\2\2\u016d\u016e\7v\2\2\u016e,"+
		"\3\2\2\2\u016f\u0170\7k\2\2\u0170\u0171\7p\2\2\u0171.\3\2\2\2\u0172\u0173"+
		"\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175\7h\2\2\u0175\u0176\7k\2\2\u0176"+
		"\u0177\7z\2\2\u0177\60\3\2\2\2\u0178\u0179\7k\2\2\u0179\u017a\7p\2\2\u017a"+
		"\u017b\7h\2\2\u017b\u017c\7k\2\2\u017c\u017d\7z\2\2\u017d\u017e\7n\2\2"+
		"\u017e\62\3\2\2\2\u017f\u0180\7k\2\2\u0180\u0181\7p\2\2\u0181\u0182\7"+
		"h\2\2\u0182\u0183\7k\2\2\u0183\u0184\7z\2\2\u0184\u0185\7t\2\2\u0185\64"+
		"\3\2\2\2\u0186\u0187\7k\2\2\u0187\u0188\7p\2\2\u0188\u0189\7u\2\2\u0189"+
		"\u018a\7v\2\2\u018a\u018b\7c\2\2\u018b\u018c\7p\2\2\u018c\u018d\7e\2\2"+
		"\u018d\u018e\7g\2\2\u018e\66\3\2\2\2\u018f\u0190\7n\2\2\u0190\u0191\7"+
		"g\2\2\u0191\u0192\7v\2\2\u01928\3\2\2\2\u0193\u0194\7o\2\2\u0194\u0195"+
		"\7q\2\2\u0195\u0196\7f\2\2\u0196\u0197\7w\2\2\u0197\u0198\7n\2\2\u0198"+
		"\u0199\7g\2\2\u0199:\3\2\2\2\u019a\u019b\7p\2\2\u019b\u019c\7g\2\2\u019c"+
		"\u019d\7y\2\2\u019d\u019e\7v\2\2\u019e\u019f\7{\2\2\u019f\u01a0\7r\2\2"+
		"\u01a0\u01a1\7g\2\2\u01a1<\3\2\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7h\2"+
		"\2\u01a4>\3\2\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7j\2\2\u01a7\u01a8\7"+
		"g\2\2\u01a8\u01a9\7p\2\2\u01a9@\3\2\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac"+
		"\7{\2\2\u01ac\u01ad\7r\2\2\u01ad\u01ae\7g\2\2\u01aeB\3\2\2\2\u01af\u01b0"+
		"\7y\2\2\u01b0\u01b1\7j\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7t\2\2\u01b3"+
		"\u01b4\7g\2\2\u01b4D\3\2\2\2\u01b5\u01b6\7a\2\2\u01b6F\3\2\2\2\u01b7\u01b8"+
		"\7s\2\2\u01b8\u01b9\7w\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7n\2\2\u01bb"+
		"\u01bc\7k\2\2\u01bc\u01bd\7h\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7g\2\2"+
		"\u01bf\u01c0\7f\2\2\u01c0H\3\2\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7u\2"+
		"\2\u01c3J\3\2\2\2\u01c4\u01c5\7j\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7"+
		"f\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7i\2\2\u01caL"+
		"\3\2\2\2\u01cb\u01cc\7N\2\2\u01cc\u01cd\7C\2\2\u01cd\u01ce\7P\2\2\u01ce"+
		"\u01cf\7I\2\2\u01cf\u01d0\7W\2\2\u01d0\u01d1\7C\2\2\u01d1\u01d2\7I\2\2"+
		"\u01d2\u01d3\7G\2\2\u01d3N\3\2\2\2\u01d4\u01d5\7K\2\2\u01d5\u01d6\7P\2"+
		"\2\u01d6\u01d7\7N\2\2\u01d7\u01d8\7K\2\2\u01d8\u01d9\7P\2\2\u01d9\u01da"+
		"\7G\2\2\u01daP\3\2\2\2\u01db\u01dc\7P\2\2\u01dc\u01dd\7Q\2\2\u01dd\u01de"+
		"\7K\2\2\u01de\u01df\7P\2\2\u01df\u01e0\7N\2\2\u01e0\u01e1\7K\2\2\u01e1"+
		"\u01e2\7P\2\2\u01e2\u01e3\7G\2\2\u01e3R\3\2\2\2\u01e4\u01e5\7U\2\2\u01e5"+
		"\u01e6\7R\2\2\u01e6\u01e7\7G\2\2\u01e7\u01e8\7E\2\2\u01e8\u01e9\7K\2\2"+
		"\u01e9\u01ea\7C\2\2\u01ea\u01eb\7N\2\2\u01eb\u01ec\7K\2\2\u01ec\u01ed"+
		"\7\\\2\2\u01ed\u01ee\7G\2\2\u01eeT\3\2\2\2\u01ef\u01f0\7e\2\2\u01f0\u01f1"+
		"\7e\2\2\u01f1\u01f2\7c\2\2\u01f2\u01f3\7n\2\2\u01f3\u01f4\7n\2\2\u01f4"+
		"V\3\2\2\2\u01f5\u01f6\7u\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8\7f\2\2\u01f8"+
		"\u01f9\7e\2\2\u01f9\u01fa\7c\2\2\u01fa\u01fb\7n\2\2\u01fb\u01fc\7n\2\2"+
		"\u01fcX\3\2\2\2\u01fd\u01fe\7e\2\2\u01fe\u01ff\7r\2\2\u01ff\u0200\7n\2"+
		"\2\u0200\u0201\7w\2\2\u0201\u0202\7u\2\2\u0202\u0203\7r\2\2\u0203\u0204"+
		"\7n\2\2\u0204\u0205\7w\2\2\u0205\u0206\7u\2\2\u0206Z\3\2\2\2\u0207\u0208"+
		"\7l\2\2\u0208\u0209\7x\2\2\u0209\u020a\7o\2\2\u020a\\\3\2\2\2\u020b\u020c"+
		"\7f\2\2\u020c\u020d\7q\2\2\u020d\u020e\7v\2\2\u020e\u020f\7p\2\2\u020f"+
		"\u0210\7g\2\2\u0210\u0211\7v\2\2\u0211^\3\2\2\2\u0212\u0213\7u\2\2\u0213"+
		"\u0214\7c\2\2\u0214\u0215\7h\2\2\u0215\u0216\7g\2\2\u0216`\3\2\2\2\u0217"+
		"\u0218\7w\2\2\u0218\u0219\7p\2\2\u0219\u021a\7u\2\2\u021a\u021b\7c\2\2"+
		"\u021b\u021c\7h\2\2\u021c\u021d\7g\2\2\u021db\3\2\2\2\u021e\u021f\7?\2"+
		"\2\u021f\u0220\7@\2\2\u0220d\3\2\2\2\u0221\u0222\7<\2\2\u0222\u0223\7"+
		"<\2\2\u0223f\3\2\2\2\u0224\u0225\7/\2\2\u0225\u0226\7@\2\2\u0226h\3\2"+
		"\2\2\u0227\u0228\7>\2\2\u0228\u0229\7/\2\2\u0229j\3\2\2\2\u022a\u022b"+
		"\7%\2\2\u022bl\3\2\2\2\u022c\u022d\7>\2\2\u022dn\3\2\2\2\u022e\u022f\7"+
		"@\2\2\u022fp\3\2\2\2\u0230\u0231\7(\2\2\u0231r\3\2\2\2\u0232\u0233\7~"+
		"\2\2\u0233t\3\2\2\2\u0234\u0235\7#\2\2\u0235v\3\2\2\2\u0236\u0237\7`\2"+
		"\2\u0237x\3\2\2\2\u0238\u0239\7-\2\2\u0239z\3\2\2\2\u023a\u023b\7/\2\2"+
		"\u023b|\3\2\2\2\u023c\u023d\7,\2\2\u023d~\3\2\2\2\u023e\u023f\7\'\2\2"+
		"\u023f\u0080\3\2\2\2\u0240\u0241\7\61\2\2\u0241\u0082\3\2\2\2\u0242\u0243"+
		"\7\u0080\2\2\u0243\u0084\3\2\2\2\u0244\u0245\7B\2\2\u0245\u0086\3\2\2"+
		"\2\u0246\u0247\7&\2\2\u0247\u0088\3\2\2\2\u0248\u0249\7\60\2\2\u0249\u008a"+
		"\3\2\2\2\u024a\u024b\7=\2\2\u024b\u008c\3\2\2\2\u024c\u024d\7\60\2\2\u024d"+
		"\u024e\7\60\2\2\u024e\u008e\3\2\2\2\u024f\u0250\7A\2\2\u0250\u0090\3\2"+
		"\2\2\u0251\u0252\7*\2\2\u0252\u0092\3\2\2\2\u0253\u0254\7+\2\2\u0254\u0094"+
		"\3\2\2\2\u0255\u0256\7]\2\2\u0256\u0096\3\2\2\2\u0257\u0258\7_\2\2\u0258"+
		"\u0098\3\2\2\2\u0259\u025a\7}\2\2\u025a\u025b\7/\2\2\u025b\u025c\7%\2"+
		"\2\u025c\u009a\3\2\2\2\u025d\u025e\7%\2\2\u025e\u025f\7/\2\2\u025f\u0260"+
		"\7\177\2\2\u0260\u009c\3\2\2\2\u0261\u0262\7.\2\2\u0262\u009e\3\2\2\2"+
		"\u0263\u0264\7<\2\2\u0264\u00a0\3\2\2\2\u0265\u0266\7?\2\2\u0266\u00a2"+
		"\3\2\2\2\u0267\u0268\7)\2\2\u0268\u00a4\3\2\2\2\u0269\u026a\7^\2\2\u026a"+
		"\u00a6\3\2\2\2\u026b\u026c\7b\2\2\u026c\u00a8\3\2\2\2\u026d\u0275\7)\2"+
		"\2\u026e\u0276\7\"\2\2\u026f\u0276\5\u00b1Y\2\u0270\u0276\5\u00cbf\2\u0271"+
		"\u0276\5\u00c5c\2\u0272\u0276\5\u00d1i\2\u0273\u0276\5\u00b7\\\2\u0274"+
		"\u0276\t\6\2\2\u0275\u026e\3\2\2\2\u0275\u026f\3\2\2\2\u0275\u0270\3\2"+
		"\2\2\u0275\u0271\3\2\2\2\u0275\u0272\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7)\2\2\u0278\u00aa\3\2"+
		"\2\2\u0279\u0283\7$\2\2\u027a\u0282\7\"\2\2\u027b\u0282\5\u00b1Y\2\u027c"+
		"\u0282\5\u00cbf\2\u027d\u0282\5\u00c5c\2\u027e\u0282\5\u00d1i\2\u027f"+
		"\u0282\5\u00b7\\\2\u0280\u0282\t\7\2\2\u0281\u027a\3\2\2\2\u0281\u027b"+
		"\3\2\2\2\u0281\u027c\3\2\2\2\u0281\u027d\3\2\2\2\u0281\u027e\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286"+
		"\u0287\7$\2\2\u0287\u00ac\3\2\2\2\u0288\u028f\5\u00cbf\2\u0289\u028e\5"+
		"\u00cbf\2\u028a\u028e\5\u00c5c\2\u028b\u028e\5\u00b7\\\2\u028c\u028e\7"+
		")\2\2\u028d\u0289\3\2\2\2\u028d\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u00ae\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0299\5\u00c5c\2\u0293"+
		"\u0298\5\u00cbf\2\u0294\u0298\5\u00c5c\2\u0295\u0298\5\u00b7\\\2\u0296"+
		"\u0298\7)\2\2\u0297\u0293\3\2\2\2\u0297\u0294\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u00b0\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\5\u00b7"+
		"\\\2\u029d\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u00b2\3\2\2\2\u02a1\u02a2\7\62\2\2\u02a2\u02a4\t"+
		"\b\2\2\u02a3\u02a5\5\u00bd_\2\u02a4\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2"+
		"\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u00b4\3\2\2\2\u02a8\u02a9"+
		"\7\62\2\2\u02a9\u02ab\t\t\2\2\u02aa\u02ac\5\u00bf`\2\u02ab\u02aa\3\2\2"+
		"\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u00b6"+
		"\3\2\2\2\u02af\u02b2\5\u00b9]\2\u02b0\u02b2\5\u00bb^\2\u02b1\u02af\3\2"+
		"\2\2\u02b1\u02b0\3\2\2\2\u02b2\u00b8\3\2\2\2\u02b3\u02b4\t\n\2\2\u02b4"+
		"\u00ba\3\2\2\2\u02b5\u02b6\t\13\2\2\u02b6\u00bc\3\2\2\2\u02b7\u02b8\t"+
		"\f\2\2\u02b8\u00be\3\2\2\2\u02b9\u02bb\t\r\2\2\u02ba\u02b9\3\2\2\2\u02bb"+
		"\u00c0\3\2\2\2\u02bc\u02bd\5\u00b1Y\2\u02bd\u02be\7\60\2\2\u02be\u02c0"+
		"\5\u00b1Y\2\u02bf\u02c1\5\u00c3b\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c3\5\u00b1Y\2\u02c3\u02c4\5\u00c3b\2"+
		"\u02c4\u02c6\3\2\2\2\u02c5\u02bc\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c6\u00c2"+
		"\3\2\2\2\u02c7\u02c9\t\16\2\2\u02c8\u02ca\t\17\2\2\u02c9\u02c8\3\2\2\2"+
		"\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\5\u00b1Y\2\u02cc"+
		"\u00c4\3\2\2\2\u02cd\u02d0\5\u00c7d\2\u02ce\u02d0\5\u00c9e\2\u02cf\u02cd"+
		"\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0\u00c6\3\2\2\2\u02d1\u02d2\t\20\2\2"+
		"\u02d2\u00c8\3\2\2\2\u02d3\u02d4\t\21\2\2\u02d4\u00ca\3\2\2\2\u02d5\u02d8"+
		"\5\u00cdg\2\u02d6\u02d8\5\u00cfh\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2"+
		"\2\2\u02d8\u00cc\3\2\2\2\u02d9\u02da\t\22\2\2\u02da\u00ce\3\2\2\2\u02db"+
		"\u02dc\t\23\2\2\u02dc\u00d0\3\2\2\2\u02dd\u02de\t\24\2\2\u02de\u00d2\3"+
		"\2\2\2\u02df\u02e4\5\u00d5k\2\u02e0\u02e4\5\u00d7l\2\u02e1\u02e4\5\u00d9"+
		"m\2\u02e2\u02e4\5\u00dbn\2\u02e3\u02df\3\2\2\2\u02e3\u02e0\3\2\2\2\u02e3"+
		"\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4\u00d4\3\2\2\2\u02e5\u02e6\t\25"+
		"\2\2\u02e6\u00d6\3\2\2\2\u02e7\u02e8\t\26\2\2\u02e8\u00d8\3\2\2\2\u02e9"+
		"\u02ea\t\27\2\2\u02ea\u00da\3\2\2\2\u02eb\u02ec\t\30\2\2\u02ec\u00dc\3"+
		"\2\2\2\33\2\u00de\u00e2\u00e9\u00f0\u00fa\u0106\u0275\u0281\u0283\u028d"+
		"\u028f\u0297\u0299\u029f\u02a6\u02ad\u02b1\u02ba\u02c0\u02c5\u02c9\u02cf"+
		"\u02d7\u02e3\t\3\2\2\3\3\3\3\4\4\b\2\2\3\t\5\3\n\6\3\13\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}