package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.menu.adminMenus.InventoryManagementMenu;
import com.revature.libraryconsoleapp.menu.adminMenus.OtherActionsMenu;
import com.revature.libraryconsoleapp.menu.adminMenus.userManagementMenus.*;
import com.revature.libraryconsoleapp.models.User;

public class SessionMenuFactory {

    private ISessionMenu accessManager(User user) {
      ISessionMenu sessionMenu = null;

      switch (user.getAccess()) {
          case ADMIN:
              sessionMenu = new AdminMenu(user);
              break;

          case PATRON:
              sessionMenu = new PatronMenu();
              break;

          case BANNED:
              System.out.println("you are banned");
              break;
      }
      return sessionMenu;
    }

   public ISessionMenu changeMenu(String menuName, User user) {
        ISessionMenu newMenu = null;
        switch(menuName) {
            case "user_main_menu":
                newMenu = accessManager(user);
                break;
            case "user_management":
                newMenu = new UserManagementMenu(user);
                break;
            case "inventory_book_management":
                newMenu = new InventoryManagementMenu(user);
                break;
            case "other_actions":
                newMenu = new OtherActionsMenu(user);
                break;
            case "create_user_menu":
                newMenu = new CreateUserMenu(user);
                break;
            case "delete_user_menu":
                newMenu = new DeleteUserMenu(user);
                break;
            case "edit_a_user":
                newMenu = new EditUserMenu(user);
                break;
            case "look_at_users":
                newMenu = new ShowAllUsersMenu(user);
                break;
        }
       return newMenu;
   }

}
