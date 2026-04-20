public class CreditCard {
    private String name;
    private double apr;
    private double balance;

    public CreditCard(String name, double apr, double balance){
        //this is talking about "this credit card that is being made right now" if you're using the same variable name as the instance variable
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard Name: " + name + " APR: " + apr + ", Balance: " + balance ;
    }

    public String getName(){
        //since it is a private instance you need to make a get name so you can have access to it in teh payoff class 
        return this.name;
    }
    
}