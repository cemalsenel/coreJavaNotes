package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement01 {
	/*
	 Type Java code, if an integer is even, output will be "The integer is even".
	 If the integer is odd , output will be "The integer is odd".
	 */

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a number to check if it is odd or even");
		int a = scan.nextInt();
		if(a%2 != 0 ) {
			System.out.println("The integer is odd ");
			
		}
		if (a%2 == 0) {
			System.out.println("The integer is even");
		}scan.close();
		
		

	}

}
