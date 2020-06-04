package com.revature.libraryconsoleapp.menu;

import java.util.Scanner;

public class MainMenu {
    private Scanner input = new Scanner(System.in);

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
