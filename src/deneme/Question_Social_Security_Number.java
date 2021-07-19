package deneme;

import java.util.Scanner;

public class Question_Social_Security_Number {
	/*
	 * Ask user ta enter his/her first name, last name and Social Security Number.
	 * Then type a program which makes a) initials of the first name and the last
	 * name in uppercase, other characters will be in lowercase. b) all characters
	 * except last 4 characters of the Social Security Number “ * ”.
	 * 
	 * For example; Suleyman Alptekin *****5678
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
		System.out.println("Please enter your last name");
		String lastName = scan.next();
		System.out.println("Please enter your social security number");
		String pwd = scan.next();

//		char ch1 = name.toUpperCase().charAt(0);
//		char ch2 = lastName.toUpperCase().charAt(0);
//		String name = name.substring(1);
//		String lastName = lastName.substring(1);
//		String pass =pwd.substring(0, 4) + pwd.substring(3).replaceAll( "\\d", "*");
//
//		System.out.println("Name : " + ch1 + nam);
//		System.out.println("Last Name :" + ch2 + lastNam);
//		System.out.println("Your Social Security Number is : " + pass  );

		String nameNew = name.toUpperCase().substring(0, 1);
		String nameNewS = name.toLowerCase().substring(1);
		String lastNameNew = lastName.toUpperCase().substring(0, 1);
		String lastNameNewS = lastName.toLowerCase().substring(1);
		String pwdNew = pwd.substring(0,pwd.length()-4).replaceAll("\\d", "*");
		String pwdNewS = pwd.substring(pwd.length()-4);
		String result =  nameNew.concat(nameNewS)+" " + lastNameNew.concat(lastNameNewS) + " " +pwdNew.concat(pwdNewS);
		
		if(pwd.length() != 11) {
			System.out.println("Please enter a valid password");
		}else {
			System.out.println(result  );
		}

	}

}
