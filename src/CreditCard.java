public class CreditCard implements Comparable<CreditCard> {

    private double apr;
    private double balance;
    private String name;

    public CreditCard(double apr, double balance, String name) {
        this.apr = apr;
        this.balance = balance;
        this.name = name;
    }

    @Override
    public int compareTo(CreditCard card) {
        /*
        if (card.getApr() < this.apr) {
            return 1;
        } else if (card.getApr() > this.apr) {
            return -1;
        }
        return 0;
        */
       return Double.valueOf(this.apr).compareTo(card.apr);
    }

    @Override
    public String toString() {
        return "CreditCard [apr=" + this.apr + ", balance=" + this.balance + ", name=" + this.name + "]";
    }

    public double getApr() {
        return this.apr;
    }
    
    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

}