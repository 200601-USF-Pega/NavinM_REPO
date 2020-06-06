package com.revature.libraryconsoleapp.service;

import java.util.Scanner;

public class ValidationService {
    Scanner input = new Scanner(System.in);
    boolean invalid = true;

    public String getValidStringInput(String prompt) {
        String userInput;
        do {
            System.out.print(prompt);
            userInput = input.nextLine();
            if(!userInput.isEmpty()) break;
            System.out.println("Please input non empty string");
        } while(invalid);
        return userInput;
    }

    public int getValidInt(String prompt) {
        int userInput = 0;
        do {
            System.out.println(prompt);
            try {
                userInput = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Please input valid integer");
            }
        } while(invalid);
        return userInput;
    }

    public boolean getValidBoolean(String prompt) {
        invalid = true;
        String userInput;
        do {
            System.out.println(prompt);
            userInput = input.next();
            if(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")) break;
            System.out.println("Please input either true or false");
        } while(invalid);
        return Boolean.parseBoolean(userInput);

    }
}
