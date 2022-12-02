package Principal;

/**
 * @author Darkmoon
 */
public class AppLauncher {

    public static void main(String[] args) {

        Menu optionMenu = new Menu();

        while (optionMenu.isContinuing()) {
            
            optionMenu.selectMenu();

        }

    }

}
