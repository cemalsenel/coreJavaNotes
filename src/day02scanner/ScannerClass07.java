package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		char firstNameInitial = scan.next().charAt(0);
		
		System.out.println("Enter your last name");
		char lastName = scan.next().charAt(0);
		
		System.out.println("Initial of the first name is : " + firstNameInitial);
		System.out.println("Initial of the last name is : " + lastName);
		
		//If you use mathematical operations ,  java uses the ASCII values of chars.
		//If you want to print characters not ASCII values you have 2 options
		//1)Use string together with chars.
		//2)Use System.out.print()
		//Note: System.out.println() prints the output and goes to the next line
		
		//1.way
		System.out.println("" + firstNameInitial + lastName);
		
		//2.way
		System.out.print(firstNameInitial);
		System.out.println(lastName);
		
		
		
		
		
		
		

	}

}
