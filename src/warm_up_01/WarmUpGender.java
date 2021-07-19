package warm_up_01;

import java.util.Scanner;

public class WarmUpGender {
	/*
	 * Type a program that ask user their age and gender If age is greater than 18
	 * and if gender is male then print man, If age is greater than 18 and if gender
	 * is female then print woman If age is less than 18 and if gender is male then
	 * print boy If age is less than 18 and if gender is female then print girl on
	 * the console
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("Enter your gender");
		char gender = scan.next().toUpperCase().charAt(0);

		if (gender == 'M' || gender == 'F') {
			if (age >= 18) {
				if (gender == 'M') {
					System.out.println("Man");
				} else {
					System.out.println("Woman");
				}
			}

			else {
				if (gender == 'M') {
					System.out.println("Boy");
				} else {
					System.out.println("Girl");
				}
			}
		} else {
			System.out.println("Invalid input");
		}

	}
}
