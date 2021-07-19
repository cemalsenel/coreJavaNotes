package practiseclass;

import java.util.Scanner;

public class NestedTernary01R {
	/*
	 * Ask user to enter an integer. If the integer is not negative then check. If
	 * it is less than 10 then return "The integer is digit" If the integer is
	 * negative return "negatives cannot be a digit" Use nested ternary
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int a = scan.nextInt();

		String result = (a >= 0 ? (a < 10 ?  "The integer is digit" : "The integer is not  a digit")
				: "Negatives cannot be a digit");
		System.out.println(result);
	}

}