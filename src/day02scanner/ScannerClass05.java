package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter yout first name and last name");
		String fullName = scan.nextLine();
		//If you wanna get a String data from user, use nextLine () method
		//nextLine () method gets full String which user entered
		System.out.println("Your full name is : "+fullName);
		
		System.out.println("Enter your kid's first name");
		//If you wanna get String data from user, you can use next () method as well
		//But next () method is used to get just the first word
		//For example user entered "Ali Can" ==>nextLine() method returns "Ali Can"
		//                                   ==>next() method just returns "Ali"
		String kidFirstName = scan.next();
		System.out.println("Kid first name is : " + kidFirstName);
		
		


	}

}
