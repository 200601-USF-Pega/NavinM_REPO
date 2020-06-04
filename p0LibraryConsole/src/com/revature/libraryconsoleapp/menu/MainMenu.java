package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.dao.UserRepoFile;
import com.revature.libraryconsoleapp.service.BootstrapService;

import java.util.Scanner;

public class MainMenu {
    private Scanner input = new Scanner(System.in);
    private BootstrapService bootstrapService = new BootstrapService(new UserRepoFile());
    public void start() {
        String userInput;
        do {
            System.out.println("Welcome to library app");
            System.out.println("[0] Please login: ");
            System.out.println("[1] Exit: ");

            userInput = input.nextLine();
            switch(userInput){
                case "0":
                    System.out.println("Using Login service.");
                    bootstrapService.checkForAdmin();
                    //login service
                    break;
                case "1":
                    System.out.println("Exiting the libary application.");
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }


        } while(!userInput.equals("1"));
    }
}
