package javaofficehours;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there isn’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
		System.out.println("Please enter your last name");
		String lastName = scan.next();
		System.out.println("Please enter your credit card number");
		String pwd = scan.next();
		

		String newName= name.toUpperCase().substring(0, 1).concat(name.substring(1).replaceAll("\\w", "*")) ;
		String newLastName=lastName.toUpperCase().substring(0, 1).concat(lastName.substring(1).replaceAll("\\w", "*"));
		System.out.println(newName +" " + newLastName);
		//String newPwd =  pwd.substring(0, 12).replaceAll("\\d", "*").concat(pwd.substring(13, 16));
		String ccn = "**** **** **** " + pwd.substring(12);
		if(pwd.length()==16) {
			System.out.println(ccn );
		}else {
			System.out.println("Invalid Password");
		}

	}

}
