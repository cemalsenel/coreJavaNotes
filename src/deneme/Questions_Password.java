package deneme;

import java.util.Scanner;

public class Questions_Password {
	/*
	 * Ask user to enter password, if the password is okay for the following
	 * conditions output will be “Your password is created successfully.” If the
	 * password is not okay for any of the following conditions Output will be
	 * “Enter a new password according to the give conditions”
	 * 
	 * 1.First letter must be uppercase 2.Last letter must be lowercase 3.Password
	 * must contain 6 characters
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password");
		String pwd = scan.next();
		char first = pwd.charAt(0);
		char last = pwd.charAt(pwd.length() - 1);

		String result = (pwd.length() == 6) && (first >= 'A' && first <= 'Z') && (last >= 'a' && last <= 'z')
				? "The password created successfully"
				: "Enter a new password according to given conditions";

		System.out.println(result);

	}

}
