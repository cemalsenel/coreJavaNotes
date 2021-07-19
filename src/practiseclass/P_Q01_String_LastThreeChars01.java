package practiseclass;

import java.util.Scanner;

public class P_Q01_String_LastThreeChars01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to take the last three characters from a given string
		 * and add the three characters at both the front and back of the string. String
		 * length must be greater than three and more. 
		 * INPUT : Ankara OUTPUT :
		 * araAnkaraara
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String str = scan.next();
		if(str.length()>3) {
			String str1 = str.substring(str.length()-3);
			System.out.println(str1 + str+str1);
		}else {
			System.out.println("Re-write a word");
		}
		
		
	}

}
