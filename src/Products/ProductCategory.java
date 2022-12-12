
package Products;

import java.util.Scanner;

/**
 * @author Darkmoon
 */

public abstract class ProductCategory{
    Scanner input = new Scanner(System.in);
    Order myOrder = new Order();
    
    public abstract void showProducts() ;
    public abstract String productChoose();
    
    public void askOrder () {
        System.out.print("\nQuantity (numbers only): ");
        byte quantity = input.nextByte();
        System.out.print("\nProduct: ");
        String product = input.next();
        
        myOrder.setOrder("You ordered: " + quantity + " " + product.toLowerCase());
    }
    
    public Order getMyOrder(){
        return this.myOrder;
    }
}
