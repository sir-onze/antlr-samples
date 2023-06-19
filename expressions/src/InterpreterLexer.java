// Generated from Interpreter.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, INT=5, BOOL=6, OR=7, AND=8, COMMENTS=9, 
		LP=10, RP=11, NEWLINE=12, SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULT", "DIV", "INT", "BOOL", "OR", "AND", "COMMENTS", 
			"LP", "RP", "NEWLINE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", null, null, "'|'", "'&&'", null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "INT", "BOOL", "OR", "AND", "COMMENTS", 
			"LP", "RP", "NEWLINE", "SPACE"
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


	public InterpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\rM\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0004"+
		"\u0004%\b\u0004\u000b\u0004\f\u0004&\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u00052\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0004\b;\b\b\u000b\b\f\b<\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\fH\b\f\u000b\f\f\fI\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0003\u0001"+
		"\u0000az\u0002\u0000\n\n\r\r\u0001\u0000  P\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001"+
		"\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005"+
		"\u001f\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t$\u0001"+
		"\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000"+
		"\u0000\u000f5\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000\u0000\u0013"+
		">\u0001\u0000\u0000\u0000\u0015@\u0001\u0000\u0000\u0000\u0017B\u0001"+
		"\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001b\u001c\u0005+\u0000"+
		"\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005-\u0000\u0000"+
		"\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005*\u0000\u0000 \u0006"+
		"\u0001\u0000\u0000\u0000!\"\u0005/\u0000\u0000\"\b\u0001\u0000\u0000\u0000"+
		"#%\u000209\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&"+
		"$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\n\u0001\u0000\u0000"+
		"\u0000()\u0005t\u0000\u0000)*\u0005r\u0000\u0000*+\u0005u\u0000\u0000"+
		"+2\u0005e\u0000\u0000,-\u0005f\u0000\u0000-.\u0005a\u0000\u0000./\u0005"+
		"l\u0000\u0000/0\u0005s\u0000\u000002\u0005e\u0000\u00001(\u0001\u0000"+
		"\u0000\u00001,\u0001\u0000\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005"+
		"|\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005&\u0000\u000067\u0005"+
		"&\u0000\u00007\u0010\u0001\u0000\u0000\u00008:\u0005#\u0000\u00009;\u0007"+
		"\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0012\u0001\u0000"+
		"\u0000\u0000>?\u0005(\u0000\u0000?\u0014\u0001\u0000\u0000\u0000@A\u0005"+
		")\u0000\u0000A\u0016\u0001\u0000\u0000\u0000BC\u0007\u0001\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0006\u000b\u0000\u0000E\u0018\u0001\u0000"+
		"\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0006\f\u0000\u0000L\u001a\u0001\u0000\u0000"+
		"\u0000\u0005\u0000&1<I\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}