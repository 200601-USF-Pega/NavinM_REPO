package com.revature.libraryconsoleapp.menu.adminMenus;

import com.revature.libraryconsoleapp.menu.ISessionMenu;
import com.revature.libraryconsoleapp.models.User;

public class InventoryManagementMenu implements ISessionMenu {
    private User user;

    public InventoryManagementMenu(User user) {
       this.user = user;
    }
    @Override
    public void start() {

    }
}
