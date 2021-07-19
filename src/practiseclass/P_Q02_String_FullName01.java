package practiseclass;

import java.util.Scanner;

public class P_Q02_String_FullName01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their fullname as two words. Convert their full name as
		 * following : INPUT : JULIA ROBERTS --> OUTPUT :Julia ROBERTS (Initial of the
		 * firstname should be uppercase and the rest of firstname should be lowercase.
		 * All letters of lastname should be in uppercase)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name ");
		String str = scan.nextLine().trim();
		int space = str.indexOf(" ");
		String firstName = str.substring(0, 1).toUpperCase() + str.substring(1, space).toLowerCase();
		space++;
		String lastName = str.substring(space).toUpperCase();
		System.out.println(firstName + " "+ lastName);
		

	}

}
