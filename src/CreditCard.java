public class CreditCard{
    private String name;
    private double apr;
    private double balance; 

    public CreditCard(String name, double apr, double balance){
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    public String getName(){return name;}

    @Override
    public String toString(){
        String aprString = String.format("%.2f%%", apr);
        String balanceString = String.format("$%.2f", balance);
        return name + ": " + "APR: " + aprString + " Balance: " + balanceString;
    }
}