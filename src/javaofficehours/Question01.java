package javaofficehours;

import java.util.Scanner;

public class Question01 {
	/*
	 * Write a Java program that accepts two integer numbers and checks if they are
	 * equal. EXAMPLE: INPUT : first integer number: 1234 second integer number:
	 * 4321 OUTPUT : These numbers are different.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two integers to compare");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String result = a==b ? "The numbers are same" : "The numbers are different";
		System.out.println(result);
		
		/*
		if(a == b) {
			System.out.println("The numbers are same");
		}else {
			System.out.println("The numbers are different");
			
		}
		*/

	}

}
