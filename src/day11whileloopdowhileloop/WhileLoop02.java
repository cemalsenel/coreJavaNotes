package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		findFactors();
		/*
		 * Type java code by using while loop, Write a program to count the factors of
		 * an integer which is entered by user Factors of 12 = 1 , 2 , 3 , 4 , 6 , 12
		 */

	}

	public static void findFactors() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to find its factors");
		int num = scan.nextInt();

		if (num < 0) {
			num = -num;
		}
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		scan.close();

	}

}
