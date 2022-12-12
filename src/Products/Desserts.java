package Products;

/**
 * @author Darkmoon
 */
public class Desserts extends ProductCategory {

    @Override
    public void showProducts() {

        System.out.println("BUYING DESSERTS: \n");

        System.out.println("- Cheesecake\n- Creme Brulee\n- Tiramisu\n- Affogato\n- Vanilla Soufle");

    }

    @Override
    public String productChoose() {

        showProducts();
        askOrder();

        return myOrder.getOrder();

    }

}
