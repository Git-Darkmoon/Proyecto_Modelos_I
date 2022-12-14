<<<<<<< HEAD

package Products;

import Pagos.Order;
import java.util.Scanner;

/**
 * @author Darkmoon
 */

public abstract class ProductCategory{
    Scanner input = new Scanner(System.in);
    Order myOrder = new Order();
    
    public abstract void showProducts() ;
    public abstract Order productChoose();
    
    
    public void  setOrder(byte quantity, String Name, double Price){
        myOrder.setQuantity(quantity);
        myOrder.setName(Name);
        myOrder.setPrice(Price);
    }
}
=======


package Products;

import Pagos.Order;
import java.util.Scanner;

/**
 * @author Darkmoon
 */

public abstract class ProductCategory{
    Scanner input = new Scanner(System.in);
    Order myOrder = new Order();
    
    public abstract void showProducts() ;
    public abstract Order productChoose();
    
    
    public void  setOrder(byte quantity, String Name, double Price){
        myOrder.setQuantity(quantity);
        myOrder.setName(Name);
        myOrder.setPrice(Price);
    }
}

>>>>>>> 542417be5900ad5967ba7e2dadbdf0f5c2708ea4
