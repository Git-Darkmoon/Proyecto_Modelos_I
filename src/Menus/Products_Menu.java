package Menus;

import Products.Desserts;
import Products.Drinks;
import Products.Fast_food;
import Products.ProductCategory;
import Products.Product_ComboFeature;
import java.util.Scanner;

/**
 * @author Darkmoon
 */
public class Products_Menu {

    Scanner input = new Scanner(System.in);

    String Order = "";

    Fast_food ffProfucts = new Fast_food();
    Drinks drinksProducts = new Drinks();
    Desserts dessertsProducts = new Desserts();

    public void validateCombo(ProductCategory product) {

        System.out.println("Do you want it in combo for $2.99 additional ? (yes/no)");
        String combo = input.next();

        if (combo.toLowerCase().equals("yes")) {
            ProductCategory product_InCombo = new Product_ComboFeature(product);

            Order += product_InCombo.productChoose();

        } else {
            Order += product.productChoose();
        }

    }

    public String showAll_Products() {

        System.out.println("Select by category your product: ");
        System.out.println("\n\t1. Fast food.\n\t2. Drinks.\n\t3. Desserts.\n");

        int category = input.nextInt();

        switch (category) {
            case 1:

//                Order += ffProfucts.productChoose();
                validateCombo(ffProfucts);

                break;

            case 2:

//                Order += drinksProducts.productChoose();
                validateCombo(drinksProducts);

                break;
            case 3:

//                Order += dessertsProducts.productChoose();
                validateCombo(dessertsProducts);

                break;

            default:
                System.out.println("Not a valid category.");
                break;
        }
        return Order;

    }

}
