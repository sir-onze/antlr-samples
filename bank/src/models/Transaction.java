package models;

public class Transaction {
    private Integer value;
    private String origin;

    public Transaction(Integer value, String origin) {
        this.value = value;
        this.origin = origin;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "value=" + value +
                ", origin='" + origin + '\'' +
                '}';
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
}
