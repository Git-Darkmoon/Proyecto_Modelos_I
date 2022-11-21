
package Principal;

/**
 * @author Darkmoon
 */

public class UserProxyHandler implements UserProxy {
    
    private boolean isSuscribed;

    public UserProxyHandler(boolean isLoggedIn) {
        this.isSuscribed = isLoggedIn;
    }
    
    @Override
    public User getUser() {
        User user;
        
        if (isSuscribed) {
            user = (User) new NormalUser();
        } else {
            user = (User) new PremiumUser();
        }
        return user;
    }
    
}
