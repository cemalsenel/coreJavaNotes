package practiseclass;

import java.util.Scanner;

public class P_Q02_String_FullName {
	/*
	 Ask user to enter their fullname as two words.
	 Convert their full name as following :
	 INPUT : JULIA ROBERTS  -->  OUTPUT :Julia ROBERTS
	 (Initial of the firstname should be uppercase and the rest of firstname should be
	 lowercase. All letters of lastname should be in uppercase)
	 */

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter your first name ");
	        String firstName = scan.next();
	        System.out.println("Please enter your last name ");
	        String lastName = scan.next();
	        
	        String firstNameFirst = firstName.substring(0,1).toUpperCase();
	        String firstNameLast = firstName.substring(1).toLowerCase();
	        
	        String newLastName = lastName.toUpperCase();
	        
	        System.out.println("This is your fullname :" +firstNameFirst+firstNameLast+" "+newLastName);
	        
	        scan.close();

	}

}
