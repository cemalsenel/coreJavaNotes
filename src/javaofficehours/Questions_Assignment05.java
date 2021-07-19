package javaofficehours;

import java.util.Scanner;

public class Questions_Assignment05 {

	public static void main(String[] args) {
//
//		/*
//		 * Ask User to enter numbers and add and print the numbers he entered then request the new number. 
//		 * If the sum of the numbers entered exceeds 100, Print “You entered …….. numbers. That's enough ! “ and finish the game.
//		 * 
//		 */
//
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num ;
//		int sum = 0;
//		do {
//			num = scan.nextInt();
//			sum +=num;
//			System.out.println("Enter number again");
//			
//		}while(sum<100);
//		System.out.println("That is enough");
		
		/* There is a lonely monkey in the island
	     * He needs to eat 4 bananas every day
	     * There are just 165 bananas in that island
	     * Create following variables and find how many day monkey can survive.
	     * Use do while loop, increment and decrement and if statements
	int numbersOfBananas = 165, 
	survivalDays = 1;
	boolean monkeyAlive = true;
	     */
//		
//		boolean monkeyAlive=true;
//		int numberOfBananas = 165;
//		int survivalDays = 0 ;
//		while(numberOfBananas>4) {
//			numberOfBananas-=4;
//			survivalDays++;
//			if(numberOfBananas<4) {
//				 monkeyAlive = false;
//		}
//		}
//		System.out.println("Monkey is alive for "+ survivalDays + " days");
//		if(monkeyAlive==false) {
//			System.out.println("Monkey is dead");
//		}

		
		/*
		Create a method called numberOfChars and pass 2 parameters; 
		1. car 
		2. String
			char ch = 'p';
			String str = "population is number of people";
			int count = 0;
		then find how many times the given char is repeated in the String and print it on the console
		*Use for loop, increment and if statements
				*/
//		
//		String str = "population is number of people";
//		char ch = 'p';
//		System.out.println(numberOfChars(ch, str));
		
		/*
		Write the method that will print the reverse of the number you received from the user on the console.
	*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		String num = scan.next();
		String str = "";
		for(int i = num.length() ; i>0;i--) {
			str +=i;
		}
		System.out.println(str);
		

	}
	public static int numberOfChars(char ch,String str) {
		
		int count = 0 ;
		for(int i = 0 ; i<str.length();i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		return count;
		
	}

}
