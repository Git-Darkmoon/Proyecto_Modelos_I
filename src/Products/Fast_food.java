<<<<<<< HEAD
package Products;

import Pagos.Order;

/**
 * @author Darkmoon
 */

public class Fast_food extends ProductCategory{
    
    private final double HamburguerPrice = 12.50;
    private final double HotDogPrice = 10.50;
    private final double PizzaPrice = 8.60;
    private final double BurritoPrice = 9.59;
    private final double TacoPrice = 6.99;

    
    @Override
    public void showProducts() {
        
        System.out.println("BUYING FAST FOOD: \n");
        
        System.out.println("- 1. Hamburguer "+this.HamburguerPrice+"$"+
                         "\n- 2. Hot Dog "+this.HotDogPrice+"$"+
                         "\n- 3. Pizza "+this.PizzaPrice+"$"+
                         "\n- 4. Burrito "+this.BurritoPrice+"$"+
                         "\n- 5. Taco "+this.TacoPrice+"$");
        
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
                setOrder(quantity,"Hamburguer",HamburguerPrice);
                break;
            }
            case 2 ->{
                setOrder(quantity,"Hot Dog",HotDogPrice);
                break;
            }
            case 3->{
                setOrder(quantity,"Pizza",PizzaPrice);
                break;
            }
            case 4->{
                setOrder(quantity,"Burrito",BurritoPrice);
                break;
            }
            case 5->{
                setOrder(quantity,"Taco",TacoPrice);
                break;
            }
        }

        
        return myOrder;

   } 
}
=======

package Products;

import Pagos.Order;

/**
 * @author Darkmoon
 */

public class Fast_food extends ProductCategory{
    
    private final double HamburguerPrice = 12.50;
    private final double HotDogPrice = 10.50;
    private final double PizzaPrice = 8.60;
    private final double BurritoPrice = 9.59;
    private final double TacoPrice = 6.99;

    
    @Override
    public void showProducts() {
        
        System.out.println("BUYING FAST FOOD: \n");
        
        System.out.println("- 1. Hamburguer "+this.HamburguerPrice+"$"+
                         "\n- 2. Hot Dog "+this.HotDogPrice+"$"+
                         "\n- 3. Pizza "+this.PizzaPrice+"$"+
                         "\n- 4. Burrito "+this.BurritoPrice+"$"+
                         "\n- 5. Taco "+this.TacoPrice+"$");
        
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
                setOrder(quantity,"Hamburguer",HamburguerPrice);
                break;
            }
            case 2 ->{
                setOrder(quantity,"Hot Dog",HotDogPrice);
                break;
            }
            case 3->{
                setOrder(quantity,"Pizza",PizzaPrice);
                break;
            }
            case 4->{
                setOrder(quantity,"Burrito",BurritoPrice);
                break;
            }
            case 5->{
                setOrder(quantity,"Taco",TacoPrice);
                break;
            }
        }

        
        return myOrder;

   } 
}

>>>>>>> 542417be5900ad5967ba7e2dadbdf0f5c2708ea4
