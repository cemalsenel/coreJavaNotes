package day04ififelseifthenelse;

import java.util.Scanner;

public class Ifstatement03 {
	/*
	 * Get the name of day from user Type java code by using if statement When you
	 * enter a day of a week, output will be "Weekday" or " Weekend day" according
	 * to the name of day
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter name of a day");
		String dayName = scan.next().toLowerCase();

		// To compare Strings "do not use "==" Use "equals()" method.
		// "==" checks both "references" and " values". If both are same then Java tells
		// the Strings are same.Otherwise it tells Strings are different.
		// "equals()" checks just the values.
		// "equals()" just checks values. Not the references. If the values are same
		// Java tells the Strings are same.
		// "Ali".equals("Veli"); ==>false ,"Ali".equals("Ali"); ==>true ,
		// "Ali".equals("ali"); ==>false (Java works by ASCII values)
		// !dayName.equals("monday")==> means "Not to equal to monday"

		if (dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday")
				|| dayName.equals("thursday") || dayName.equals("friday")) {
			System.out.println("Week day");
		}

		if (dayName.equals("saturday") || dayName.equals("sunday")) {
			System.out.println("Weekend day");
		}

		if (!dayName.equals("monday") && !dayName.equals("tuesday") && !dayName.equals("wednesday")
				&& !dayName.equals("thursday") && !dayName.equals("friday") && !dayName.equals("saturday")
				&& !dayName.equals("sunday")) {
			System.out.println("Enter a valid day");
		}scan.close();

	}

}
