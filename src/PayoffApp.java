import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// alt + shift + o

public class PayoffApp {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        List<Double> aprs = new ArrayList<>(); 

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            aprs.add(apr); 

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
        Collections.sort(aprs, Collections.reverseOrder());

        System.out.println(aprs); 
    }
}
