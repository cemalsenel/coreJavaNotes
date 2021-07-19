package practiseclass;

import java.util.Scanner;

public class PrivateClassNumber {
	/*
	 * Ask user to enter a 4 digits integer, then print the sum of the first and the
	 * last digit of the number on console. For example; if user enters 1234 you
	 * will add 1 and 4, then print on the console 5
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 4 digits number");
		int i = scan.nextInt();
		
		int a = i % 10;
		int b = i / 1000;
		
		
		System.out.println(b+a );
		

	}

}
