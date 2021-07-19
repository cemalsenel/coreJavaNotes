package warm_up_01;

import java.util.Scanner;

public class WarmUpIfStatement01 {

	public static void main(String[] args) {
		/*
        Type java code by using if statement
        When you enter the initial of the day of a week, output should be all possible names of  the days
        For example; if the initial is 'S' output shoulld be "Saturday and Sunday"
        Get the initial from user
        M,T,W,T,F,S,S
       */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the initial of the day of a week ");
		char initial = sc.next().toUpperCase().charAt(0);
		if( initial == 'M' ) {
			System.out.println("Monday");
		}
		if( initial == 'T' ) {
			System.out.println("Tuesday or Thursday");
		}
		if( initial == 'W' ) {
			System.out.println("Wednesday");
		}
		if( initial == 'F' ) {
			System.out.println("Friday");
		}
		if( initial == 'S' ) {
			System.out.println("Saturday or Sunday");
		}else {
			System.out.println("Try Again!!!");
		}sc.close();
		  /*
        Type java code by using if statement
        When you enter the initial of the day of a week, output should be all possible names of  the days
        For example; if the initial is 'S' output shoulld be "Saturday and Sunday"
        Get the initial from user
        M,T,W,T,F,S,S
       */
      
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter the initial of any day");
      char initial1 = sc1.next().toUpperCase().charAt(0);
      
      if(initial1 == 'M' ) { 
          System.out.println("Monday");
      }
      if(initial1 == 'T') {
          System.out.println("Tuesday or Thursday");
      }
      if(initial1 == 'W') {
          System.out.println("Wednesday");
      }
      if(initial1 == 'F') {
          System.out.println("Friday");
      }
      if(initial1 =='S') {
          System.out.println("Saturday or Sunday");
      }
      if(initial1 != 'M' && initial1 != 'T' && initial1 != 'W' && initial1 != 'F' &&
              initial1 != 'S') {
          System.out.println("What are you doing ? ");
      }
      
      sc1.close();

	}

}
