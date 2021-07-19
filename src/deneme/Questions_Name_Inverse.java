package deneme;

import java.util.Scanner;

public class Questions_Name_Inverse {
	/*
	 * Ask user to enter a word which has 4 letters and output will be inverse of
	 * the word. For example; if user enters “MARK” output will be “KRAM”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");

		String word = scan.next();

		char w1 = word.charAt(0);
		char w2 = word.charAt(1);
		char w3 = word.charAt(2);
		char w4 = word.charAt(3);

		System.out.println("New word is : " + w4 + w3 + w2 + w1);

	}

}
