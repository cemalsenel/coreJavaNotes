package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		checkInitial();

	}

	public static void checkInitial() {
		/*
		 * Ask user to enter his/her name if the initial is lower case print a message
		 * like "Make the initial upper case" if the initial is upper case print a
		 * message like "You did  it right"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fn = " ";
		do {
			fn = scan.next();
			if (fn.charAt(0) >= 'A' && fn.charAt(0) <= 'Z') {
				System.out.println("You did  it correct!...");
			} else {
				System.out.println("Please make the intial uppercase");
			}
		} while (!(fn.charAt(0) >= 'A' && fn.charAt(0) <= 'Z'));
		scan.close();
	}

}
