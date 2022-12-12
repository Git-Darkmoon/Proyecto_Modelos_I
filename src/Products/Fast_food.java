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
        askOrder();

        return myOrder.getOrder();
    }

}
