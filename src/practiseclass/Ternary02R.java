package practiseclass;

import java.util.Scanner;

public class Ternary02R {
	/*
	 * Type java code by using ternary. Write a program to print absolute value of
	 * an integer entered by user.
	 */

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter a number ");
		int i = scan.nextInt();
		
		int result = i>0 ?  i : -1*i;
		System.out.println("The absolute value of integer is : " + result);
		
		
		
		/*
		 * Type java code by using ternary .Ask user to enter two integers Write a
		 * program to print the minimum one on the console.
		 */

		//Scanner scan = new Scanner (System.in);
		System.out.println("Enter 2 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int resultt = a>b ? b : a ;
		System.out.println(resultt);
		
		/*
		 * Type java code by using using ternary. Take values of length and width of a
		 * rectangle from user and check if it is square or not.
		 */
		  System.out.println("Enter value of lenght and width");
		  int lenght = scan.nextInt();
		  int width = scan.nextInt();
		  
		  String result1 = width == lenght ? "Square" : "Rectangle";
		  System.out.println("The result of the numbers you pressed :" + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
