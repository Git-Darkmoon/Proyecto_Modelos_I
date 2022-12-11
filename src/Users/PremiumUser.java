
package Users;

import java.util.Scanner;

/**
 * @author Darkmoon
 */

public class PremiumUser implements User {

    Scanner input = new Scanner(System.in);
    String option = "";
    
    
    @Override
    public void makeOrder() {
        System.out.println("\n\nFor being premium, your order will have top priority !!");
    
        System.out.println("How would you like to pay ?\nCredit card (c) or cash (m): ");
        
        option = input.nextLine();
        
        if (option.toLowerCase().equals("c")) {
            System.out.println("\tThanks for your purchase !\nPaying with credit card will give you benefits in the future.\n");
        } else if (option.toLowerCase().equals("m")) {
            System.out.println("\nThanks for your purchase !\nPrioritize changing to a credit card to gain benefits as premium user.");
        } else {
            System.out.println("Was not a valid input.\nOrder canceled.");
            System.exit(0);
        }
        
        
    }
    
}

