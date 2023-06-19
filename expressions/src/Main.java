import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {

        InterpreterLexer lexer = new InterpreterLexer(CharStreams.fromString("1+5*2*2+1"));
        InterpreterParser parser = new InterpreterParser(new CommonTokenStream(lexer));
        ExpressionBaseListener listener = new ExpressionBaseListener();
        //parser.addParseListener(listener);
        ParseTree tree = parser.start();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        System.out.println("My parser has executed Order 66");

    }
}