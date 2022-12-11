package Menus;

import Products.Desserts;
import Products.Drinks;
import Products.Fast_food;
import java.util.Scanner;

/**
 * @author Darkmoon
 */

public class Products_Menu {
    
    String Order = "";
            
    Fast_food ffProfucts = new Fast_food();
    Drinks drinksProducts = new Drinks();
    Desserts dessertsProducts = new Desserts();
    
    public String showAll_Products() {
        
        System.out.println("Select by category your product: ");
        System.out.println("\n\t1. Fast food.\n\t2. Drinks.\n\t3. Desserts.\n");

        Scanner input = new Scanner(System.in);
        int category = input.nextInt();


        switch (category) {
            case 1:
                 Order += ffProfucts.productChoose();
                 break;
                 
            case 2:   
                Order += drinksProducts.productChoose();
                break;
            case 3:
                Order += dessertsProducts.productChoose();
                break;

            default:
                System.out.println("Not a valid category.");
                break;
        }
        return Order;

    }

}
