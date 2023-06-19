package models;

import java.util.List;

public class Account {
    private String id;

    public Account(String id, List<Transaction> transactions, Integer totalValue) {
        this.id = id;
        this.transactions = transactions;
        this.totalValue = totalValue;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTransaction(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", transactions=" + transactions +
                ", totalValue=" + totalValue +
                '}';
    }

    public void setTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
    }

    public String getId() {
        return id;
    }

    public List<Transaction> getTransaction() {
        return transactions;
    }

    public Integer getTotalValue() {
        return totalValue;
    }

    private List<Transaction> transactions;
    private Integer totalValue;

}
