package com.revature.libraryconsoleapp.menu;


import java.awt.*;
import java.util.Scanner;

public class AdminMenu implements ISessionMenu {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Options");
        System.out.println("1. Create User\n" +
                "2. Look at borrowed books\n" +
                "3. Add Books \n" +
                "4. Create Books\n" +
                "5. Delete Books\n" +
                "x. Logout.");

        MenuFactory menuFactory = new MenuFactory();
        IMenu currentMenu;

        while(true) {
            String userInput = input.nextLine().toLowerCase();
            switch(userInput) {
                case "1":
                case "2":
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
