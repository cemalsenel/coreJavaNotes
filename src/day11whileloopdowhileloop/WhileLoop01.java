package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		sumOfDigits();
		/*
		 * Interview question Type a java code by using while loop, Write a program that
		 * prompts the user to input an integer It should then find sum of the digits of
		 * that number
		 */

	}

	public static void sumOfDigits() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find sum of the digits");
		int number = scan.nextInt();

		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println(sum);
	}

}
