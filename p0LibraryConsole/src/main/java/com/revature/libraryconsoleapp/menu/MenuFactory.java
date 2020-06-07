package com.revature.libraryconsoleapp.menu;

public class MenuFactory {

    public IMenu changeMenu(String menuName) {
        IMenu newMenu = null;
        switch (menuName) {
            case "main_menu":
               newMenu =  new MainMenu();
               break;
            case "login_menu":
               newMenu = new LoginMenu();
                break;
            /**
            case "admin_menu":
                newMenu = new AdminMenu();
                break;
            case "patron_menu":
                newMenu = new PatronMenu();
                break;
             **/
        }
        return newMenu;
    }
}
