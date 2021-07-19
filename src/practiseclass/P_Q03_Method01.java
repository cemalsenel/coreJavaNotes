package practiseclass;

import java.util.Scanner;

public class P_Q03_Method01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num =scan.nextInt();
		System.out.println(isEven(num));
		scan.close();
		/*
		 * Write a method named isEven that accepts an integer argument.
	 The method should return true if the argument is even, or false otherwise.
		 */

	}
	public static boolean isEven(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
		
		
		
		
	}

}
