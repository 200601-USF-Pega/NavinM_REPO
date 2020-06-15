package com.revature.libraryconsoleapp.menu.adminMenus.userManagementMenus;

import com.revature.libraryconsoleapp.dao.UserRepoDB;
import com.revature.libraryconsoleapp.menu.IMenu;
import com.revature.libraryconsoleapp.menu.ISessionMenu;
import com.revature.libraryconsoleapp.menu.SessionMenuFactory;
import com.revature.libraryconsoleapp.menu.ViewClass;
import com.revature.libraryconsoleapp.models.User;
import com.revature.libraryconsoleapp.service.ConnectionService;
import com.revature.libraryconsoleapp.service.ValidationService;

import java.util.List;
import java.util.Scanner;

public class EditUserMenu implements ISessionMenu {
    private User user;
    private ConnectionService connectionService = new ConnectionService();
    private UserRepoDB userRepoDB= new UserRepoDB();
    private ValidationService validationService = new ValidationService();

    public EditUserMenu(User user) {
        this.user = user;
    }

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        ViewClass.printSessionHeader("Edit User Menu", user);
        List<User> userList  =  userRepoDB.getAllUsers();
        ViewClass.UserListView(userList);

        int userInt= validationService.getValidInt("Enter the number [] for the User.");
        User selectedUser = userList.get(userInt);
        System.out.println("User " + selectedUser.getUserName() + " selected.");
        System.out.println(
                "Enter any of these options.\n" +
                        "[1] Update Password\n" +
                        "[2] Edit First Name\n" +
                        "[3] Edit Last Name\n" +
                        "[4] Edit Access privilege\n" +
                        "[b] BACK."
        );


        SessionMenuFactory sessionMenuFactory = new SessionMenuFactory();
        IMenu currentMenu;
        String userName = selectedUser.getUserName();

        while(true) {
            String userInput = input.nextLine().toLowerCase();
            switch (userInput) {
                case "1":
                    System.out.println("Enter new password: ");
                    String password = input.nextLine();
                    userRepoDB.updatePassword(userName, password);
                    System.out.println("Updated password for user: " + userName + ", press b to back.");
                    break;
                case "2":
                    System.out.println("Enter new first name: ");
                    String firstName = input.nextLine();
                    userRepoDB.updateFirstName(userName, firstName);
                    System.out.println("Updated first name for user:  " + userName +", press b to back.");
                    break;
                case "3":
                    System.out.println("Enter new last Name: ");
                    String lastName = input.nextLine();
                    userRepoDB.updateLastName(userName, lastName);
                    System.out.println("Updated last name for user: " + userName  +", press b to back.");
                    break;
                case "4":
                    System.out.println(
                            "Enter\n[1] ADMIN\n" +
                             "[2] PATRON\n" +
                             "[3] BANNED"
                            );
                    String access = input.nextLine();
                    String accessName = "";
                    if (access == "1") {
                       accessName = "ADMIN";
                    } else if (access == "2") {
                        accessName = "PATRON";
                    } else {
                        accessName = "BANNED";
                    }
                    userRepoDB.updateAccess(userName, accessName);
                    System.out.println("Updated Access Type for user: " + userName + ", press b to back.");
                    break;
                case "b":
                    currentMenu = sessionMenuFactory.changeMenu("user_management", user);
                    currentMenu.start();
                    break;
                default:
                    System.out.println("Please press the given option inside the ['']");
            }
        }

    }
}
