import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        CreditCard amex = new CreditCard("American Exrpess", 18.4, 402);
        //System.out.println(amex);
        
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> card = new ArrayList<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();

            aprs.add(apr);

            double balance = scan.nextDouble();

            //Could do it in 2 steps by making a CreditCard variable then adding it
            card.add(new CreditCard(name, apr, balance));

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            /*
            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
            */
        }

        Collections.sort(card, Collections.reverseOrder());
        for(CreditCard x : card)
        {
            System.out.println(x);
        }

        Collections.sort(aprs, Collections.reverseOrder());

        System.out.println(aprs);

    }
}
