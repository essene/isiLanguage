// Generated from IsiLang.g4 by ANTLR 4.7.1
package br.com.isilanguage.parser;

    import br.com.isilanguage.exceptions.IsiSemanticException;
    import br.com.isilanguage.datastructures.IsiSymbolTable;
    import br.com.isilanguage.datastructures.IsiVariable;
    import br.com.isilanguage.datastructures.IsiSymbol;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ACH=10, FCH=11, OPREL=12, VIR=13, AP=14, FP=15, SC=16, OP=17, ATTR=18, 
		ID=19, NUMBER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ACH", "FCH", "OPREL", "VIR", "AP", "FP", "SC", "OP", "ATTR", "ID", "NUMBER", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", "'escreva'", 
		"'se'", "'senao'", "'while'", "'{'", "'}'", null, "','", "'('", "')'", 
		"';'", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ACH", "FCH", 
		"OPREL", "VIR", "AP", "FP", "SC", "OP", "ATTR", "ID", "NUMBER", "WS"
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


	    private int _type;
	    private String _varName;
	    private String _varValue;
	    private IsiSymbolTable symbolTable = new IsiSymbolTable();
	    private IsiSymbol symbol;
	    private IsiVariable variable;
	    private String _readID;
	    private String _writeID;
	    private String _exprContent;
	    private String _exprID;

	    public boolean isIDDeclared(String id){
	        return symbolTable.exists(id);
	    }

	    public void initializeVar(String id) {
	        if(isIDDeclared(id)){
	            IsiVariable var = symbolTable.get(id);
	            var.setInitialized(true);
	            symbolTable.replace(id, var);
	        }
	    }

	    public boolean isVarInitialized(String id) {
	        if(isIDDeclared(id)){
	            return symbolTable.get(id).isInitialized();
	        }
	        return false;
	     }



	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rv\n\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\7\24"+
		"\u0086\n\24\f\24\16\24\u0089\13\24\3\25\6\25\u008c\n\25\r\25\16\25\u008d"+
		"\3\25\3\25\6\25\u0092\n\25\r\25\16\25\u0093\5\25\u0096\n\25\3\26\3\26"+
		"\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\b\4\2>>@@\5\2,-//\61"+
		"\61\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a2\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\66\3\2\2\2\7?\3\2\2"+
		"\2\tF\3\2\2\2\13L\3\2\2\2\rQ\3\2\2\2\17Y\3\2\2\2\21\\\3\2\2\2\23b\3\2"+
		"\2\2\25h\3\2\2\2\27j\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3"+
		"\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u008b\3"+
		"\2\2\2+\u0097\3\2\2\2-.\7r\2\2./\7t\2\2/\60\7q\2\2\60\61\7i\2\2\61\62"+
		"\7t\2\2\62\63\7c\2\2\63\64\7o\2\2\64\65\7c\2\2\65\4\3\2\2\2\66\67\7h\2"+
		"\2\678\7k\2\289\7o\2\29:\7r\2\2:;\7t\2\2;<\7q\2\2<=\7i\2\2=>\7=\2\2>\6"+
		"\3\2\2\2?@\7p\2\2@A\7w\2\2AB\7o\2\2BC\7g\2\2CD\7t\2\2DE\7q\2\2E\b\3\2"+
		"\2\2FG\7v\2\2GH\7g\2\2HI\7z\2\2IJ\7v\2\2JK\7q\2\2K\n\3\2\2\2LM\7n\2\2"+
		"MN\7g\2\2NO\7k\2\2OP\7c\2\2P\f\3\2\2\2QR\7g\2\2RS\7u\2\2ST\7e\2\2TU\7"+
		"t\2\2UV\7g\2\2VW\7x\2\2WX\7c\2\2X\16\3\2\2\2YZ\7u\2\2Z[\7g\2\2[\20\3\2"+
		"\2\2\\]\7u\2\2]^\7g\2\2^_\7p\2\2_`\7c\2\2`a\7q\2\2a\22\3\2\2\2bc\7y\2"+
		"\2cd\7j\2\2de\7k\2\2ef\7n\2\2fg\7g\2\2g\24\3\2\2\2hi\7}\2\2i\26\3\2\2"+
		"\2jk\7\177\2\2k\30\3\2\2\2lv\t\2\2\2mn\7@\2\2nv\7?\2\2op\7>\2\2pv\7?\2"+
		"\2qr\7?\2\2rv\7?\2\2st\7#\2\2tv\7?\2\2ul\3\2\2\2um\3\2\2\2uo\3\2\2\2u"+
		"q\3\2\2\2us\3\2\2\2v\32\3\2\2\2wx\7.\2\2x\34\3\2\2\2yz\7*\2\2z\36\3\2"+
		"\2\2{|\7+\2\2| \3\2\2\2}~\7=\2\2~\"\3\2\2\2\177\u0080\t\3\2\2\u0080$\3"+
		"\2\2\2\u0081\u0082\7?\2\2\u0082&\3\2\2\2\u0083\u0087\t\4\2\2\u0084\u0086"+
		"\t\5\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088(\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\t\6\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0091\7\60\2\2\u0090\u0092\t\6\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"*\3\2\2\2\u0097\u0098\t\7\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\26\2\2"+
		"\u009a,\3\2\2\2\t\2u\u0085\u0087\u008d\u0093\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}