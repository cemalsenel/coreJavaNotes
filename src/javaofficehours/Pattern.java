package javaofficehours;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
//		rectangle();
//		triangle1();
//		triangle2();
//		triangle3();
		numTriangle();
	}

	public static void rectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int s = scan.nextInt();
		int ss = scan.nextInt();

		for (int i = 0; i <= s; i++) {
			for (int j = 0; j <= ss; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	public static void triangle1() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int numOfStars = scan.nextInt();

		for (int i = 1; i <= numOfStars; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = numOfStars - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void triangle2() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int s = scan.nextInt();

		for (int i = 1; i <= s; i++) {
			for (int j = s - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void triangle3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int s = scan.nextInt();
		
		for(int i = s ; i>0 ; i--) {
			for (int j = 1 ; j<=s-i ; j++) {
				System.out.print(" ");
			}
			for(int k = s ; k>s-i ; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void numTriangle() {
		int odd = 1;
		int size = 9;
		int noOfSpaces = size - 1;
		for (int i = 1; i <= size; i++) {
			int k = 0;
			for (int j = 1; j <= noOfSpaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= odd; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd = odd + 2;
			noOfSpaces = noOfSpaces - 1;
		}
	}

}
