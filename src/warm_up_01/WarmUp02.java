package warm_up_01;


import java.io.InputStream;
import java.util.Scanner;



public class WarmUp02 {

	public static void main(String[] args) {
		
		   
		
		
		/*
		  Scanner sc = new Scanner(System.in);
		 
		
		System.out.println("Please enter a number");
		
		double age = sc.nextDouble();
		
		if(age<0) {
			System.out.println("Error");
		}
		else if(age < 16 ) {
			System.out.println("Too Young");
		}else if(age < 75) {
			System.out.println("Welcome");
		}else {
			System.out.println("Really");
		}
		 */
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter age");
		 int age = sc.nextInt();
		 System.out.println("Please enter money");
		 int money = sc.nextInt();
		 
		 
		if(!(age>18) || (money > 500)) {
			System.out.println("Welcome");
		}else {
			if(age<18 || money<500) {
				System.out.println("Try again");
			}
		}	
	}

	
	
	}


