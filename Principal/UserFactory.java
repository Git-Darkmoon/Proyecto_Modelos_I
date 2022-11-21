
package Principal;

/**
 * @author Estudiantes
 */

public class UserFactory {

    public static User crearUsuario(TipoUsuario tipoUsuario){
        
        return switch (tipoUsuario) {
            
            case PREMIUM -> new PremiumUser();
            default -> new NormalUser();
        };
        
    }
    
}
