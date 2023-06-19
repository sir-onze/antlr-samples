import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class TotalCalculatorVisitor extends BankBaseVisitor<Integer> implements BankVisitor<Integer> {
    @Override
    public Integer visitTransactions(BankParser.TransactionsContext ctx) {
        return visitMovements(ctx.movements());
    }

    @Override
    public Integer visitMovements(BankParser.MovementsContext ctx) {
        List<ParseTree> children = ctx.children;
        Integer r = 0;
        for (ParseTree child : children) {
            // Only visit the move nodes and ignore the separator dots (Terminals)
            if (child.getChildCount() > 0) {
                r += visit(child);
            }
        }
        return r;
    }

    @Override
    public Integer visitMove(BankParser.MoveContext ctx) {
        List<ParseTree> children = ctx.children;
        String signal = children.get(4).getText();
        Integer ammount = visit(children.get(6));
        if (signal.equals("DEBIT")) {
            ammount = -ammount;
        }
        return ammount;
    }

    @Override
    public Integer visitAmmount(BankParser.AmmountContext ctx) {
        return Integer.parseInt(ctx.getText());
    }
}
