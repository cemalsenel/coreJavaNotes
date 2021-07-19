package javaoffice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Questions_01_Arrays_Char {

	public static void main(String[] args) {
		/*
		 * * Create a custom return type method accepts a name as parameter and prints
		 * the name as a char array
		 *
		 * (do not use toCharArray() method)
		 *
		 * Input : John Output : [J, o, h, n]
		 */
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter a string");
//		String str = scan.nextLine();
//		String arr[] =str.replaceAll(" ", "").split("");
//		System.out.println(Arrays.toString(arr));
		String input = "John";
		charArray(input);

		
		

	}
	private static void charArray(String input) {
		char[] output = new char[input.length()];
		
		for (int i = 0; i < output.length; i++) {
			output[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(output));
	}


}
