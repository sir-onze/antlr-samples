// Generated from Bank.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BankParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BT=3, ET=4, CREDIT=5, DEBIT=6, INT=7, ID=8, ESCAPED_STRING=9, 
		WS=10;
	public static final int
		RULE_transactions = 0, RULE_movements = 1, RULE_move = 2, RULE_destAccount = 3, 
		RULE_signal = 4, RULE_ammount = 5, RULE_originAccount = 6, RULE_description = 7, 
		RULE_data = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"transactions", "movements", "move", "destAccount", "signal", "ammount", 
			"originAccount", "description", "data"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'-#'", "'#-'", "'CREDIT'", "'DEBIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BT", "ET", "CREDIT", "DEBIT", "INT", "ID", "ESCAPED_STRING", 
			"WS"
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

	@Override
	public String getGrammarFileName() { return "Bank.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BankParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransactionsContext extends ParserRuleContext {
		public TerminalNode BT() { return getToken(BankParser.BT, 0); }
		public MovementsContext movements() {
			return getRuleContext(MovementsContext.class,0);
		}
		public TerminalNode ET() { return getToken(BankParser.ET, 0); }
		public TransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitTransactions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionsContext transactions() throws RecognitionException {
		TransactionsContext _localctx = new TransactionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_transactions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(BT);
			setState(19);
			movements();
			setState(20);
			match(ET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MovementsContext extends ParserRuleContext {
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public MovementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitMovements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovementsContext movements() throws RecognitionException {
		MovementsContext _localctx = new MovementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_movements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			move();
			setState(23);
			match(T__0);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(24);
				move();
				setState(25);
				match(T__0);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public DestAccountContext destAccount() {
			return getRuleContext(DestAccountContext.class,0);
		}
		public SignalContext signal() {
			return getRuleContext(SignalContext.class,0);
		}
		public AmmountContext ammount() {
			return getRuleContext(AmmountContext.class,0);
		}
		public OriginAccountContext originAccount() {
			return getRuleContext(OriginAccountContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			data();
			setState(33);
			match(T__1);
			setState(34);
			destAccount();
			setState(35);
			match(T__1);
			setState(36);
			signal();
			setState(37);
			match(T__1);
			setState(38);
			ammount();
			setState(39);
			match(T__1);
			setState(40);
			originAccount();
			setState(41);
			match(T__1);
			setState(42);
			description();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestAccountContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BankParser.ID, 0); }
		public DestAccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destAccount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitDestAccount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestAccountContext destAccount() throws RecognitionException {
		DestAccountContext _localctx = new DestAccountContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_destAccount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignalContext extends ParserRuleContext {
		public TerminalNode CREDIT() { return getToken(BankParser.CREDIT, 0); }
		public TerminalNode DEBIT() { return getToken(BankParser.DEBIT, 0); }
		public SignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalContext signal() throws RecognitionException {
		SignalContext _localctx = new SignalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==CREDIT || _la==DEBIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AmmountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BankParser.INT, 0); }
		public AmmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ammount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitAmmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmmountContext ammount() throws RecognitionException {
		AmmountContext _localctx = new AmmountContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ammount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OriginAccountContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BankParser.ID, 0); }
		public OriginAccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originAccount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitOriginAccount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginAccountContext originAccount() throws RecognitionException {
		OriginAccountContext _localctx = new OriginAccountContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_originAccount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode ESCAPED_STRING() { return getToken(BankParser.ESCAPED_STRING, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ESCAPED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BankParser.INT, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BankVisitor ) return ((BankVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001"+
		"\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0000\u0001\u0001\u0000\u0005\u00060\u0000\u0012\u0001"+
		"\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004 \u0001\u0000"+
		"\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000"+
		"\n0\u0001\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000\u000e4\u0001\u0000"+
		"\u0000\u0000\u00106\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0003\u0000"+
		"\u0000\u0013\u0014\u0003\u0002\u0001\u0000\u0014\u0015\u0005\u0004\u0000"+
		"\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0004\u0002"+
		"\u0000\u0017\u001d\u0005\u0001\u0000\u0000\u0018\u0019\u0003\u0004\u0002"+
		"\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001c\u0001\u0000\u0000"+
		"\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0010\b\u0000!\"\u0005\u0002\u0000\u0000\"#\u0003\u0006"+
		"\u0003\u0000#$\u0005\u0002\u0000\u0000$%\u0003\b\u0004\u0000%&\u0005\u0002"+
		"\u0000\u0000&\'\u0003\n\u0005\u0000\'(\u0005\u0002\u0000\u0000()\u0003"+
		"\f\u0006\u0000)*\u0005\u0002\u0000\u0000*+\u0003\u000e\u0007\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,-\u0005\b\u0000\u0000-\u0007\u0001\u0000\u0000"+
		"\u0000./\u0007\u0000\u0000\u0000/\t\u0001\u0000\u0000\u000001\u0005\u0007"+
		"\u0000\u00001\u000b\u0001\u0000\u0000\u000023\u0005\b\u0000\u00003\r\u0001"+
		"\u0000\u0000\u000045\u0005\t\u0000\u00005\u000f\u0001\u0000\u0000\u0000"+
		"67\u0005\u0007\u0000\u00007\u0011\u0001\u0000\u0000\u0000\u0001\u001d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}