package Products;

/**
 * @author Darkmoon
 */
public class Drinks extends ProductCategory {

    @Override
    public void showProducts() {

        System.out.println("BUYING DRINKS: \n");

        System.out.println("- Water\n- Coconut Lemonade\n- Coca Cola\n- Soda\n- Milkshake");

    }

    @Override
    public String productChoose() {
        showProducts();

        System.out.print("\nQuantity (numbers only): ");
        byte quantity = input.nextByte();
        System.out.print("\nProduct: ");
        String product = input.next();

        myOrder.setOrder(quantity + " " + product.toLowerCase());

        return myOrder.getOrder();
}
