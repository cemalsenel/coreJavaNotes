package practiseclass;

import java.util.Scanner;

public class DoWhile001 {

	public static void main(String[] args) {
		printEven();
		/*
		 Ask user to enter an integer
  		If the integer is even print on the console “You won!”
	 	Otherwise ask user to enter another integer
		 */

	}
	public static void printEven() {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.println("Enter an integer");
			num =  scan.nextInt();
		}while(num%2!=0);
		System.out.println("You won");
	}

}
