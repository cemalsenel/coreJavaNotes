package deneme;

import java.util.Scanner;

public class Question_While_Loop {

	public static void main(String[] args) {
		// while1();
		// while2();
		// while3();
		// while4();
		// while5();
		while6();
		

	}

	public static void while1() {
		/*
		 * Type java code by using while loop, Write a program to print numbers from 1
		 * to 5.
		 */
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

	}

	public static void while2() {
		/*
		 * Type java code by using while loop. Write a program that types first 30
		 * consecutive odd integers.
		 */
		int i = 1;
		while (i < 30) {
			System.out.println(i);
			i += 2;
		}
	}

	public static void while3() {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input a positive integer. It should then print the multiplication table of
		 * that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer");
		int num = scan.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(num * i);
			i++;
		}

	}

	public static void while4() {
		/*
		 * 4)Type java code by using while loop, Write a program that prompts the user
		 * to input a positive integer. It should then print factorial of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer");
		int num = scan.nextInt();

		int i = 1;
		long fact = 1;
		while (i < num) {
			fact = fact * i;
			++i;
		}
		System.out.println(fact * i);
	}

	public static void while5() {
		/*
		 * Type java code by using while loop, Write a program to count the factors of
		 * an integer which is entered by user.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int i = scan.nextInt();
		while (i > 0) {
			System.out.println(i);
			i--;
		}

	}

	public static void while6() {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input an integer. It should then find sum of the digits of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int i = scan.nextInt();
		int sum =0;
		while(i>0) {
			sum = i+sum;
			i--;
		}System.out.println(sum);
		
	}

}
