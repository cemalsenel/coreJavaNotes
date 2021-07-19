package day27exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.length());//0
		
		String s2 = null;
	//	System.out.println(s2.length());//NullPointerException : If you try to do inappropriate actions with a "null" object
		 								//						you will get "NullPointerException" ==> "Run Time Exception"
		
		int arr [] = {2, 5, 1, 9};
	//	System.out.println(arr[4]);//ArrayIndexOutOfBoundsException ==> For non-existing indexes in arrays, you will get "ArrayIndexOutOfBoundsException"
								   // 									ArrayIndexOutOfBoundsException ==> "Run Time Exception"

	    Object i = 70;
	  //  String s =(String) i;// ClassCastException : If a data type cannot be cast to another data type , you will get "ClassCastException"
	   						 //						ClassCastException ==> "Run Time Exception"
		
		int a = Integer.parseInt("123");// parseInt() method in Integer wrapper class converts Strings to integer
		System.out.println(a+2);//125
		
		//int b = Integer.parseInt("abc");//NumberFormatException : If you want to convert non-digit Strings to Integer, you will get "NumberFormatException"
		//System.out.println(b+2);		//							NumberFormatException ==> "Run Time Exception"
		
		/*
		Get a String from user
	 	Convert it to an integer
	 	Return the integer after multiplying by 2
	 	Your code should not be blocked for any String
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		String num = scan.next();
		int num1 = Integer.parseInt(num);
		System.out.println(num1*2);
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to convert to integer");
		String str = scan.nextLine();
		System.out.println(convertStringToInt(str));
		
		scan.close();
		
	}
	public static int convertStringToInt(String str) {
		int a =0;
		try {
			a =Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println(str + " cannot be converted to integer");
		}
		return a*2;
	}
	

}
