package practiseclass;

import java.util.Scanner;

public class Substring01 {

	public static void main(String[] args) {
		/*
		 * A part of a String called substring. substring() method of String class is
		 * used for getting a substring from the String. We use substring method to get
		 * a part of a String by using indexes
		 */

		String s1 = "Java is Java";
		System.out.println(s1.substring(5));// is Java
		// index is inclusive
		System.out.println(s1.substring(7));// Java
		// s1.substring(0) and System.out.println(s1) returns the same String
		System.out.println(s1.substring(0));// Java is Java
//		System.out.println(s1.substring(s1.substring(s1.length()-1))));
		//System.out.println(s1.substring(13));

		// We have two types of error messages:
		// 1) While we type our codes we get "red underline" this is called "Compile
		// Time
		// Error"
		// 2) While we type our codes we do not get any red underline but after running
		// our codes ,we get red messages on the console,it is "Run Time Error"

		/*
		 * Ask user to enter a String If the first and the last character of the String
		 * are same print "Wooow!" otherwise, print "Hmmmm!" on the console
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a string");
		String str1 = scan.nextLine();
		
		String first = str1.substring(0, 1);  // str1.indexOf(0)..is also possible or str1.charAt(0)
		String last = str1.substring(str1.length()-1);
		if (first.equalsIgnoreCase(last)) {
			System.out.println("woow");
		}else {
			System.out.println("hmm");
		}

	}

}
