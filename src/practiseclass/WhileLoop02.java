package practiseclass;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		factors();
		/*
		 * Type java code by using while loop, Write a program to count the factors of
		 * an integer which is entered by user. Factors of 12 = 1, 2, 3, 4, 6, 12
		 */

	}

	public static void factors() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();

		int i = 1;
		int sum = 0;
		while (i <= num) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;

		}
	}

}
