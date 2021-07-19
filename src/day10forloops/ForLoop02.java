package day10forloops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		checkPalindrome();
		/*
		 * Interview Question
		 * 1)Ask user to enter a String 2)Check the String if it is “Palindrome” or
		 * not(aba ==aba)
		 */

	}

	public static void checkPalindrome() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String if it is palindrome or not");
		String str = scan.nextLine();
		String revStr = "";
		scan.close();

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.substring(i, i + 1);
		}
		if (str.equalsIgnoreCase(revStr)) {
			System.out.print(str + " is palindrome");
		} else {
			System.out.print(str + " is not palindrome");
		}
	}

}
