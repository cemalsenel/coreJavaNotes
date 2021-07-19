package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary02 {
	/*
	 * Type java code by using ternary. Write a program to print absolute value of
	 * an integer entered by user.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = scan.nextInt();

		int result = a < 0 ? -1 * a : a;
		System.out.println(result);
		/*
		 * Type java code by using using ternary. Take values of length and width of a
		 * rectangle from user and check if it is square or not.
		 */
         System.out.println("Enter 2 sides of rectangle");
         
         double length = scan.nextDouble();
         double width = scan.nextDouble();
         String result2 = length == width ? "Square" : "Rectangle" ;
         System.out.println(result2);
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
