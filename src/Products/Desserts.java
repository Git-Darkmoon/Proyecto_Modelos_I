package Products;

/**
 * @author Darkmoon
 */
public class Desserts implements ProductCategory {

    Order myOrder = new Order();

    @Override
    public void showProducts() {

        System.out.println("BUYING DESSERTS: \n");

        System.out.println("- Cheesecake\n- Creme Brulee\n- Tiramisu\n- Affogato\n- Vanilla Soufle");

    }

    @Override
    public void productChoose() {
        showProducts();

        System.out.print("\nQuantity (numbers only): ");
        byte quantity = input.nextByte();
        System.out.print("\nProduct: ");
        String product = input.next();

        myOrder.setOrder(quantity + " " + product.toLowerCase());

    }

}
