package day03wrapperclassconcantelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 3 digit number");
		int a = scan.nextInt();
		int lastDigit = a%10;
		
		int num= a/10;
		int secondDigit = num%10;
		
		int firstDigit = a/100;
		System.out.println(firstDigit + secondDigit +  lastDigit);
		
		
		

	}

}
