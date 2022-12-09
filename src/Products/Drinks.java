package Products;

/**
 * @author Darkmoon
 */
public class Drinks implements ProductCategory {

    Order myOrder = new Order();

    @Override
    public void showProducts() {

        System.out.println("BUYING DRINKS: \n");

        System.out.println("- Water\n- Coconut Lemonade\n- Coca Cola\n- Soda\n- Milkshake");

    }

    @Override
    public void productChoose() {
        showProducts();

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
