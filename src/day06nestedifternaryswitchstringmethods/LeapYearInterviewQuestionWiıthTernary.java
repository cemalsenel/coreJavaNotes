package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class LeapYearInterviewQuestionWiýthTernary {
	/*
	 * Ask user to enter year Type java code by using if-else if() statement. Write
	 * a program to check if a year is leap year or not. if the year is divisible by
	 * 100 then it must be divisible by 400. If a year is not divisible by 100 then
	 * it must be divisible by 4.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();
		
		String r =(year%100 ==0 ) ? (year%400==0 ? "The year is leap year" : "The year is not leap year") : 
			      (year %4 == 0 ? "The year is leap year" : "The year is not leap year");
		System.out.println(r);
		
		
		
		
		
		
		

	}

}
