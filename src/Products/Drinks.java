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
        askOrder();

        return myOrder.getOrder();
    }
}
