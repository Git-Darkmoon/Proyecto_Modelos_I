package Products;

import Pagos.Order;

/**
 * @author Darkmoon
 */
public class Desserts extends ProductCategory {
    
    private final double CheesecakePrice = 3.40;
    private final double CremePrice = 2.60;
    private final double TiramisuPrice = 9.80;
    private final double AffogatoPrice = 8.56;
    private final double VanillaPrice = 5.60;

    @Override
    public void showProducts() {

        System.out.println("BUYING DESSERTS: \n");

        System.out.println("- 1. Cheesecake "+this.CheesecakePrice+"$"+
                         "\n- 2. Creme Brulee "+this.CremePrice+"$"+
                         "\n- 3. Tiramisu "+this.TiramisuPrice+"$"+
                         "\n- 4. Affogato "+this.AffogatoPrice+"$"+
                         "\n- 5. Vanilla Soufle "+this.VanillaPrice+"$");

    }

    @Override
    public Order productChoose() {
        showProducts();
        
        System.out.print("\nProduct: ");
        int product = input.nextInt();
        System.out.print("\nQuantity (numbers only): ");
        byte quantity = input.nextByte();

        switch(product){
            case 1 ->{
                setOrder(quantity,"Cheesecake",this.CheesecakePrice);
                break;
            }
            case 2 ->{
                setOrder(quantity,"Creme Brulee",this.CremePrice);
                break;
            }
            case 3->{
                setOrder(quantity,"Turamisu",this.TiramisuPrice);
                break;
            }
            case 4->{
                setOrder(quantity,"Affogatto",this.AffogatoPrice);
                break;
            }
            case 5->{
                setOrder(quantity,"Vainilla Sougle",this.VanillaPrice);
                break;
            }
        }
        return myOrder;

    }
}
