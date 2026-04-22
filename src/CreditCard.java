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

    @Override
    public String toString() {
        return "CreditCard [name=" + name + ", apr=" + apr + ", balance=" + balance + "]";
    }

    @Override
    public int compareTo(CreditCard other) {
        // if (apr < other.apr) return -1;
        // if (apr == other.apr) return 0;
        // else return 1;

        //return apr - other.apr;

        return Double.valueOf(apr).compareTo(other.apr);
    }
}