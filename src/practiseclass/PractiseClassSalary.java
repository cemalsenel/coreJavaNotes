package practiseclass;

import java.util.Scanner;

public class PractiseClassSalary {
	/*
	 * Ask user to enter annual salary, if the salary is more than or equal to
	 * $80.000 output will be ?I accept the offer?, if the salary is between $60.000
	 * and $80.000 out put will be ?I negotiate to increase?, otherwise output will
	 * be ?I do not accept the offer.?
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entere your salary");
		double salary = scan.nextDouble();

		if (salary >= 80000) {
			System.out.println("I accept the offer");

		}
		if (salary < 80000 && salary > 60000) {
			System.out.println("I negotiate to increase");

		}
		if (salary < 60000 && salary > 0) {
			System.out.println("I dont accept offer");
		} else 

			if (salary < 0) {
				System.out.println("Invalid number");
			}
		

	}

}
