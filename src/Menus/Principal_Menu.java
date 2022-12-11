package Menus;

import Products.Order;
import Users.UserFactory;
import Users.User;
import Users.TipoUsuario;
import java.util.Scanner;

/**
 * @author Darkmoon
 */
public class Principal_Menu {

    Scanner input = new Scanner(System.in);
    private String Order = "";

    protected byte userCreation = 0;
    boolean continuing = true;
    int option = 0;

    public boolean isContinuing() {
        return continuing;
    }

    public void selectMenu() {
        
        
        
        System.out.println("----------- WELCOME TO OUR APP ------------");
        System.out.println("Enter the desired option to access:\n1. Create User.\n2. Buy products.\n3. Show Order (Beta)\n4. Exit. \n\n\n");

        option = input.nextInt();

        switch (option) {
            case 1 -> {

                if (userCreation == 0) {

                    System.out.println("\nDo you want to be a Premium User for $7.99/month ? (yes/no)");
                    String isSuscribed = input.next();

                    switch (isSuscribed.toLowerCase()) {
                        case "yes" -> {
                            User newUser = UserFactory.crearUsuario(TipoUsuario.PREMIUM);
                            userCreation++;
                        }
                        case "no" -> {
                            User newUser = UserFactory.crearUsuario(TipoUsuario.NORMAL);
                            userCreation++;
                        }
                        default -> {
                            System.out.println("Not a valid input.");
                            System.exit(0);
                        }
                    }

                } else {
                    System.out.println("\nHEY ! You already created a user !!!\n");
                }
                break;
            }

            case 2 -> {

                if (userCreation != 0) {

                    Products_Menu productsMenu = new Products_Menu();
                    Order += " "+ productsMenu.showAll_Products();
                    System.out.println(Order);

                } else {
                    System.out.println("ADVERTISEMENT: You must have a user to access this menu...\n");
                }

                System.out.println("\n\tContinue logged in ? (yes/no)\n\t");
                String logged = input.next();

                continuing = (logged.toLowerCase().equals("yes"));
                System.out.println("\n\n");
                break;
            }

            case 3 -> {

                if (userCreation != 0) {

                    System.out.println("Your products are... (Feature in progress)");

                    System.out.println(Order);

                } else {
                    System.out.println("You must have a user to access this menu...\n");
                }
                break;
            }

            case 4 -> {
                System.out.println("Thanks ! Have a nice day...");
                System.exit(0);
                break;
            }

            default ->
                System.out.println("Not a valid option");
        }

    }

}
