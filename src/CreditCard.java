public class CreditCard implements Comparable<CreditCard>{
    private String name; 
    private double apr; 
    private double balance;

    public CreditCard(String name, double apr, double balance) {
        this.name = name; 
        this.apr = apr; 
        this.balance = balance; 
    }

    public String getName() {
        return this.name;
    }

    public double getApr() { 
        return this.apr; 
    }

    public double getBalance() {
        return this.balance; 
    }

    @Override
    public String toString() {
        return "CreditCard [name=" + name + ", apr=" + apr + ", balance=" + balance + "]";
    }

    public int compareTo(CreditCard other) {
        return Double.valueOf(apr).compareTo(other.apr); 
    }
}