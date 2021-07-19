package javaoffice;

import java.util.Scanner;

public class Questions_07_GoodPassword {
	/*
	 * Write a program Ask user to create a password 
	 * it should have at least 
	 * 1 Special char “!@#$%^&*()_+” 
	 * 1 Uppercase letter “A” 
	 * 1 Lowercase letter “a” 
	 * 1 Digit “0123456789" 
	 * The minimum length of the password should be 8
	 * If everything is OK, print message as “Password creation successful!”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your password should have at least \r\n"
				+ "	 * 1 Special char “!@#$%^&*()_+” \r\n"
				+ "	 * 1 Uppercase letter \r\n"
				+ "	 * 1 Lowercase letter \r\n"
				+ "	 * 1 Digit “0123456789\" \r\n"
				+ "	 * The minimum length of the password should be 8");
		
		
		String password=scan.next();
		
		String specChar = "!@#$%^&*()_+";
		String nums = "0123456789";
		int countChar=0;
		int countUppercase=0;
		int countLowercase=0;
		int countDigit=0;
		
		
		for (int i = 0; i < password.length(); i++) {
		//Check special characters
			if(specChar.contains(password.substring(i,i+1))) {
				countChar++;
			}
		//Check uppercase letter
			if(password.charAt(i)>='A'&&password.charAt(i)<='Z') {
				countUppercase++;
			}
		//Check lowercase letter
			if(password.charAt(i)>='a'&&password.charAt(i)<='z') {
				countLowercase++;
			}
			
		//Check digit
			if(Character.isDigit(password.charAt(i))) {
				countDigit++;
			}
			
		}
		
		if(password.length()>=8) {
			if(countChar>0&&countDigit>0&&countLowercase>0&&countUppercase>0) {
				System.out.println("Password creation is successfull");
			}else {
				System.out.println("You should control your password");
			}
		}else {
			System.out.println("Password length has to be at least 8");

	}

}
}
