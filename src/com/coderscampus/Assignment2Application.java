package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;

		int numberOfGuesses = 0;
		int maxGuesses = 5;
		System.out.println("random number is: " + randomNumber);
		while (numberOfGuesses < maxGuesses) {
			System.out.print("Pick a number between 1 and 100: ");
			int userGuess = getUserInput(scanner);

			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				continue;
			}

			numberOfGuesses++;

			if (userGuess == randomNumber) {
				System.out.println("You Win!");
				break;
			}
			if (userGuess < randomNumber) {
				System.out.println("Please pick a higher number");
			}
			if (userGuess > randomNumber) {
				System.out.println("Please pick a lower number");
			}
			if (numberOfGuesses == maxGuesses) {
				System.out.println("You lose!");
				System.out.println("The number to guess was :" + randomNumber);
			}
		}

	}

	private static int getUserInput(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("The number you typed in is not between 1 and 100");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
