package day07stringmethods;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
		// 12. endsWith() Method:
		// endsWith() method is used to check the last character or characters in a
		// String.
		// endsWith() method is used with Strings.Do not use it with "char".
		// endsWith() method can be used with multiple characters as well.
		// endsWith() method returns "boolean"

		String str = "Java is Java";
		/*
		 * System.out.println(str.endsWith("a"));//true
		 * System.out.println(str.endsWith("x"));//false
		 * System.out.println(str.endsWith("ava"));//true
		 */
		// 13. startsWith() :
		// startsWith() method is used to check the last character or characters in a
		// String.
		// startsWith() method is used with Strings.Do not use it with "char".
		// startsWith() method can be used with multiple characters as well.
		// startsWith() method returns "boolean"
		/*
		 * System.out.println(str.startsWith("J"));// true
		 * System.out.println(str.startsWith("Java")); //If you want to check the
		 * character in a specific index do the following.
		 * System.out.println(str.startsWith("i", 5)); //true
		 * System.out.println(str.startsWith("is", 5));//true
		 */
		// 14. isEmpty() returns boolean. Inside parenthesis we don't use anything. Used
		// to check if String has zero character or not.
		// If a String has no any character , isEmpty() returns true , otherwise returns
		// false.

		/*
		 * System.out.println(str.isEmpty());//false
		 * 
		 * String str2 = "" ; System.out.println(str2.isEmpty());//true
		 */

		// 15.way: replace() method is used to change a specific character or characters
		// to another one . Strings are unchangeable.
		System.out.println(str.replace("a", "x"));
		System.out.println(str);
		System.out.println(str.replace("ava", "x"));
		System.out.println(str.replace("a", "xxxxxxxx"));
		//replace() method can be used to delete character or characters
		System.out.println(str.replace("ava", ""));
		//In replace method char and String both can be used.
		System.out.println(str.replace('a', 'x'));
		// System.out.println(str.replace('a', "x")); ==> char cannot be reverse to String or reverse of this. and char must be single character
		
		
		//16.replaceAll() method does the same with replace() method but there are some differences:
		                                                                  //1.In replaceAll() you cannot use chars but in replace() you can.
		                                                                  //2.In replaceAll()  you can use "Regular Expression"s 
		System.out.println(str.replaceAll("a", "x"));
		
		/*
		 *  Regular Expressions ==>1) \\s : space character 
		 *                         2) \\S : all characters except space character
		 *                         3) \\w : a->z  A->Z   _  0->9.. to change these characters to another ones, this method is possible to use
		 *                         4) \\W : All characters except   a->z  A->Z   _  0->9
		 *                         5) \\d : 0->9 (just digits)
		 *                         6) \\D : All characters except 0->9
		 *                         
		 *        
		 */                         
		String str3 = "Java123 learn, earn_money!!  .";
		System.out.println(str3.replaceAll("\\s", "*"));
		System.out.println(str3.replaceAll("\\S", "*"));
		System.out.println(str3.replaceAll("\\w", "*"));
		System.out.println(str3.replaceAll("\\W", "&"));
		System.out.println(str3.replaceAll("\\d", "@"));
		System.out.println(str3.replaceAll("\\D", "+"));
		
		
		//17.way : replaceFirst() changes just the first occurrence of the character.
		System.out.println(str3.replaceFirst("a", "*")); 
		
		//18.Way : substring()  method is used to get a part of the String by using indexes. Index is inclusive.
		String str4 = "Java is the best";
		System.out.println(str4.substring(3));
		System.out.println(str4.substring(7));
		// System.out.println(str4.substring(0)); and System.out.println(str4); are same.
		System.out.println(str4.substring(0));
		//If you use last it returns last character because indexes used in substring() are inclusive
		System.out.println(str4.substring(15));
		// If you use length in substring() method it returns "nothing"
		System.out.println(str4.substring(16));
		//If you use any index greater than the length it returns "StringIndexOutOfBoundsException"
		//System.out.println(str4.substring(17));

		/*
		 Ask user to enter a String
		 If the first and the last character of the String are same
		 print "Woow!" on the console.
		 Otherwise print "Hmmm!" on the console.
		 */
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("Enter a String");
		String strr = scan.nextLine();
		//length()-1 ==> every time gives the last character
		String last = strr.substring(strr.length()-1);
		//substring() can be used with 2 parameters.
		//First parameter is starting index(inclusive) , second parameter is ending index(exclusive)
		String first = strr.substring(0, 1);
		
		if (last.equals(first)) {
			System.out.println("Wooow!");
		}else {
			System.out.println("Hmmm!");
		}
		
		
		String str5 ="Java is an OOP language";
		
		System.out.println(str5.substring(5, 14));//is an OOP
		System.out.println(str5.substring(2, 4));//va
		//If starting end ending indexes are same , you get nothing
		System.out.println(str5.substring(2, 2));//nothing
		//In substring() method, starting index cannot be larger than ending index.
		//If you do it, you get  StringIndexOutOfBoundsException"
		System.out.println(str5.substring(3, 2));
		
		/*
		 When we type codes we may get two types of error messages.
		 1) While you type code you may get "red underline",this type of error is called "Compile Time Error"
		 2) While you type code you do not get "red underline", but when you after run the code  , you will get
		 some red messages on the console. That kind of errors are called "Run Time Error" 
		 
		 */
		
		
		
		
		
		
		
		
		
	}

}
