package day10forloops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		multiplicationTable();
	}

	/*
	 * Type java code by using while loop, get a number from user and print a
	 * multiplication table
	 * 3x1=3 3x2=6 3x3=9 .....
	 */
	public static void multiplicationTable() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see multiplication table");
		double d = scan.nextDouble();
		
		double i = 1;
		while(i<=10) {
			System.out.println(d + "x" + i + "=" +(d*i) );
			i++;
		}
		
	}

}
