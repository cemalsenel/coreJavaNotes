package practiseclass;

import java.util.Scanner;

public class IfElsePractiseGrade {
	/*
	 * Type java code by using if-else if() statement. A school has following rules
	 * for grading system: 1. Below 50 - D 2. 50 to 59 - C 3. 60 to 79 - B. 4. From
	 * 80 to 100 - A Ask user to enter marks and print the corresponding grade.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your grade");
		int grade = scan.nextInt();
		
		if(grade<0) {
			System.out.println("Enter a valid grade");
			
		}else if(grade<50) {
			System.out.println("Your grade is " + grade+ " and it is D. " );
		}else if(grade<=59) {
			System.out.println("Your grade is " + grade+ " and it is C. " );
		}else if (grade<=79) {
			System.out.println("Your grade is " + grade+ " and it is B. " );
		}else if(grade <=100) {
			System.out.println("Your grade is " + grade+ " and it is A. " );
		}else {
			System.out.println("Unvalid grade");
		}
		
		

	}

}
