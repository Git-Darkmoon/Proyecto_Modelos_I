
package Principal;

/**
 * @author Darkmoon
 */

public class PremiumUser implements User {

    @Override
    public void makeOrder() {
        System.out.println("For being premium, your order will have top priority !!");
    }
    
}

