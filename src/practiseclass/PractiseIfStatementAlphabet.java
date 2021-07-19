package practiseclass;

import java.util.Scanner;

public class PractiseIfStatementAlphabet {
	/*
	 * Ask user to enter a character, then check whether the character is alphabet or not
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		char ch = scan.next().toLowerCase().charAt(0);
		
		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("It is from alphabet");
			
		}else {
			System.out.println("It is not from alphabet");
		}
		
		
		

	}

}
