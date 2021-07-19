package day02scanner;

import java.util.Scanner;

public class ScannerClassHomework02 {
	public static void main(String[] args) {
		
		/*
		 * 2)Type a program which calculates the perimeter of a triangle whose
Side lengths are entered by user. (Use byte)
Hint 1: Perimeter of a triangle is a + b + c
Hint 4: To get byte, use nextByte()
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first side of triangle");
		byte side1 = scan.nextByte();
		System.out.println("Please enter second side of triangle");
		byte side2 = scan.nextByte();
		System.out.println("Please enter third side of triangle");
		byte side3 = scan.nextByte();
		System.out.println("Perimeter of triangle : " + (side1+side2+side3));
		
		
		
		
		
		
		
		
	}

}
