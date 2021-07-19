package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {
	
	public static void main(String[] args) {
		
//	int a = 12;
//	int b = 13;
//	System.out.println(a+b);
//	System.out.println(a*b);	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter first integer");
	int num1 = scan.nextInt();
	System.out.println("Please enter second integer");
	int num2 = scan.nextInt();
	System.out.println("Sum: "+ (num1+num2));
	System.out.println("Product :" + (num1*num2));
	System.out.println("Difference: " + (num1-num2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
