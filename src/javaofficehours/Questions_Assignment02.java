package javaofficehours;

import java.util.Iterator;
import java.util.Scanner;

public class Questions_Assignment02 {

	public static void main(String[] args) {
//		/* Write the Switch Case java code that prints the A, B, C, D, F notes that the user has entered.            
//		           A Excellent				
//		           B	Good				
//		           C	Average				
//		           D	Deficient				
//		           F	Failing	*/
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a grade");
//		char grade = scan.next().toUpperCase().charAt(0);
//		switch(grade) {
//		case 'A' : 
//			System.out.println("Excellent");
//			break;
//		case 'B' : 
//			System.out.println("Good");
//			break;
//		case 'C' : 
//			System.out.println("Average");
//			break;
//		case 'D' : 
//			System.out.println("Deficient");
//			break;
//		case 'E' : 
//			System.out.println("Failing");
//			break;
//			default:
//				System.out.println("Please enter a valid character");
//		}
		
		/*
		 1 - Ocak 31
2 - Þubat 28
3 - Mart 31
4 - Nisan 30
5 - Mayýs 31
6 - Haziran 30
7 - Temmuz 31
8 - Aðustos 31
9 - Eylül 30
10 - Ekim 31
11 - Kasým 30
12 - Aralýk 31>
		 */
		
		/* 
		Write the Switch Case java code, which says how many days the user has entered for the month he entered.		 
		*/
		 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a month");
//		String month = scan.next().toLowerCase();
//		switch(month) {
//		case "january":
//		case "march":
//		case "may":
//		case "july":
//		case "august":
//		case "oktober":
//		case "december":
//			System.out.println("This month includes 31 days");
//			break;
//		case "april":
//		case "june":
//		case "september":
//		case "november":
//			System.out.println("This month includes 30 days");
//			break;
//		case "february":
//			System.out.println("This month includes 28 or 29 days");
//			break;
//			default:
//				System.out.println("Please enter a valid month");
//		}

//		/*Write a code using ternary:
//		Create int variable : price
//		Create string variable : decision
//		If the price = $10 Print “cheap”
//		If price is 10-$20 print “ok”
//		Otherwise “expensive”.
//		*/
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter price");
//		int price = scan.nextInt();
//		if(price < 0 ) {
//			price = -price;
//		}
//			String str = 	(price>10 && price<20) ? "It is ok" : (price<=10 ? "It is cheap" : "It is expensive");
//			System.out.println(str);
		
		/*
		create 2 words : name1 and name2
		 if the name1 has even numbers of characters,
		 then insert the second word in the middle of the first name
		 if the first word has odd numbers
		 Then print the “Name2 cannot be inserted in the name1”
		 e.g:
		 name1= mehmet
		 name2= ahmet
		 Print ==> mehahmetmet
		*/

//		Scanner scan = new Scanner(System.in);
//		String name1 = "";
//		String name2 = "";
//		for (int i = 0; i < 1; i++) {
//			System.out.println("Enter a name");
//			 name1 = scan.next();
//			 name2 = scan.next();
//		}
//		String str =(name1.length()%2 ==0) ? (name1.substring(0 , (name1.length()/2))+ name2 + name1.substring(name1.length()/2)) :
//			                                 (name2 + " cannot be inserted in the " + name1);
//		System.out.println(str);
		
//		if(name1.length()%2 ==0) {
//			System.out.println(name1.substring(0 , (name1.length()/2))+ name2 + name1.substring(name1.length()/2));
//		}else{
//		System.out.println(name2 + " cannot be inserted in the " + name1);
//		}
		
		
//		/*
//		Ask user to enter a word. If the word has odd number of characters lenth() of characters and has 3 or more characters, print the character in the middle of the word.
//		*/
//
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter a name");
//		String str = scan.next();
//		String first = str.substring(0 , str.length()/2);
//		String last = str.substring(str.length()/2);
//		
//		
//		if(str.length()%2 !=0 && str.length()>3) {
//			System.out.println(first+str+last);
//		}else {
//			System.out.println("Enter a new name");
//		}
		
		
		
//		/* 
//		Ask user to enter firstName and lastName then make first initials uppercase and rest should be all lovercase
//		ferhat => Ferhat
//		kirac => Kirac
//		          */
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter  name");
//		String name = scan.next();
//		System.out.println("Enter  last name");
//		String lastName = scan.next();
//		System.out.println("Name : "+name.toUpperCase().charAt(0) + name.substring(1));
//		System.out.println("Last name : "+lastName.toUpperCase().charAt(0) + lastName.substring(1));
		

		
		
		
		
//		/*
//		StringMethods:
//			Write a Java program to extract the first half of a string of even length.
//           Example:
//			     INPUT      :  Python
//			    OUTPUT :   Pyt
//	    */
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a word");
//		String str = scan.next();
//		System.out.println(str.substring(0, str.length()/2));

	}

}
