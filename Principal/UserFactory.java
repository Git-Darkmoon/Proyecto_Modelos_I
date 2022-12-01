<<<<<<< HEAD

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
=======

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
>>>>>>> b50888fea96cf77d8a466d3b1d1bc427a8f44fc3
