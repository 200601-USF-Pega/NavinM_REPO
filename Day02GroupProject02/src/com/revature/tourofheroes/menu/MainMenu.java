package com.revature.tourofheroes.menu;

import com.revature.tourofheroes.models.Hero;

import java.util.Scanner;

public class MainMenu {

	Scanner scanner;
	public void mainMenu() {
		System.out.println("Welcome to my tour of heroes app");
		System.out.println("What would you like to do?");
		System.out.println("[0] Create a hero?");
		System.out.println("[1] Exit");
		
		//switch for user input to point them to appropriate places in the code
		scanner = new Scanner(System.in);
		while(true) {
			int option = scanner.nextInt();
			switch(option){
				case 0:
					System.out.print("Please enter a name for your hero: ");
					scanner.nextLine();
					StringBuilder name  = new StringBuilder(scanner.nextLine());
					System.out.println("Is this hero gen [1] or [2](Enter a number)?");
					//scanner.nextLine();
					int input = scanner.nextInt();
					if (input == 1) {
						name.append(" version_1");
					} else if (input == 2) {
						name.append(" version_2");
					} else {
						System.out.println("invalid generation, default name");
					}

					System.out.print("How many special moves does your hero have?");
					int num = scanner.nextInt();
					String[] heroPowers = new String[num];
					System.out.println("Enter the special moves: ");
					scanner.nextLine();
					for (int i =0; i< heroPowers.length; i++) {
						System.out.print("Power no: " + (i+1) + " ");
						heroPowers[i] = scanner.nextLine();
					}
				    Hero newHero = new Hero(name.toString(), heroPowers, 100, true);
					System.out.println(newHero.toString());
					System.exit(0);
					break;

				case 1:
					System.out.println("Exiting...");
					System.exit(0);
					break;

				default:
					System.out.println("Please press one of the options.");
					continue;
			}

		}
	}

}
