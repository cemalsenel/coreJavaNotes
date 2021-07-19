package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement03 {
	/*
	 * Ask user to enter a name of the 'U' , 'S' and 'A'
	 * Then type a program by using switch statement to print
	 * "United" for 'U', "States" for S, "America" fro A
	 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = scan.next().toUpperCase().charAt(0);
		
		switch(ch) {
		case 'U' :
	  //case 'u' : It is also possible to use two cases
			System.out.println("United");
			break;
		case 'S' :
	  //case 's' :It is also possible to use two cases
			System.out.println("States");
			break;
		case 'A':
	  //case 'A':It is also possible to use two cases
			System.out.println("America");
			break;
			default:
				System.out.println("Enter a valid character");
			
		}scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
