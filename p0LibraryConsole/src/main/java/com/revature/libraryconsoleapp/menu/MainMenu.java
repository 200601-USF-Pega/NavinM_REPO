package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.dao.UserRepoFile;
import com.revature.libraryconsoleapp.service.BootstrapService;
import com.revature.libraryconsoleapp.service.LoginService;
import com.revature.libraryconsoleapp.service.SessionService;

import java.util.Scanner;

public class MainMenu {
    private Scanner input = new Scanner(System.in);
    private BootstrapService bootstrapService = new BootstrapService(new UserRepoFile());
    private LoginService loginService = new LoginService();
    private SessionService sessionService = new SessionService();
    public void start() {
        String userInput;
        bootstrapService.checkForAdmin();
        System.out.println("Welcome to library app");
        do {
            System.out.println("[0] Please login: ");
            System.out.println("[1] Exit: ");

            userInput = input.nextLine();
            switch(userInput){
                case "0":
                    System.out.println("Using Login service.");
                    sessionService.sessionStart(loginService.userLogin());
                    break;
                case "1":
                    input.close();
                    System.out.println("Exiting the libary application.");
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }


        } while(!userInput.equals("1"));
    }

}
