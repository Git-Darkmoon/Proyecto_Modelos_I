package Menus;

import Pagos.CashStrategy;
import Pagos.CreditCardPaymentStrategy;
import Pagos.Order;
import Pagos.Orders;
import Pagos.PaypalStrategy;
import Users.UserFactory;
import Users.User;
import Users.TipoUsuario;
import java.util.List;
import java.util.Scanner;

/**
 * @author Darkmoon
 */
public class Principal_Menu {

    Scanner input = new Scanner(System.in);
    private Orders myOrders = new Orders();
    List<Order> orderList;
    

    protected byte userCreation = 0;
    boolean continuing = true;
    int option = 0;

    public boolean isContinuing() {
        return continuing;
    }
    
    public void listOrders(){
        int cont= 0;
        orderList = myOrders.getOrders();
                    
        /*Listamos todas las ordenes*/
        for (Order order : orderList) { 
            System.out.println(cont+ ". Nombre Producto: " + order.getName()+ ", Cantidad: " + order.getQuantity());
            cont++;
        }
    }

    public void selectMenu() {
        
        
        
        System.out.println("----------- WELCOME TO OUR APP ------------");
        System.out.println("Enter the desired option to access:\n1. Create User.\n2. Buy products.\n3. Show Order (Beta)\n4. Pay Orders"
                       + " \n5. Cancel Order \n6. Exit \n\n\n");

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
                    myOrders.addOrder(productsMenu.showAll_Products());

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
                    listOrders();

                } else {
                    System.out.println("You must have a user to access this menu...\n");
                }
                break;
            }
            
            case 4-> {
                System.out.println("How do you want to pay? 1.Cash 2.Credit Card 3.Paypal");
                option = input.nextInt();
                switch(option){
                    case 1 ->{
                        /*Establece la estrategia y ejecuta el metodo de pagar*/
                        CashStrategy strategy = new CashStrategy();
                        myOrders.setStrategy(strategy);
                        myOrders.PayOrder();
                    }
                    
                    case 2 ->{
                        /*Establece los datos de la estrategia para inicializarla*/
                        System.out.println("Name");
                        String name = input.next();
                        System.out.println("Card Numer");
                        String cardNumber = input.next();
                        System.out.println("CVV");
                        String cvv = input.next();
                        System.out.println("Expiration Date");
                        String expirationDate = input.next();
                        /*Establece la estrategia y ejecuta el metodo de pagar*/
                        CreditCardPaymentStrategy strategy = new CreditCardPaymentStrategy(name,cardNumber,cvv,expirationDate);
                        myOrders.setStrategy(strategy);
                        myOrders.PayOrder();
                        
                    }
                    
                    case 3->{
                        /*Establece los datos de la estrategia para inicializarla*/
                        System.out.println("Username");
                        String username = input.next();
                        System.out.println("Password");
                        String password = input.next();
                        
                        /*Establece la estrategia y ejecuta el metodo de pagar*/
                        PaypalStrategy strategy = new PaypalStrategy(username,password);
                        myOrders.setStrategy(strategy);
                        myOrders.PayOrder();
                        
                    }
                }
                break;
            }
            case 5 ->{
                System.out.println("What order do you want to cancel?");
                listOrders();
                int option = input.nextInt();
                myOrders.removeOrder(this.orderList.get(option));  
            }
            
            case 6 -> {
                System.out.println("Thanks ! Have a nice day...");
                System.exit(0);
                break;
            }

            default ->
                System.out.println("Not a valid option");
        }

    }

}
