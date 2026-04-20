public class CreditCard implements Comparable<CreditCard> {
    String name = ""; 
    double apr; 
    double balance;

    public CreditCard(String name, double apr, double balance) {
        this.name = name; 
        this.apr = apr; 
        this.balance = balance; 
    }

    public int compareTo(CreditCard other) {
        return 0; 
    }
}