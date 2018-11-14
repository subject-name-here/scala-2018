// Generated from /home/subject/Documents/alternative/scala-2018/src/main/antlr4/Exp.g4 by ANTLR 4.7
package ru.spbau.jvm.scala;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Number=3, WS=4, PLUS=5, MINUS=6, MULTIPLY=7, DIVIDE=8, 
		MOD=9, LESS=10, LESS_EQUAL=11, GREATER_EQUAL=12, GREATER=13, EQUAL=14, 
		NOT_EQUAL=15, AND=16, OR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Number", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
		"MOD", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "GREATER", "EQUAL", "NOT_EQUAL", 
		"AND", "OR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
		"'<='", "'>='", "'>'", "'=='", "'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Number", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
		"MOD", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "GREATER", "EQUAL", "NOT_EQUAL", 
		"AND", "OR"
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


	public ExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Exp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\5\4+\n\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\3\5\2\13\f\17\17"+
		"\"\"\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13:\3\2"+
		"\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3"+
		"\2\2\2\31I\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37Q\3\2\2\2!T\3\2\2\2#W\3\2"+
		"\2\2%&\7*\2\2&\4\3\2\2\2\'(\7+\2\2(\6\3\2\2\2)+\7/\2\2*)\3\2\2\2*+\3\2"+
		"\2\2+,\3\2\2\2,\60\4\63;\2-/\4\62;\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\65\3\2\2\2\62\60\3\2\2\2\63\65\7\62\2\2\64*\3\2\2\2"+
		"\64\63\3\2\2\2\65\b\3\2\2\2\66\67\t\2\2\2\678\3\2\2\289\b\5\2\29\n\3\2"+
		"\2\2:;\7-\2\2;\f\3\2\2\2<=\7/\2\2=\16\3\2\2\2>?\7,\2\2?\20\3\2\2\2@A\7"+
		"\61\2\2A\22\3\2\2\2BC\7\'\2\2C\24\3\2\2\2DE\7>\2\2E\26\3\2\2\2FG\7>\2"+
		"\2GH\7?\2\2H\30\3\2\2\2IJ\7@\2\2JK\7?\2\2K\32\3\2\2\2LM\7@\2\2M\34\3\2"+
		"\2\2NO\7?\2\2OP\7?\2\2P\36\3\2\2\2QR\7#\2\2RS\7?\2\2S \3\2\2\2TU\7(\2"+
		"\2UV\7(\2\2V\"\3\2\2\2WX\7~\2\2XY\7~\2\2Y$\3\2\2\2\6\2*\60\64\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}