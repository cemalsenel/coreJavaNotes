package practiseclass;

import java.util.Scanner;

public class Ternary03R {
	/*
	 * Ask user to enter an integer. If the number has 3 digits, output will be
	 * “This number has 3 digits.” Otherwise, output will be “This number has no 3
	 * digits.” How can you decide the number of digits of an integer?
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a 3 digit number");
		int num = scan.nextInt();
		
		String result = (num<=999 && num>99) || (num>=-999 && num<-99) ? "This number has 3 digits" : "This number has no 3 digits";
		
		System.out.println(result);
		
		/*
		 * Ask user to enter a String. If the String has 2 characters, output will be
		 * “It is valid for state abbreviations” Otherwise, output will be “It is not
		 * valid for state abbreviations
		 */
		
		System.out.println("Please enter the abbreviation of a state");
		String abrv = scan.next();
		
		String result1 =abrv.length()==2 ? "It is valid for state abbreviations" : " It is not valid for state abbreviations";
		System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
