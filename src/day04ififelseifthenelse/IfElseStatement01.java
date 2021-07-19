package day04ififelseifthenelse;

import java.util.Scanner;


public class IfElseStatement01 {

	
	public static void main(String[] args) {

		// "If else" method : Java just runs one of them. Both of them cannot be run
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width and lenght of a square");
		double width = scan.nextDouble();
		double lenght = scan.nextDouble();

		if (width <= 0 || lenght <= 0) {
			System.out.println("Width and Lenght cannot be negative or zero");
		} else {
			if (width == lenght) {
				System.out.println("Square");
			} else {
				System.out.println("Rectangle");
			}scan.close();

		}

	}

}
