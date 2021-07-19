package javaofficehours;

import java.util.Scanner;

public class Questions_Assignment03 {

	public static void main(String[] args) {
		/*
		 /*
          Ask the user to enter an email
         If it doesn't contain the @ sign, print "enter a valid email"
         If it only says "gmail.com" after the @ sign, print "email approved"
         If it says anything other than "gmail.com" after the @ sign, write "Please enter your gmail account"         
         INPUT : techproed.com OUTPUT : “enter a valid email”
         INPUT : techproed@gmail.com OUTPUT : “email approved”
         INPUT : techproed@hotmail.com OUTPUT : “Please enter your gmail account”
         */
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your e-mail");
//		String mail = scan.nextLine();
//		
//		if(!(mail.contains("@"))){
//			System.out.println("Enter a valid email");
//		}else  if(!(mail.contains("@gmail.com"))){
//			System.out.println("Please enter your gmail account");
//		}else {
//			System.out.println("Email approved");
//		}
		
		
		/*
        Print “Please enter your job title” 
        Create a String variable named “jobTitle” and get the data from the user. 
        Use the below test data to print the correct jobTitle. Example :
        if job Title is qa then print “Your job title is Quality Analyst” 
        test data: qa then print Quality Analyst 
        dev then print Developer 
        ba then print Business Analyst 
        pm then print Project Manager
       */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your job title");
//		String jobTitle = scan.next().toLowerCase();
//		
//		switch(jobTitle) {
//		case "qa":
//			System.out.println("Your job title is Quality Analyst");
//			break;
//		case "dev":
//			System.out.println("Your job title is Developer");
//			break;
//		case "ba":
//			System.out.println("Your job title is Business Analyst");
//			break;
//		case "pm":
//			System.out.println("Your job title is Project Manager");
//			break;
//			default:
//			System.out.println("Please enter a valid job title");
//		
//		}
		
		
		 /*
         Create a class : “NestedIfStatements”
  			ask user to enter 2 birth dates
			Get the year, months, and day as integer then find the older person using Nested if statements
		Examples:
		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
		int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
		Yusuf is Older           
		 	*/
		
//		Scanner scan = new Scanner(System.in);
//			System.out.println("Please enter two times year of birth ");
//			int birthOfYearYusuf = scan.nextInt();
//			int birthOfYearMehmet = scan.nextInt();
//			System.out.println("Please enter two times month of birth ");
//			int birthOfMonthYusuf = scan.nextInt();
//			int birthOfMonthMehmet = scan.nextInt();
//			System.out.println("Please enter two times  day of birth");
//			int birthOfDayYusuf = scan.nextInt();
//			int birthOfDayMehmet = scan.nextInt();
//			
//		if(birthOfYearYusuf <= birthOfYearMehmet ) {
//			if(birthOfMonthYusuf<=birthOfMonthMehmet) {
//				if(birthOfDayYusuf<=birthOfDayMehmet) {
//					System.out.println("Yusuf is older");
//				}else {
//					System.out.println("Mehmet is older");
//				}
//			}else {
//				System.out.println("Mehmet is older");
//			}
//		}else {
//			System.out.println("Mehmet is older");
//		}
		
		
		
		/* 
		Let's get 3 positive integers from the user    
		check if these three numbers are triangular.
		If it can be a triangle, let's check if it is an equilateral triangle.

		* The conditions of being triangle.
		a+b>c>a-b 
		a+c>b>a-c 
		b+c>a>b-c 

		* The conditions of being equilateral triangle.
		a=b=c  

		Let's print the following situations on the console.
		equilateral triangle
		only triangle
		not triangle
		         */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter 3 numbers");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		
//		if( a==0 || b==0 || c==0) {
//			System.out.println("Enter a valid length");
//		}else if(a==b && b==c) {
//			System.out.println("equilateral triangle");
//		}else  if(((a+b)>c && c>(a-b)) || ((a+c)>b && b>(a-c)) || ((b+c)>a && a>(b-c))){
//			System.out.println(" triangle");
//		}else {
//			System.out.println("not triangle");
//		}
		
		/* 
		Write the switch case java code that prints the day of the week when the user enters a number between 1 and 7.		
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter  number of a day");
		int day= scan.nextInt();
		
		switch(day) {
		case 1 : 
			System.out.println("Sunday");
			break;
		case 2 : 
			System.out.println("Monday");
			break;
		case 3 : 
			System.out.println("Tuesday");
			break;
		case 4 : 
			System.out.println("Wednesday");
			break;
		case 5 : 
			System.out.println("Thursday");
			break;
		case 6 : 
			System.out.println("Friday");
			break;
		case 7 : 
			System.out.println("Saturday");
			break;
			default:
			System.out.println("Enter a valid number");
		}


		 
				
		
			
		

		

	}

}
