package practiseclass;

import java.util.Scanner;

public class PractiseClassGrade01 {
	/*
	 * Type java code by using if-else if() statement. A school has following rules
	 * for grading system: 1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From
	 * 80 to 100 - A Ask user to enter marks and print the corresponding grade.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter grade");
		double grade = scan.nextDouble();
		
		if(grade < 50 && grade >=0) {
			System.out.println("Grade : " + "D");
		}
		if (grade >50 && grade < 59) {
			System.out.println("Grade : " + "C");
			
		}
		if(grade >60 && grade <80) {
			System.out.println("Grade : " + "C");
			
		}
		if(grade >80 && grade <= 100) {
			System.out.println("Grade : " + "A");
		}else {
			if(grade>100 || grade <0) {
				System.out.println("Wrong Input");
			}
		}
		
		
		
		
		
	}

}
