package Products;

/**
 * @author Darkmoon
 */
public abstract class Product_Decorator extends ProductCategory {

    private ProductCategory product;

    public Product_Decorator(ProductCategory product) {
        this.product = product;
    }

    public ProductCategory getProduct() {
        return product;
    }
}
