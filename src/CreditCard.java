public class CreditCard implements Comparable<CreditCard> {
    private String name;
    private double apr;
    private double balance;

    public CreditCard(String name, double apr, double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getApr() {
        return apr;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CreditCard [name=" + name + ", apr=" + apr + ", balance=" + balance + "]";
    }




    public int compareTo(CreditCard other) { // this compared to some other credit card
        if(apr < other.apr) {
            return -1;
        }

        else if (apr == other.apr) {
            return 0;
        }

        else {
            return 1;
        }
    }
    
}