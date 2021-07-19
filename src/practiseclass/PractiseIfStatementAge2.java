package practiseclass;

import java.util.Scanner;

public class PractiseIfStatementAge2 {
	/*
	 * Ask user to enter his/her age and gender. If the age is more than 65 and the
	 * gender is male then output will be “Hey man you retired!” else output will be
	 * “No need to work”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		System.out.println("Please enter your gender");
		char gender = scan.next().toLowerCase().charAt(0);
        
        	if (age > 65 && gender == 'm') {
    			System.out.println("Hey man , You are retired,no need to work");
    		} else {
    			 
        			System.out.println("Unvalid references");

        		}scan.close();
    		}
        
		
		

	}


