package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.dao.UserRepoDB;
import com.revature.libraryconsoleapp.models.User;
import com.revature.libraryconsoleapp.service.ConnectionService;

import java.util.List;

public class ShowAllUserMenu implements IMenu{
    private ConnectionService connectionService = new ConnectionService();
    private UserRepoDB userRepoDB= new UserRepoDB();

    @Override
    public void start() {
        List<User> users = userRepoDB.getAllUsers();
        for(User user : users) {
            System.out.println(user.toString());
        }
    }

}
