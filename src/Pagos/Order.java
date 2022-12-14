
package Pagos;

/**
 * @author Darkmoon
 */

public class Order{  
    
    private String Order;
    private int quantity;
    private double price;
    
    

    // Constructor
    public Order(String Order, int quantity, double price) {
      this.Order = Order;
      this.quantity = quantity;
      this.price = price;
    }
    
    
    public Order(){
        
    }

    public String getName() {
      return this.Order;
    }

    public void setName(String id) {
      this.Order = id;
    }

    public int getQuantity() {
      return this.quantity;
    }

    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }

    public double getPrice() {
      return this.price*this.quantity;
    }

    public void setPrice(double price) {
      this.price = price;
    }
    
}
    
