package javaoffice;

import java.util.Scanner;

public class javaAdvance_04_RightTrianglePattern {

	public static void main(String[] args) {
		/*
		  Create Right Triangle pattern
		 *
		 * Example: Enter a number
					5
					
					 *
					 * *
					 * * *
					 * * * *
					 * * * * *
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		rightTrianglePattern(n);
		

	}
	public static void rightTrianglePattern(int n) {
		//create rows
		for(int i = 0 ; i<=n ; i++) {
			//create coloumns and characters (*)
			for(int j =0 ; j < i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	

}
