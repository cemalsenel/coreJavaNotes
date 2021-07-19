package javaofficehours;

import java.util.Scanner;

public class Question04 {
	/*
	 * Ask user to enter two numbers Show them a menu of operation signs and ask
	 * them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
	 * Division : 4 Print the result on the console EXAMPLE: INPUT: Num1 : 50 Num2 :
	 * 5 Which operation do you prefer? 1 for Addition 2 for Subtraction 3 for
	 * Multiplication 4 for Division select 1 Result= 55
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.Way
		System.out.println("Please enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println();
		System.out.println(
				"Please select an operation? \n Addition : 1 \n Subtraction : 2 \n Multiplication : 3 \n Division : 4");
		byte selection = scan.nextByte();

		switch (selection) {
		case 1:
			System.out.println("The sum of numbers : " + (a + b));
			break;
		case 2:
			System.out.println("The substraction of numbers : " + (a - b));
			break;
		case 3:
			System.out.println("The multiplication of numbers : " + (a * b));
			break;
		case 4:
			System.out.println("The division of numbers : " + (a / b));
			break;
		default:
			System.out.println("Enter a valid operation");

		}
        //2.Way
		System.out.println("Enter first number");

		double num1 = scan.nextDouble();

		System.out.println("Enter second number");

		double num2 = scan.nextDouble();

		System.out.println();

		System.out.println(
				"Which operation do you prefer?\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");

		int option = scan.nextInt();

		if (option == 1) {
			System.out.println("Result=" + (num1 + num2));
		} else if (option == 2) {
			System.out.println("Result=" + (num1 - num2));
		} else if (option == 3) {
			System.out.println("Result=" + (num1 * num2));
		} else if (option == 4) {
			System.out.println("Result=" + (num1 / num2));
		} else {
			System.out.println("Enter a valid option");
		}

		scan.close();

	}

}
