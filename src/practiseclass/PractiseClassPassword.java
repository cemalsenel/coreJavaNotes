package practiseclass;

import java.util.Scanner;

public class PractiseClassPassword {
	public static void main(String[] args) {
		/*
		 * Type java code by using if-else statement, if the password is “JavaLearner”,
		 * output will be “The password is true”. Otherwise, output will be “The
		 * password is false”.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your password");
		String str = scan.nextLine();
		
		if(str.equals("JavaLearner")) {
			System.out.println("Correct!!!");
		}else {
			System.out.println("Wrong Password!!!");
		}
	}

}
