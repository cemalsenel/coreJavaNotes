package javaofficehours;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 Ask user to type a name, the length of name should be 3.
		Then check if the name has same characters.
		If the String has same characters
			Print “String has duplicate characters”
		Else
			Print “String has unique characters”
			
			Use ternary
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a name that has 3 characters");
		String name = scan.next();
		
		char c1 = name.charAt(0);
		char c2 = name.charAt(1);
		char c3 = name.charAt(2);
		
		String result = name.length() ==3 && c1 == c2 || c1 == c3 || c2==c3 ?
				        "String has duplicate characters" :
				        	"String has unique characters";
		System.out.println(result);
	}

}
