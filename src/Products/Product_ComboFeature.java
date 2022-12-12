package Products;

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
    public String productChoose() {
        showProducts();
        
        System.out.print("\nQuantity (numbers only): ");
        byte quantity = input.nextByte();
        System.out.print("\nProduct: ");
        String product = input.next();
        
        myOrder.setOrder("You ordered: " + quantity + " " + product.toLowerCase() + " IN COMBO for $2.99 extra.(each)");

        return myOrder.getOrder();
        
    }

}
