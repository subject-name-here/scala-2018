// Generated from /home/subject/Documents/alternative/scala-2018/src/main/antlr4/Exp.g4 by ANTLR 4.7
package ru.spbau.jvm.scala;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Number=16, 
		WS=17;
	public static final int
		RULE_eval = 0, RULE_orExp = 1, RULE_andExp = 2, RULE_equalExp = 3, RULE_greaterLessExp = 4, 
		RULE_additionExp = 5, RULE_multiplyExp = 6, RULE_atomExp = 7;
	public static final String[] ruleNames = {
		"eval", "orExp", "andExp", "equalExp", "greaterLessExp", "additionExp", 
		"multiplyExp", "atomExp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Number", "WS"
	};
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
	public String getGrammarFileName() { return "Exp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public OrExpContext exp;
		public TerminalNode EOF() { return getToken(ExpParser.EOF, 0); }
		public OrExpContext orExp() {
			return getRuleContext(OrExpContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((EvalContext)_localctx).exp = orExp();
			setState(17);
			match(EOF);
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

	public static class OrExpContext extends ParserRuleContext {
		public AndExpContext m1;
		public AndExpContext m2;
		public List<AndExpContext> andExp() {
			return getRuleContexts(AndExpContext.class);
		}
		public AndExpContext andExp(int i) {
			return getRuleContext(AndExpContext.class,i);
		}
		public OrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpContext orExp() throws RecognitionException {
		OrExpContext _localctx = new OrExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_orExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((OrExpContext)_localctx).m1 = andExp();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				match(T__0);
				setState(21);
				((OrExpContext)_localctx).m2 = andExp();
				}
				}
				setState(26);
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

	public static class AndExpContext extends ParserRuleContext {
		public EqualExpContext m1;
		public EqualExpContext m2;
		public List<EqualExpContext> equalExp() {
			return getRuleContexts(EqualExpContext.class);
		}
		public EqualExpContext equalExp(int i) {
			return getRuleContext(EqualExpContext.class,i);
		}
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpContext andExp() throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_andExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((AndExpContext)_localctx).m1 = equalExp();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(28);
				match(T__1);
				setState(29);
				((AndExpContext)_localctx).m2 = equalExp();
				}
				}
				setState(34);
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

	public static class EqualExpContext extends ParserRuleContext {
		public GreaterLessExpContext m1;
		public GreaterLessExpContext m2;
		public List<GreaterLessExpContext> greaterLessExp() {
			return getRuleContexts(GreaterLessExpContext.class);
		}
		public GreaterLessExpContext greaterLessExp(int i) {
			return getRuleContext(GreaterLessExpContext.class,i);
		}
		public EqualExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterEqualExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitEqualExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitEqualExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpContext equalExp() throws RecognitionException {
		EqualExpContext _localctx = new EqualExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_equalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((EqualExpContext)_localctx).m1 = greaterLessExp();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(36);
					match(T__2);
					setState(37);
					((EqualExpContext)_localctx).m2 = greaterLessExp();
					}
					break;
				case T__3:
					{
					setState(38);
					match(T__3);
					setState(39);
					((EqualExpContext)_localctx).m2 = greaterLessExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
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

	public static class GreaterLessExpContext extends ParserRuleContext {
		public AdditionExpContext m1;
		public AdditionExpContext m2;
		public List<AdditionExpContext> additionExp() {
			return getRuleContexts(AdditionExpContext.class);
		}
		public AdditionExpContext additionExp(int i) {
			return getRuleContext(AdditionExpContext.class,i);
		}
		public GreaterLessExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterLessExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterGreaterLessExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitGreaterLessExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitGreaterLessExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterLessExpContext greaterLessExp() throws RecognitionException {
		GreaterLessExpContext _localctx = new GreaterLessExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_greaterLessExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((GreaterLessExpContext)_localctx).m1 = additionExp();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(46);
					match(T__4);
					setState(47);
					((GreaterLessExpContext)_localctx).m2 = additionExp();
					}
					break;
				case T__5:
					{
					setState(48);
					match(T__5);
					setState(49);
					((GreaterLessExpContext)_localctx).m2 = additionExp();
					}
					break;
				case T__6:
					{
					setState(50);
					match(T__6);
					setState(51);
					((GreaterLessExpContext)_localctx).m2 = additionExp();
					}
					break;
				case T__7:
					{
					setState(52);
					match(T__7);
					setState(53);
					((GreaterLessExpContext)_localctx).m2 = additionExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
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

	public static class AdditionExpContext extends ParserRuleContext {
		public MultiplyExpContext m1;
		public MultiplyExpContext m2;
		public List<MultiplyExpContext> multiplyExp() {
			return getRuleContexts(MultiplyExpContext.class);
		}
		public MultiplyExpContext multiplyExp(int i) {
			return getRuleContext(MultiplyExpContext.class,i);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAdditionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitAdditionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_additionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((AdditionExpContext)_localctx).m1 = multiplyExp();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(60);
					match(T__8);
					setState(61);
					((AdditionExpContext)_localctx).m2 = multiplyExp();
					}
					break;
				case T__9:
					{
					setState(62);
					match(T__9);
					setState(63);
					((AdditionExpContext)_localctx).m2 = multiplyExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
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

	public static class MultiplyExpContext extends ParserRuleContext {
		public AtomExpContext m1;
		public AtomExpContext m2;
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitMultiplyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitMultiplyExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((MultiplyExpContext)_localctx).m1 = atomExp();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(70);
					match(T__10);
					setState(71);
					((MultiplyExpContext)_localctx).m2 = atomExp();
					}
					break;
				case T__11:
					{
					setState(72);
					match(T__11);
					setState(73);
					((MultiplyExpContext)_localctx).m2 = atomExp();
					}
					break;
				case T__12:
					{
					setState(74);
					match(T__12);
					setState(75);
					((MultiplyExpContext)_localctx).m2 = atomExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(80);
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

	public static class AtomExpContext extends ParserRuleContext {
		public Token n;
		public OrExpContext exp;
		public TerminalNode Number() { return getToken(ExpParser.Number, 0); }
		public OrExpContext orExp() {
			return getRuleContext(OrExpContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomExp);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((AtomExpContext)_localctx).n = match(Number);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__13);
				setState(83);
				((AtomExpContext)_localctx).exp = orExp();
				setState(84);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\7\3\7\3\7\3\7\3\7\7\7C\n\7\f\7\16\7"+
		"F\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\5\tY\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2`\2\22\3\2\2\2\4\25"+
		"\3\2\2\2\6\35\3\2\2\2\b%\3\2\2\2\n/\3\2\2\2\f=\3\2\2\2\16G\3\2\2\2\20"+
		"X\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\32\5\6\4\2\26\27"+
		"\7\3\2\2\27\31\5\6\4\2\30\26\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\"\5\b\5\2\36\37\7\4\2\2\37!\5\b"+
		"\5\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$\"\3\2\2\2"+
		"%,\5\n\6\2&\'\7\5\2\2\'+\5\n\6\2()\7\6\2\2)+\5\n\6\2*&\3\2\2\2*(\3\2\2"+
		"\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\t\3\2\2\2.,\3\2\2\2/:\5\f\7\2\60\61"+
		"\7\7\2\2\619\5\f\7\2\62\63\7\b\2\2\639\5\f\7\2\64\65\7\t\2\2\659\5\f\7"+
		"\2\66\67\7\n\2\2\679\5\f\7\28\60\3\2\2\28\62\3\2\2\28\64\3\2\2\28\66\3"+
		"\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<:\3\2\2\2=D\5\16\b\2"+
		">?\7\13\2\2?C\5\16\b\2@A\7\f\2\2AC\5\16\b\2B>\3\2\2\2B@\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FD\3\2\2\2GP\5\20\t\2HI\7\r\2\2IO\5"+
		"\20\t\2JK\7\16\2\2KO\5\20\t\2LM\7\17\2\2MO\5\20\t\2NH\3\2\2\2NJ\3\2\2"+
		"\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\17\3\2\2\2RP\3\2\2\2SY\7\22"+
		"\2\2TU\7\20\2\2UV\5\4\3\2VW\7\21\2\2WY\3\2\2\2XS\3\2\2\2XT\3\2\2\2Y\21"+
		"\3\2\2\2\r\32\"*,8:BDNPX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}