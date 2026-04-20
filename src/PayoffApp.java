import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println();
        CreditCard amex = new CreditCard("American Express", 18.4, 402);
        System.out.println(amex);
        //System.out.println();

        List<Double> aprs = new ArrayList<Double>();
        List<CreditCard> cards = new ArrayList<CreditCard>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();

            aprs.add(apr);

            double balance = scan.nextDouble();

            cards.add(new CreditCard(name, apr, balance));

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Collections.reverseOrder());
        //Collections.sort(cards);

        System.out.println(aprs);
        System.out.println(cards);
    }
}
