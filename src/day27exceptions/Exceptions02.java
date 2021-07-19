package day27exceptions;

import java.util.Scanner;

public class Exceptions02 {
	/*
	Get a String from user
 	Convert it to an integer
 	Return the integer after multiplying by 2
 	Your code should not be blocked for any String
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter an integer");
	String num = scan.next();
	int num1 = Integer.parseInt(num);
	System.out.println(num1*2);
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to convert to integer");
		String str = scan.nextLine();
		System.out.println(convertStringToInt(str));
		
		scan.close();
	}
	

public static int convertStringToInt(String str) {
	
	int a =0;
	try {
		a =Integer.parseInt(str);
	}catch(NumberFormatException e) {
		System.out.println(str + " cannot be converted to integer");
	}
	return a*2;
}

}
