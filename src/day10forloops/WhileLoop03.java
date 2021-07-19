package day10forloops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		factoarial();
		
	}

	/*
	 * Interview Question Get an integer from user and calculate the factorial
	 * 
	 */
	public static void factoarial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int d = scan.nextInt();

		int i = 1;
		int result = 1;
		while (i <= d) {
			result = result * i;

			i++;
		}
		System.out.println(result);
	}
}
