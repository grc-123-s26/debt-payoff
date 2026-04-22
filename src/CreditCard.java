public class CreditCard implements Comparable<CreditCard> {
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

    public int compareTo(CreditCard other) {
        // if (this.apr < other.apr) {
        //     return -1;
        // } else if (this.apr == other.apr) {
        //     return 0;
        // } else {
        //     return 1;
        // }
        // or
        // if (this.apr < other.apr) {
        //     return -1;
        // }
        // if (this.apr == other.apr) {
        //     return 0;
        // }
        // return 1;
        // or
        //return apr - other.apr;
        //or
        return Double.valueOf(apr).compareTo(other.apr);
    }
}