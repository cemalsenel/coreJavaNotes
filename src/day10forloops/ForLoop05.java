package day10forloops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		drawTriangle();
	}

	/*
	 * Ask user to enter a positive integer Create and print the following image on
	 * the console * * * * * * * * * * . . .
	 */
	public static void drawTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int s = scan.nextInt();
		
		
		//To run the inner codes for every row
		for(int j=1; j<=s;      j++) {
			
			//to draw " "
			for(int i=s-j; i>0;      i--) {
				//Do not use "println" because, you should print spaces on the same line
				System.out.print(" ");
			}
			
			//to draw "* "
			for(int k=1; k<=j;       k++) {
				System.out.print("* ");
			}
			//to move pointer to the next line
			System.out.println();
		}
		
		scan.close();
	}

	}


