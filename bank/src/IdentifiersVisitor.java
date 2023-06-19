import models.Account;
import models.Transaction;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IdentifiersVisitor extends BankBaseVisitor<Object> implements BankVisitor<Object> {

    @Override
    public HashMap<String, Account> visitTransactions(BankParser.TransactionsContext ctx) {
        return visitMovements(ctx.movements());
    }

    @Override
    public HashMap<String, Account> visitMovements(BankParser.MovementsContext ctx) {
        HashMap<String, Account> accountsTransactions = new HashMap<>();
        List<ParseTree> treeChildren = ctx.children;
        for (ParseTree child : treeChildren) {
            // Ignore the terminals dot
            if (child.getChildCount() > 0) {
                Account returnedAccount = (Account) visit(child);
                // The update is needed in case we already have it in the map
                if (mapContainsKey(accountsTransactions, returnedAccount.getId())) {
                    Account currentAccount = accountsTransactions.get(returnedAccount.getId());
                    List<Transaction> transactions = currentAccount.getTransaction();

                    transactions.add(returnedAccount.getTransaction().get(0)); // Not perfect because the object that comes from below only has one transaction
                    currentAccount.setTransaction(transactions);

                    Integer totalValue = currentAccount.getTotalValue();
                    totalValue += returnedAccount.getTotalValue();
                    currentAccount.setTotalValue(totalValue);

                    accountsTransactions.put(currentAccount.getId(), currentAccount);
                }
                // Otherwise we just add it to the map
                else {
                    accountsTransactions.put(returnedAccount.getId(), returnedAccount);
                }
            }
        }
        return accountsTransactions;
    }

    @Override
    public Account visitMove(BankParser.MoveContext ctx) {
        String destAccount = ctx.children.get(2).getText();
        String originAccount = ctx.children.get(8).getText();
        String signal = ctx.children.get(4).getText();
        Integer ammount = (Integer) visit(ctx.children.get(6));

        if (signal.equals("DEBIT")) {
            ammount = -ammount;
        }
        Transaction transaction = new Transaction(ammount, originAccount);
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction);
        Account account = new Account(destAccount, transactions, ammount);
        return account;
    }

    @Override
    public Integer visitAmmount(BankParser.AmmountContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    public Boolean mapContainsKey(HashMap<String, Account> map, String key) {
        return map.containsKey(key);
    }
}
