

package Users;

/**
 * @author Darkmoon
 */

public class NormalUser implements User {

    @Override
    public void makeOrder() {
        System.out.println("\n\nAs a normal user you only can pay with CASH...");
        System.out.println("\n\tPayment processed and order queued. We´ll notify you when we start with your order !");
    }
    
}

