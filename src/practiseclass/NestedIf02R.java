package practiseclass;

import java.util.Scanner;

public class NestedIf02R {
	/*
	 * Type java code by using nested if() statement. Ask user to enter a password
	 * If the initial of the password is upper case then check if it is ‘A’ or not.
	 * If it is ‘A’ the output will be “Valid Password” otherwise the output will be
	 * “Invalid Password” If the initial of the password is lower case then check if
	 * it is ‘z’ or not. If it is ‘z’ the output will be “Valid Password” otherwise
	 * the output will be “Invalid Password”
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password");
		String pass = scan.nextLine();

		if (pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z') {
			if (pass.charAt(0) == 'A') {
				System.out.println("Valid Password");
			} else {
				System.out.println("Invalid Password");
			}
		} else if (pass.charAt(0) >= 'a' && pass.charAt(0) <= 'z') {
			if (pass.charAt(0) == 'z') {
				System.out.println("Valid Password");
			} else {
				System.out.println("Invalid Password");
			}
		} else {
			System.out.println("Enter a valid Password");

		}

	}

}
