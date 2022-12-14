package Menus;

import Pagos.Order;
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

    Order myOrder;

    Fast_food ffProfucts = new Fast_food();
    Drinks drinksProducts = new Drinks();
    Desserts dessertsProducts = new Desserts();

    public Order validateCombo(ProductCategory product) {

        System.out.println("Do you want it in combo for $2.99 additional ? (yes/no)");
        String combo = input.next();

        if (combo.toLowerCase().equals("yes")) {
            ProductCategory product_InCombo = new Product_ComboFeature(product);

            myOrder = product_InCombo.productChoose();

        } else {
            myOrder = product.productChoose();
        }
      return myOrder;
    }

    public Order showAll_Products() {

        System.out.println("Select by category your product: ");
        System.out.println("\n\t1. Fast food.\n\t2. Drinks.\n\t3. Desserts.\n");

        int category = input.nextInt();

        switch (category) {
            case 1:
                myOrder = validateCombo(ffProfucts);
                break;

            case 2:
                myOrder = validateCombo(drinksProducts);
                break;
            case 3:
                myOrder = validateCombo(dessertsProducts);
                break;

            default:
                System.out.println("Not a valid category.");
                break;
        }
        return myOrder;

    }

}
