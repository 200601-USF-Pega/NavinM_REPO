package com.revature.libraryconsoleapp.menu;


import java.awt.*;
import java.util.Scanner;

public class AdminMenu implements ISessionMenu {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Options");
        System.out.println("1. Create User\n" +
                "2. Look at all the users\n" +
                "3. Look at borrowed books\n" +
                "4. Add Books \n" +
                "5. Create Books\n" +
                "6. Delete Books\n" +
                "x. Logout.");

        MenuFactory menuFactory = new MenuFactory();
        IMenu currentMenu;

        while(true) {
            String userInput = input.nextLine().toLowerCase();
            switch(userInput) {
                case "1":
                   currentMenu = menuFactory.changeMenu("create_user");
                   currentMenu.start();
                case "2":
                   currentMenu = menuFactory.changeMenu("show_all_users");
                   currentMenu.start();
                case "3":
                case "4":
                case "5":
                case "x":
                    currentMenu = menuFactory.changeMenu("main_menu");
                    currentMenu.start();
                    break;
                default:
                    System.out.println("Press the given options.");
            }

        }
    }
}
