package day11whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		playGame();
		
		
	}
	public static void playGame() {
		/*
		 * Ask user to enter a number If the number user entered is less than 10 ,print
		 * "Won!" on the console Otherwise , ask user to enter a number again
		 */

		Scanner scan = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("Enter a integer number to play...");
			num = scan.nextInt();
		} while (num >= 10);
		System.out.println("Congrats, You won!...");

		
	}

}
