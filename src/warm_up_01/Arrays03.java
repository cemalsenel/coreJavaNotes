package warm_up_01;

import java.util.Scanner;

public class Arrays03 {

	/*
	 * Write a method that returns a sorted String using the following header:
	 * public static String sort(String s) sort("acedb") returns abcde Write a test
	 * program that prompts the user to enter a String and displays the sorted
	 * String.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see its sorted version");
		String s2 = scan.next().toLowerCase();

		System.out.println(sort(s2));

		scan.close();
	}

	public static String sort(String s) {

		char[] arr = s.toCharArray(); // c,o,m,p,u,t,e,r,a
										// a,o,m,p,u,t,e,r,c
										//
		for (int i = 0; i < s.length() - 1; i++) {

			char currentMin = arr[i]; // I assume that the iteration letter is the smallest
			int currentMinIndex = i; // I took its index

			for (int j = i + 1; j < s.length(); j++) { // I'm comparing the iteration letter to the rest of the array

				if (arr[j] < currentMin) { // I'm updating the smallest
					currentMin = arr[j];
					currentMinIndex = j;
				}
				/*
				 * iter letter --> c index = 0 minLet --> a minInd = 8 arr[8]
				 */
			}
			if (currentMinIndex != i) {
				arr[currentMinIndex] = arr[i]; // to where = what
				arr[i] = currentMin;
			}
		}

		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}

		return str;
	}

}
