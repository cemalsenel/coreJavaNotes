package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		checkPassword();

		/*
		 * Ask user to enter password If the password has more than 6 characters print
		 * "It is okay" Otherwise , print "Make the password longer than 6 characters"
		 * and ask user to enter a password
		 */
	}

	public static void checkPassword() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password");
		String pass = " ";
		do {
			//System.out.println("Enter a password");
			pass = scan.next();
			if (pass.length() > 6) {
				System.out.println("Password is valid");
			} else {
				System.out.println("Make the password longer than 6 characters,please...");
				System.out.println("wait a second,please...");
				System.out.println("Enter a password again");
			}
		} while (pass.length() <= 6);
	}

}
