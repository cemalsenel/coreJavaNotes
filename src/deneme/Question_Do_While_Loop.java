package deneme;

import java.util.Scanner;

public class Question_Do_While_Loop {

	public static void main(String[] args) {
		// dowhile1();
		// dowhile2();
		// dowhile3();
		// dowhile4();
		dowhile5();

	}

	public static void dowhile1() {
		/*
		 * Write a program to print numbers from 1 to 5 on the console by using do-while
		 * loop.
		 */
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

	}

	public static void dowhile2() {
		/*
		 * Write a program to print numbers from 10 to 3 on the console by using
		 * do-while loop.
		 */
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i > 2);
	}

	public static void dowhile3() {
		/*
		 * Write a program to print numbers which are divisible by 5 between 1 and 100
		 * on the console by using do-while loop.
		 */
		int i = 1;
		do {
			if (i % 5 == 0) {
				System.out.println(i);
			}

			i++;

		} while (i <= 100);
	}

	public static void dowhile4() {
		/*
		 * Write a program to print letters from c to m on the console by using do-while
		 * loop.
		 */
		char ch = 'c';

		do {
			System.out.println(ch);
			ch++;
		} while (ch <= 'm');

	}

	public static void dowhile5() {
		/*
		 * Ask user to enter a number. If the number is divisible by 10 then print
		 * "Won!" on the console otherwise ask user to enter another number. Use
		 * do-while loop.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();

		do {
			if (num % 10 == 0) {
				System.out.println("Won");
			} else {
				System.out.println("Try again");
			}
		} while (num % 10 != 0);

	}

}
