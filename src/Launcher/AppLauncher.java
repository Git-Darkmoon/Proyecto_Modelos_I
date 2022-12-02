package Launcher;

import Menus.Principal_Menu;

/**
 * @author Darkmoon
 */

public class AppLauncher {

    public static void main(String[] args) {

        Principal_Menu optionMenu = new Principal_Menu();

        while (optionMenu.isContinuing()) {
            
            optionMenu.selectMenu();

        }

    }

}
