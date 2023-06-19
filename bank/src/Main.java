import models.Account;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("src","accounts.txt")));
        BankLexer lexer = new BankLexer(CharStreams.fromString(content));
        BankParser parser = new BankParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.transactions();
        
        TotalCalculatorVisitor calculatorVisitor = new TotalCalculatorVisitor();
        IdentifiersVisitor identifiersVisitor = new IdentifiersVisitor();

        Integer r = calculatorVisitor.visit(tree);
        HashMap<String, Account> accounts = (HashMap<String, Account>) identifiersVisitor.visit(tree);

        System.out.println(r);
        System.out.println(accounts.toString());
    }
}