package warm_up_01;

import java.util.Scanner;

public class WarmUpAbsoluteNumber {
	 /*
    Type java code by using if-else statement,
Write a program to print absolute value of a number entered by user.
    */


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
          double num = sc.nextDouble();
          
          if(num < 0) {
        	  System.out.println("Absolute number is : " + num* -1);
          }else if(num>0) {
        	  System.out.println("Absolute number is : " + num);
          }
	}
	

	} 


