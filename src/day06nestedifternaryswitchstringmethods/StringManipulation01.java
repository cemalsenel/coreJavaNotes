package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class StringManipulation01 {
	/*
	 * String Methods 1.ToUpperCase() 2.ToLowerCase() 3.charAt() 4.equals()
	 * 5.equalsIgnoreCase() 6.Length() 7.next() 8.nextLine() 9.indexOf()
	 * 10.lastIndexOf() 11.contains()
	 */

	public static void main(String[] args) {

		String str = "Java is easy if you study";
		// indexOf() returns the index of first occurrence of the character
		System.out.println(str.indexOf("i"));
		// indexOf() method accepts char as parameter
		System.out.println(str.indexOf('i'));
		// If the character does not exist in the String, it returns negative "-1"
		System.out.println(str.indexOf("x"));
		// If you use multiple characters in indexOf() ,it returns the index of first
		// character.
		System.out.println(str.indexOf("easy"));
		// If you use indexOf() with 2 parameters, Java looks fro the character after
		// the given index
		System.out.println(str.indexOf("i", 8));
		// Second parameter is inclusive
		System.out.println(str.indexOf('e', 8));

		/*
		 * Ask user to enter a String and a character, then check if the String has the
		 * character
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String then enter a character");
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		String result = s.indexOf(ch) == -1 ? "The String has no the character" : "The string has the character";
		System.out.println(result);
		

		// 10.lastIndexOf() returns the index of last occurrence of the character
		String t = "Java ah Java";
		t.lastIndexOf('a');
		// In lastIndexOf() method you can use char and String. Both are acceptable
		System.out.println(t.lastIndexOf('a'));
		System.out.println(t.lastIndexOf("a"));
		// lastIndexOf() method returns -1 , if the character does not exist in the
		// String
		System.out.println(t.lastIndexOf("w"));
		// lastIndexOf() returns the index of first character of last occurrence of
		// "Java"
		System.out.println(t.lastIndexOf("Java"));
		// If you use lastIndexOf() with 2 parameters, get the character starting with
		// the index and to the begining of the String
		// In the following example we are using "Java a"
		System.out.println(t.lastIndexOf("J", 5));
		System.out.println(t.lastIndexOf("v", 5));

		/*
		 * /Ask user to give you a String and a character. If the character does not
		 * exist in the String or exist just once print " Not Good". If the character is
		 * used multiple times, print "Woow!"
		 * 
		 */
		
		System.out.println("Enter a String the enter a character");
		String s1 = scan.nextLine();
		char ch1 = scan.next().charAt(0);
			
	    if(s1.indexOf(ch1)==-1 || s1.indexOf(ch1)==s1.lastIndexOf(ch1)) {
	    	System.out.println("Not good!");
	    }
	    if(s1.indexOf(ch1) != s1.lastIndexOf(ch1)) {
	    	System.out.println("Wooow!");
	    }
		// 11.contains() is used to check if a single character or multiple characters
		// exist in a String. contains() method returns boolean
		//contains() method cannot be used with chars, you have to use Strings
		String r = "Learn Java , earn money";
		System.out.println(r.contains("i"));//true
		System.out.println(r.contains("x"));//false
		
		System.out.println(r.contains("earn"));//true
		
	}

}
