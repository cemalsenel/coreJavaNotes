package practiseclass;

import java.util.Scanner;

public class PractiseClassAbsoluteNumber {

	public static void main(String[] args) {
		/*
		 * Type java code by using if-else statement,Write a program to print absolute
		 * value of a number entered by user. Absolute Value: If the number is positive
		 * or zero return the number itself If the number is negative return the number
		 * after multiplying by -1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		double d1 = scan.nextDouble();
		if(d1>=0) {
			System.out.println(d1);
		}
		if(d1<0) {
			System.out.println(-1*d1);
		}scan.close();
		

	}

}
