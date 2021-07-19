package day10forloops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		productOfInt();

	}
	/*Interview Question
	 * Ask user to enter beginning and ending values. Type code to calculate the
	 * multiplication of the integers from the begnning to ending values
	 * 
	 * That question can be asked like :
	 * Type code to calculate the factorial of given number
	 */

	public static void productOfInt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting integervalue");
		int s = scan.nextInt();
		System.out.println("Enter the ending value");
		int e = scan.nextInt();

		int product = 1;

		for (int i = s; i <= e; i++) {
			product = product * i;
		}
		System.out.println(product);
		scan.close();

	}

}
