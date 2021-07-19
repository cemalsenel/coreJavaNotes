package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary03 {
	/*
	 * Ask user to enter an integer. If the number has 3 digits, output will be
	 * “This number has 3 digits.” Otherwise, output will be “This number has no 3
	 * digits.” How can you decide the number of digits of an integer?
	 */

	public static void main(String[] args) {
		// 1.Question
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 digits integer");
		int a = scan.nextInt();

		String result = (a < 999 && a > 99) || (a < -99 && a > -999) ? "It has 3 digits" : "It has no 3 digits";
		System.out.println(result);

		// 2.Question
		/*
		 * Ask user to enter a String. If the String has 2 characters, output will be
		 * “It is valid for state abbreviations” Otherwise, output will be “It is not
		 * valid for state abbreviations
		 */
		
		System.out.println("Please enter two characters");
		String abrv = scan.next();
		
		String result2 = abrv.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
