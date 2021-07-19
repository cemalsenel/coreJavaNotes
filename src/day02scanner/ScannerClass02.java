package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a side of the square : ");
		double side = scan.nextDouble();
		System.out.println("Area of square : " + (side * side));
		System.out.println("Perimeter of square :" + ( 4 * side));
		
		
		
		
		
		
		
		
	}

}
