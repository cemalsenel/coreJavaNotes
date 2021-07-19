package warm_up_01;

import java.util.Scanner;

public class Arrays02 {

	/*
	 * Write a program that prompts user to enter a String, and counts and displays
	 * the number of both lowercase and uppercase vowels in the String. char[]
	 * vowels = {'a','e','i','o','u','A','E','I','O','U'}
	 */
	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		// 0 , 1 , 0 , 1 , 1 , 0 , 0 , 0 , 0 , 0
		int[] count = new int[vowels.length];
		Scanner scan = new Scanner(System.in); // computer
		System.out.println("Enter a String to see the occurrences of vowels");
		String s = scan.next();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (s.charAt(i) == vowels[j]) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println("The occurrence of " + vowels[i] + " is " + count[i]);
			}
		}
		scan.close();
	}
}
