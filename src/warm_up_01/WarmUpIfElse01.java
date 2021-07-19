package warm_up_01;

import java.util.Scanner;

public class WarmUpIfElse01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is even or odd");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("You entered an even number");
		} if(num1 % 2 != 0 ) {
			System.out.println("You entered an odd number");
		}sc.close();

	}

}
