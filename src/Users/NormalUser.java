

package Users;

/**
 * @author Darkmoon
 */

public class NormalUser implements User {

    @Override
    public void makeOrder() {
        System.out.println("Order queued. We´ll notify you when we start with your order !");
    }
    
}

