public class CreditCard {
    private String name;
    private double apr;
    private double balance;

    @Override
    public String toString() {
        return "CreditCard [name=" + name + ", apr=" + apr + ", balance=" + balance + "]";
    }
    
    public CreditCard(String name, double apr, double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
}