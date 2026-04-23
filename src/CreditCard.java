public class CreditCard implements Comparable<CreditCard>{
    private String name;
    private double apr;
    private double balance; //when using money do not use double becasue of rounding error

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

    @Override
    public int compareTo(CreditCard other) {
        /*if(apr < other.apr) return -1;
        if(apr==other.apr) return 0;
        return 1; -the most simplist way to do a compareTo method*/ 

        //return apr - other.apr; -if this was converted to int we would be able to use this

        return Double.valueOf(apr).compareTo(other.apr); //when using a capital D in double it's no longer a primitive type 
        
    }
    
}