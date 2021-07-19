package javaoffice;

import java.util.Scanner;

public class Questions_05_ReverseString {

	/*
	   Write a java program which accept a sentence as parameter, 
	   than reverses sentence by using StringBuilder
	   and checks if sentence is palindrome or not
	   (without case sensitivity)
	   
	   EX : 
	   Input : I love Java
	   Output: 
	   "Reversed sentence : avaJ evol I . 
	   It is not a palindrome"
	 */
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your sentence");
			String input= scan.nextLine();
			
			StringBuilder str = new StringBuilder();
			str.append(input);
			
			String reversedInput = str.reverse().toString();
			
			if(input.equalsIgnoreCase(reversedInput)) {
				System.out.println("Reversed sentence :"+reversedInput+" \nThe string is Paindrome");
			}
			else {
				System.out.println("Reversed sentence : "+reversedInput+" \nIt is not a Palindrome");


	}

		}
}
