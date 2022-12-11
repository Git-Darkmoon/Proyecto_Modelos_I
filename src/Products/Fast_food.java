package Products;

/**
 * @author Darkmoon
 */

public class Fast_food extends ProductCategory{

    
    @Override
    public void showProducts() {
        
        System.out.println("BUYING FAST FOOD: \n");
        
        System.out.println("- Hamburguer\n- Hot Dog\n- Pizza\n- Burrito\n- Taco");
        
    }
    
    @Override
    public String productChoose() {
        showProducts();
        
        System.out.print("\nQuantity (numbers only): ");
        byte quantity = input.nextByte();
        System.out.print("\nProduct: ");
        String product = input.next();
        
        myOrder.setOrder(quantity + " " + product.toLowerCase());
        
        if(myOrder.getOrder() != null){
            return myOrder.getOrder();
        }
        
        return "";
    }

    
}
