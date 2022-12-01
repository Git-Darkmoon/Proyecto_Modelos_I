<<<<<<< HEAD

package Principal;

import java.util.Scanner;

/**
 * @author Estudiantes
 */

public class AppLauncher {
    
    public static void main(String[] args) {
        
        byte userCreation = 0;
        
        System.out.println("----------- WELCOME TO OUR APP ------------");
        System.out.println("Enter the desired option to access:\n1. Create User.\n2.Show products.\n3.Coming soon...\n\n\n");
        
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        switch (option) {
            
            case 1 -> {
                
                if (userCreation == 0) {
                
                    System.out.println("Do you want to be a Premium User for $7.99/month ? (yes/no)");
                    String isSuscribed = input.next();
                    
                    if (isSuscribed.toLowerCase().equals("yes")) {
                    
                    User newUser = UserFactory.crearUsuario(TipoUsuario.PREMIUM);
                    userCreation++;
                        
                    } else if (isSuscribed.toLowerCase().equals("no")) {
                        
                    User newUser = UserFactory.crearUsuario(TipoUsuario.NORMAL);
                    userCreation++;
                        
                    } else {
                        System.out.println("Not a valid input.");
                        System.exit(0);
                    }
                }
                
            }
            case 2 -> {
                
                if (userCreation != 0) {
                    
                    System.out.println("Products view.");
                    
                } else {
                    System.out.println("You must have a user to access this menu...");
                    System.exit(0);
                }
             
            }
                
            case 3 -> {
                
                if (userCreation != 0) {
                    
                    System.out.println("Another menu...");
                    
                } else {
                    System.out.println("You must have a user to access this menu...");
                    System.exit(0);
                }
             
            }
            default -> throw new AssertionError();
        }
        
    
    }
    
}
=======

package Principal;

import java.util.Scanner;

/**
 * @author Estudiantes
 */

public class AppLauncher {
    
    public static void main(String[] args) {
        
        byte userCreation = 0;
        
        System.out.println("----------- WELCOME TO OUR APP ------------");
        System.out.println("Enter the desired option to access:\n1. Create User.\n2.Show products.\n3.Coming soon...\n\n\n");
        
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        switch (option) {
            
            case 1 -> {
                
                if (userCreation == 0) {
                
                    System.out.println("Do you want to be a Premium User for $7.99/month ? (yes/no)");
                    String isSuscribed = input.next();
                    
                    if (isSuscribed.toLowerCase().equals("yes")) {
                    
                    User newUser = UserFactory.crearUsuario(TipoUsuario.PREMIUM);
                    userCreation++;
                        
                    } else if (isSuscribed.toLowerCase().equals("no")) {
                        
                    User newUser = UserFactory.crearUsuario(TipoUsuario.NORMAL);
                    userCreation++;
                        
                    } else {
                        System.out.println("Not a valid input.");
                        System.exit(0);
                    }
                }
                
            }
            case 2 -> {
                
                if (userCreation != 0) {
                    
                    System.out.println("Products view.");
                    
                } else {
                    System.out.println("You must have a user to access this menu...");
                    System.exit(0);
                }
             
            }
                
            case 3 -> {
                
                if (userCreation != 0) {
                    
                    System.out.println("Another menu...");
                    
                } else {
                    System.out.println("You must have a user to access this menu...");
                    System.exit(0);
                }
             
            }
            default -> throw new AssertionError();
        }
        
    
    }
    
}
>>>>>>> b50888fea96cf77d8a466d3b1d1bc427a8f44fc3
