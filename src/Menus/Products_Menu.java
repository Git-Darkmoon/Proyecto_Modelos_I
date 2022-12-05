package Menus;

import Products.Desserts;
import Products.Drinks;
import Products.Fast_food;
import Products.Order;
import java.util.Scanner;

/**
 * @author Darkmoon
 */

public class Products_Menu {

    public Order showAll_Products() {

        System.out.println("Select by category your product: ");
        System.out.println("\n\t1. Fast food.\n\t2. Drinks.\n\t3. Desserts.\n");

        Scanner input = new Scanner(System.in);
        int category = input.nextInt();

        switch (category) {
            case 1 -> {
                Fast_food ffProfucts = new Fast_food();
                ffProfucts.productChoose();
            }

            case 2 -> {
                Drinks drinksProducts = new Drinks();
                drinksProducts.productChoose();
                return drinksProducts.getMyOrder();
            }

            case 3 -> {
                Desserts dessertsProducts = new Desserts();
                dessertsProducts.productChoose();
            }

            default -> {
                System.out.println("Not a valid category.");
            }
        }
        return null;

    }

}
