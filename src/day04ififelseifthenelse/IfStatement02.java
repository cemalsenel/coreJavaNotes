package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement02 {
	/*
	 Get the initial from user
	 Type Java code by using if statement
	 When you enter the initial of the day of a week , output should be all possible names of these days.
	 For example; if the initial is "S" output should be Saturday or Sunday
	         M , T , W , T , F , S , S
	 */

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    /*
	    System.out.println("Please enter an initial of any day");
	    char initial = scan.next().charAt(0);
	    
		//1.way
	    if(initial == 'M' || initial =='m' ) {
			System.out.println("Monday");
		}
		if(initial == 'T' || initial =='t') {
			System.out.println("Thursday or Tuesday");
		}
		if(initial == 'W' || initial =='w') {
			System.out.println("Wednesday");
		}
        if(initial == 'F' || initial =='f') {
        	System.out.println("Friday");
        }
        if(initial == 'S' || initial =='s') {
        	System.out.println("Saturday or Sunday");
        }
        if(initial != 'M' && initial =='m' && initial != 'T' && initial =='t' && initial != 'W' && initial =='w' && initial != 'F' && initial =='f' && initial != 'S' && initial =='s') {
        	System.out.println("Enter a valid initial");
        }
       */ 
	    
	    
        //2.Way
        System.out.println("Please enter an initial of any day");
	    char initiall = scan.next().toUpperCase().charAt(0);    
	if (initiall == 'M') {
		System.out.println("Monday");
	}
	if (initiall == 'T') {
		System.out.println("Tuesday or Thursday");
	}
	if (initiall == 'W') {
		System.out.println("Wednesday");
	}
	if (initiall == 'F') {
		System.out.println("Friday");
	}
	if (initiall == 'S') {
		System.out.println("Saturday or Sunday");
	}
	if(initiall != 'M' && initiall != 'T' && initiall != 'W' && initiall != 'F' && initiall != 'S'  ) {
		System.out.println("Enter a valid initial");
	}scan.close();
        
	}

}
	
