package Menus;

import Products.Desserts;
import Products.Drinks;
import Products.Fast_food;
import Pagos.Order;
import Pagos.Orders;
import java.util.List;
import java.util.Scanner;

/**
 * @author Darkmoon
 */

public class Products_Menu {
    
    private  Order myOrder = new Order();
            
    private final Fast_food ffProfucts = new Fast_food();
    private final Drinks drinksProducts = new Drinks();
    private final Desserts dessertsProducts = new Desserts();
    
    public Order showAll_Products() {
        
        System.out.println("Select by category your product: ");
        System.out.println("\n\t1. Fast food.\n\t2. Drinks.\n\t3. Desserts.\n");

        Scanner input = new Scanner(System.in);
        int category = input.nextInt();


        switch (category) {
            case 1:
                 myOrder = ffProfucts.productChoose();
                 break;
                 
            case 2:   
                myOrder = drinksProducts.productChoose();
                break;
            case 3:
                myOrder =  dessertsProducts.productChoose();
                break;

            default:
                System.out.println("Not a valid category.");
                break;
        }
        
        return myOrder;

    }

}
