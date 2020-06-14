package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.dao.UserRepoDB;
import com.revature.libraryconsoleapp.models.Access;
import com.revature.libraryconsoleapp.models.User;
import com.revature.libraryconsoleapp.service.ConnectionService;
import com.revature.libraryconsoleapp.service.ValidationService;

import java.sql.Connection;
import java.util.List;

public class CreateUserMenu implements IMenu{
    private String userName;
    private String pwd;
    private String firstName;
    private String lastName;
    private String access;
    private ValidationService validationService  = new ValidationService();
    private ConnectionService connectionService = new ConnectionService();
    private UserRepoDB userRepoDB= new UserRepoDB();

    //private MenuFactory menuFactory = new MenuFactory();
    //private IMenu currentMenu;

    @Override
    public void start() {

        userName = validationService.getValidStringInput("Please enter your username: ");
        pwd= validationService.getValidStringInput("Please enter your password: ");
        firstName= validationService.getValidStringInput("Please enter your firstname: ");
        lastName= validationService.getValidStringInput("Please enter your lastname: ");

        User user1 = new User(userName, pwd, firstName, lastName, Access.ADMIN);
        userRepoDB.addUser(user1);

        System.out.println("User created and pushed to the db.");

    }


}

