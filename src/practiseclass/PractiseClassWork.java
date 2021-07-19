package practiseclass;

import java.util.Scanner;

public class PractiseClassWork {
	/*
	 * Type java code by using if-else if() statement, If age is less than 13 output
	 * will be “Should not work”, If age is greater than 65 output will be
	 * “Retired”, Otherwise; output will be “Should work”
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please entere your age");
		int age = scan.nextInt();
		if(age > 13 && age<65) {
			System.out.println("Should Work");
		}else {
			if(age <13) {
				System.out.println("Should not Work");
			}
			if(age > 65) {
				System.out.println("Retired");
			}
		}
	}

}
