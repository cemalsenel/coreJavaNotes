package day02scanner;

import java.util.Scanner;

public class ScannerClassHomework03 {

	public static void main(String[] args) {
		/*
		 * 3)Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value of mile");
		double mile1 = scan.nextDouble();
		System.out.println("Equivalency of mile is : " + (mile1*1.6));

	}

}
