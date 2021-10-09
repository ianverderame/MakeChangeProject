package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	static Scanner sc = new Scanner(System.in);
	static double difference;
	static boolean keepGoing;
	
	public static void main(String[] args) {

		System.out.println(
				"Hello, loyal customer! Welcome to my humble shop, I would like to tell you that none of my items are scams! \nWhat excellent item would you like to buy today? It could be anything at all!");
		String ignoreThisCompletely = sc.next();
		System.out.println("Fine choice! Those are my favorite, and they are in season, as well. Again, no scams.");

		keepGoing = true;
		do {
		getCash(); // Method to get input
		if (difference == 0) { //These if/else/else if statements to determine whether I am under paid or exactly paid
			System.out.println("Aha! Exact change. What a fine person you are.");
		} else if (difference < 0) {
			System.out.println("You think you're funny? Pay the rest of what you owe, please.");
		} else {
			amountOwed(); //method to calculate change owed
		}
		repeater(); // See whether user wants to repeat the program
		} while (keepGoing);
	}

	public static void getCash() {
		System.out.println("How much does this item cost? \n(Please just put the amount without any dollar signs)");
		double itemPrice1 = sc.nextDouble();
		int itemPrice = (int) (itemPrice1 * 100);
		System.out.println(
				"Wow! $" + itemPrice1 + " huh? Defintely not a scam.\nHow much are you going to pay me for this item?");
		double amountTendered1 = sc.nextDouble();
		int amountTendered = (int) amountTendered1 * 100;
		difference = amountTendered - itemPrice;
//			System.out.println(difference);
//			System.out.println(itemPrice + " /t" + amountTendered);
	}

	public static void amountOwed() {
		int numTwenties = 0;
		int numTens = 0;
		int numFives = 0;
		int numOnes = 0;
		int numQuarters = 0;
		int numDimes = 0;
		int numNickels = 0;
		int numPennies = 0;
		while ((difference - 2000) >= 0) {
			numTwenties++;
			difference = difference - 2000;
//				System.out.println("difference in twenties loop is now: " + difference);
		}
		while ((difference - 1000) >= 0) {
			numTens++;
			difference = difference - 1000;
//				System.out.println("difference in tens loop is now: " + difference);
		}
		while ((difference - 500) >= 0) {
			numFives++;
			difference = difference - 500;
//				System.out.println("difference in fives loop is now: " + difference);
		}
		while ((difference - 100) >= 0) {
			numOnes++;
			difference = difference - 100;
//				System.out.println("difference in ones loop is now: " + difference);
		}
		while ((difference - 025) >= 0) {
			numQuarters++;
			difference = difference - 25;
//				System.out.println("difference in quarters loop is now: " + difference);
		}
		while ((difference - 10) >= 0) {
			numDimes++;
			difference = difference - 10;
//				System.out.println("difference in dimes loop is now: " + difference);
		}
		while ((difference - 5) >= 0) {
			numNickels++;
			difference = difference - 5;
//				System.out.println("difference in nickels loop is now: " + difference);
		}
		while ((difference - 1) >= 0) {
			numPennies++;
			difference = difference - 1;
//				System.out.println("difference in penny loop is now: " + difference);
		}
		System.out.println("I have brought you your change. It is:");
		if (numTwenties > 0) {
			System.out.println("Twenties: " + numTwenties);
		}
		if (numTens > 0) {
			System.out.println("Tens: " + numTens);
		}
		if (numFives > 0) {
			System.out.println("Fives: " + numFives);
		}
		if (numOnes > 0) {
			System.out.println("Ones: " + numOnes);
		}
		if (numQuarters > 0) {
			System.out.println("Quarters: " + numQuarters);
		}
		if (numDimes > 0) {
			System.out.println("Dimes: " + numDimes);
		}
		if (numNickels > 0) {
			System.out.println("Nickels: " + numNickels);
		}
		if (numPennies > 0) {
			System.out.println("Pennies: " + numPennies);
		}

	}

	public static void repeater() {
		System.out.println("Would you like to purchase something else?");
			String answer = sc.next();
			switch (answer) {
				case "Y":
				case "Yes":
				case "y":
				case "yes":
					break;
				case "N":
				case "No":
				case "no":
				case "n":
					keepGoing = false;
					System.out.println("Thank you for visiting my shop. You have not been scammed.");
				break;
				default:
					System.out.println("Message unclear. Next time try \"yes\" or \"no.\" Terminating program...");
					keepGoing = false;
			}
	}
}
