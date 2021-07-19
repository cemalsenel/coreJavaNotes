package day03wrapperclassconcantelogicaloperators;

import java.util.Scanner;

public class ModulusOperator001 {
	/*
	 Ask user to enter 3 digit integer
	 Type a java program to find sum of the digits
	 
	 */

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter 3 digits number");
		int digit = scan.nextInt();
		int a  = (digit%10);
		int b = digit /10;
		int c = b%10;
		int d = digit/100;
		System.out.println("The sum of digit is : " +( a+c+d));

	}

}
