
package Products;

import java.util.Scanner;

/**
 * @author Darkmoon
 */

abstract class ProductCategory{
    Scanner input = new Scanner(System.in);
    Order myOrder = new Order();
    
    abstract void showProducts();
    abstract String productChoose();
    
    public Order getMyOrder(){
        return this.myOrder;
    }
}
