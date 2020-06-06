package com.revature.menu;

import com.revature.factory.CalculatorFactory;
import com.revature.service.CalculatorService;

import java.util.Scanner;

public class MainMenu {
    private Scanner input = new Scanner(System.in);
    private CalculatorService calculatorService = new CalculatorService();

    public MainMenu() {
    }

    public void start() {
        String userInput;
        do {
            System.out.println("Calculator App");
            System.out.println("Enter [0]  to calculate numbers.");
            System.out.println("Operations supported Addition [+], Subtraction [-], Multipilcation[*], Divsion[/], Modulo[%]");
            System.out.println("Enter [1] exit the program");


            //switch for user input to point them to appropriate places in the code

            userInput = input.nextLine();
            switch (userInput) {
                case "0":
                    //start the calculator service.
                    System.out.println("The result: " + calculatorService.calculate());
                    System.out.println();
                    break;
                case "1":
                    System.out.println("Exiting the program ....");
                    break;
                default:
                    System.out.println("Invalid input please try again!");
            }
        } while(!userInput.equals("1"));
    }
}
