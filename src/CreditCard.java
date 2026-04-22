public class CreditCard implements Comparable<CreditCard>{
    private String name;
    private double apr;
    private double balance;
    
    public CreditCard(String name, double apr, double balance) {
        //this to distinguish from the argument being passed in
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getApr() {
        return apr;
    }
    public double getBalance() {
        return balance;
    }

    public int compareTo(CreditCard other) {
        if(apr < other.apr) return -1;
        if(apr == other.apr) return 0;
        return 1;

        //return Double.valueOf(apr).compareTo(other.apr); //this functions the same
    }

    @Override //not required, but helps us spot where/whether or not the the method existed before?
    public String toString() {
        return "CreditCard [name=" + name + ", apr=" + apr + ", balance=" + balance + "]";
    }
}