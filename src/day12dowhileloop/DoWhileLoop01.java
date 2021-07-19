package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		checkOntToBeEven();

	}

	public static void checkOntToBeEven() {
		/*
		 * Ask user to enter an integer If the integer is even print on the console
		 * "You won!" Otherwise ask user to enter another integer
		 */

		//Do-While-Loop is used for most of time for games.
		Scanner scan = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("Please enter an integer");
			num = scan.nextInt();
			if (num % 2 == 0) {
				System.out.println("You won! " + num + " is even!");
			}
		} while (num % 2 != 0);

		scan.close();
	}

}
