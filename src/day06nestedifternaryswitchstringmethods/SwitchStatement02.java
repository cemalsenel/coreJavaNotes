package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement02 {
	/*
	 * If the user pressed 1, 2, 3 the program will print the number that is
	 * pressed; otherwise, program will print �Not allowed�.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 3");
		int a = scan.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
			default:
				System.out.println("Not allowed");
		}scan.close();
				

	}

}