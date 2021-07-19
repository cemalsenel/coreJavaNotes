package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		String fullName = scan.nextLine();
		
		
		System.out.println("Please enter your first name");
		String firstName = scan.next();
		//After using nextLine(), if you use any other method like "next()"
		//type "scan.nextLine();" once
		scan.nextLine();
		System.out.println("Please enter your address");
		String address = scan.nextLine();
		
		
		System.out.println("Your Address is : " + address);
		
		System.out.println("Your full name is : " + fullName);
		
		System.out.println("Your first name is : " + firstName);

	}

}
