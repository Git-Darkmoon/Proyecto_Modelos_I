package Products;

import Pagos.Order;

/**
 * @author Darkmoon
 */
public class Drinks extends ProductCategory {
    
    private final double WaterPrice = 1.85;
    private final double CoconutPrice = 2.05;
    private final double CocaColaPrice = 0.93;
    private final double SodaPrice = 1.50;
    private final double MilkPrice = 2.30;

    @Override
    public void showProducts() {

        System.out.println("BUYING DRINKS: \n");
        System.out.println("1. Water "+this.WaterPrice+
                        "\n 2. Coconut Lemonade "+this.CoconutPrice+"$"+
                       "\n- 3. Coca Cola "+this.CocaColaPrice+"$"+
                       "\n- 4. Soda "+this.SodaPrice+"$"+
                       "\n- 5. Milkshake "+this.MilkPrice+"$");
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
                setOrder(quantity,"Water",WaterPrice);
                break;
            }
            case 2 ->{
                setOrder(quantity,"Coconut Lemonade",CoconutPrice);
                break;
            }
            case 3->{
                setOrder(quantity,"Coca Cola",CocaColaPrice);
                break;
            }
            case 4->{
                setOrder(quantity,"Soda",SodaPrice);
                break;
            }
            case 5->{
                setOrder(quantity,"Milkshake",MilkPrice);
                break;
            }
        }
        return myOrder;

    }
}
