package Products;

import Pagos.Order;

/**
 * @author Darkmoon
 */
public class Product_ComboFeature extends Product_Decorator {

    public Product_ComboFeature(ProductCategory product) {
        super(product);
    }

    @Override
    public void showProducts() {
        System.out.println("We'll add to your order fries with paprika\n\tIf it's a dessert well hang you a little milkshake.\n\n");
        getProduct().showProducts();

    }

    @Override
    public Order productChoose() {
        showProducts();
        myOrder = getProduct().productChoose();
        myOrder.setPrice(myOrder.getPrice()+2.99);
        myOrder.setAditional(true);
        return myOrder;
    }
}
