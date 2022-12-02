package Principal;

import java.util.Scanner;

/**
 * @author Darkmoon
 */
public class Menu {

    byte userCreation = 0;
    boolean continuing = true;

    public boolean isContinuing() {
        return continuing;
    }

    public void selectMenu() {
        
        System.out.println("----------- WELCOME TO OUR APP ------------");
        System.out.println("Enter the desired option to access:\n1. Create User.\n2.Show products.\n3.Coming soon...\n\n\n");

        
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        switch (option) {

            case 1 -> {

                if (userCreation == 0) {

                    System.out.println("Do you want to be a Premium User for $7.99/month ? (yes/no)");
                    String isSuscribed = input.next();

                    switch (isSuscribed.toLowerCase()) {
                        case "yes" ->                             {
                                User newUser = UserFactory.crearUsuario(TipoUsuario.PREMIUM);
                                userCreation++;
                            }
                        case "no" ->                             {
                                User newUser = UserFactory.crearUsuario(TipoUsuario.NORMAL);
                                userCreation++;
                            }
                        default -> {
                            System.out.println("Not a valid input.");
                            System.exit(0);
                        }
                    }
                    
                    
                    System.out.println("Continue logged in ? (yes/no)");
                    String logged = input.next();
                    
                    continuing = (logged.equals("yes")) ? true : false;
                    System.out.println("\n\n");
                    
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
            default ->
                System.out.println("Not a valid option");
        }

    }

}
