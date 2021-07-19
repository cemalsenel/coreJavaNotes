package warm_up_01;

import java.util.Scanner;

public class WarmUp13 {
	/*
    Write a program that prints multiplication table for 1.
    Do not use any loop.
       1x1=1
       1x2=2
       1x3=3
       1x4=4
       1x5=5
       1x6=6
       1x7=7   
       1x8=8
       1x9=9
       1x10=10
    */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number");
		int num2 =sc.nextInt();
		
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1 + "x" + ++num2 + "=" + (num1*num2));
      
		}
	}


