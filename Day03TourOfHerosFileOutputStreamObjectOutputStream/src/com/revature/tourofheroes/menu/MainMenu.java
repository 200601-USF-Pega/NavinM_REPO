package com.revature.tourofheroes.menu;

import java.util.Scanner;

import com.revature.tourofheroes.dao.HeroRepoFile;
import com.revature.tourofheroes.service.HeroService;

public class MainMenu {
	private Scanner input = new Scanner(System.in);
	private HeroService service = new HeroService(new HeroRepoFile());
	public void start() {
		String userInput;
		do {
			System.out.println("Welcome to my tour of heroes app");
			System.out.println("What would you like to do?");
			System.out.println("[0] Create a hero?");
			System.out.println("[1] Exit");
			System.out.println("[2] Print all the heroes.");
			
			//switch for user input to point them to appropriate places in the code 
			
			userInput = input.nextLine();
			switch (userInput) {
			case "0":
				service.createNewHero();
				break;
			case "1":
				System.out.println("Exiting....");
				System.exit(0);
				break;
			case "2":
				System.out.println("Getting Heros...");
				System.out.println(service.readHeroes());
				break;
			default:
				System.out.println("Invalid input please try again!");
					
			}
		} while(!userInput.equals("1"));
	}
}
