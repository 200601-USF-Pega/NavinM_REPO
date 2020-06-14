package com.revature.libraryconsoleapp.menu;

//jacob harrington's idea
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
            case "create_user":
                newMenu = new CreateUserMenu();
                break;
            case "show_all_users":
                newMenu = new ShowAllUserMenu();
                break;
            case "add_books":
                newMenu = new AddBooksMenu();
                break;
            /**
             *
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
