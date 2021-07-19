package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter side of square");
		//double side = scan.nextDouble();
		//System.out.println("Area of square : " + side * side);
		//System.out.println("Perimeter of square : " + 4 * side);
		
		System.out.println("Please enter lenght of rectangle : ");
		double lenght = scan.nextDouble();
		System.out.println("Please enter width of rectangle : ");
		double width = scan.nextDouble();
		System.out.println(	"Area of rectangle : " + (lenght * width));
		System.out.println("Perimeter of rectangle : " + ( 2 * (lenght + width)));
		
		
		
		
		
		
		
		
		
	}

}
