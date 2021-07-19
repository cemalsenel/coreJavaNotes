package day02scanner;

import java.util.Scanner;

public class ScannerClassHomework04 {

	public static void main(String[] args) {
		/*
		 * 4)Type a program which converts the hours to seconds. Hours value will be
entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use nextLong()
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter hour value");
		long hour1 = scan.nextLong();
		System.out.println("Equivalency of hour according to seconds : " + (hour1*60*60));

	}

}
