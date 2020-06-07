package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.dao.UserRepoFile;
import com.revature.libraryconsoleapp.service.BootstrapService;

import java.util.Scanner;

public class MainMenu implements IMenu{
    private Scanner input = new Scanner(System.in);
//    private LoginMenu loginMenu = new LoginMenu();
    public void start() {
        String userInput;
        System.out.println("Welcome to library app");
        MenuFactory menuFactory = new MenuFactory();
        IMenu currentMenu;

        while(true){
            System.out.println("[0] Please login: ");
            System.out.println("[1] Exit: ");

            userInput = input.nextLine();

            switch(userInput){
                case "0":
                    System.out.println("Using Login service.");
                    currentMenu = menuFactory.changeMenu("login_menu");
                    currentMenu.start();
                    break;
                case "1":
                    System.out.println("Exiting the libary application.");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }


        }
    }

}
