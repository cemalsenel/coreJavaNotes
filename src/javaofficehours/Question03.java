package javaofficehours;

import java.util.Scanner;

public class Question03 {
	/*
	 * Write a Java program to print the sum (addition), multiply, subtract, divide
	 * two numbers. EXAMPLE: INPUT : first number: 125 second number: 25 OUTPUT: The
	 * sum of two numbers is : 150 The difference of two numbers is : 100 The
	 * product of two numbers is : 3125 The division of two numbers is : 5.0
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 integers");
		double a = scan.nextDouble();
		double b =scan.nextDouble();
		
		double sum = a+b; 
		double difference = a-b ; 
		double multiple = a*b ;
		double division = a/b;
		
		
		System.out.println("The sum is : " + sum);
		System.out.println("The difference is : " + difference);
		System.out.println("The multiple is : " + multiple);
		System.out.println("The division is : " + division);
		

	}

}
