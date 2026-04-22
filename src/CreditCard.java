public class CreditCard implements Comparable<CreditCard>{

    private String name;
    private double APR;
    private double bal;

    /**************Constructors**************/
    /**
     * This constructor sets all 3 values (name, APR, balance),
     * and sets them into custom values.
     * 
     * @param name The name of the company connected to the card.
     * @param APR The percentage of intrest that builds up over time.
     * @param bal The current balance of the credit card.
     */
    public CreditCard(String name, double APR, double bal)
    {
        this.name = name;
        this.APR = APR;
        this.bal = bal;
    }

    /**************Methods**************/
    /**
     * Returns the name of the company connected to the card.
     * @return The name of the company connected to the card.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the percentage of intrest that builds up over time.
     * @return The card's APR value.
     */
    public double getAPR()
    {
        return APR;
    }

    /**
     * Returns the current balance of the credit card.
     * @return The current balance of the credit card.
     */
    public double getBalance()
    {
        return bal;
    }

    /**
     * Returns the class (credit card info) in a string format.
     * @return The string format of our class.
     */
    @Override
    public String toString()
    {
        return name + ": APR: " + APR + "% Balance: $" + bal;
    }
 
    public int compareTo(CreditCard other)
    {
        //if(this.APR < other.APR){return -1;}
        //else if(this.APR > other.APR){return 1;}
        //return 0;
        return Double.valueOf(APR).compareTo(Double.valueOf(other.APR));
    }
    
}