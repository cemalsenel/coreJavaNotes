package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement03 {
	/*
	 * Ask user to enter any name of the days, then get second ,fourth, and sixth
	 * letter of the day name and print them on the console, in the same line. For
	 * example; if the user enters “Monday” output will be “ody”
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name of a day");
		String dayName = scan.next();

		/*
		 * dayName.charAt(1); dayName.charAt(3); dayName.charAt(5);
		 */

		if (dayName.equalsIgnoreCase("monday") || dayName.equalsIgnoreCase("tuesday")
				|| dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("thursday")
				|| dayName.equalsIgnoreCase("friday") || dayName.equalsIgnoreCase("saturday")
				|| dayName.equalsIgnoreCase("sunday")) {
			System.out.print(dayName.charAt(1));
			System.out.print(dayName.charAt(3));
			System.out.println(dayName.charAt(5));
		} else {
			System.out.println("Please enter a valid day name");
		}scan.close();

	}

}
