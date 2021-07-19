package practiseclass;

import java.util.Scanner;

public class SwitchStatement01R {
	/*
	 * Ask user to enter the number of a day then your programw ill type name of the
	 * day. Sunday =1 , Monday = 2 ,.....Saturday = 7.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.way

		System.out.println("Enter number of a day");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Enter a valid number");
		}

		// 2.way
		System.out.println("Enter number of a day");
		int dayy = scan.nextInt();

		switch (dayy) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid number");

		}

	}

}
