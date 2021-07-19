package practiseclass;

import java.util.Scanner;

public class PractiseClassInteger {
	/*
	 * Type java code by using if-else if() statement, if both of the two integers
	 * are positive, output will be the sum of them. If both of the two integers are
	 * negative, output will be the multiplication of them. Otherwise; output will
	 * be “I cannot add or multiply different signed numbers”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int i1 = scan.nextInt();
		System.out.println("Please enter another integer");
		int i2 = scan.nextInt();

		if (i1 >= 0 && i2 >= 0) {
			System.out.println("sum : " + (i1 + i2));
		}
		if (i1 < 0 && i2 < 0) {
			System.out.println("multiplication : " + (i1 * i2));
		} else {
			if (i1 < 0 && i2 > 0 || i1 > 0 && i2 < 0) {
				System.out.println("I cannot add or multiply different signed numbers");
			}
		}
	}

}
