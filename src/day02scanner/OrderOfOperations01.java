package day02scanner;

public class OrderOfOperations01 {
	/*
	 * For mathematical operations we have some rules about order of operations
	 * 1)Do exponential operations
	 * 2)do the opeations inside the parenthesis
	 * 3)Complete multiplication and division operations
	 * 4)Complete addition and subtraction operations
	 * 
	 */

	public static void main(String[] args) {
		
		int result1 = 5 + 2 * (16 -2 * 5);
		System.out.println(result1);
		
		int a = 8 + 2 * (24 / 3 - 2 * 3) + 1;
		int b = 4 * 3 - 3 * ( 2+ 2 * 3);
		System.out.println( a + a * b);
		
		//What is the remainder when you divide 17 by 3?
		//Modulus operator (%) is used to find reminder
		 System.out.println(17%3);//2
		 System.out.println(1235%11);//3
		 
		 //Modulus operator is used to find the digit of a number
		 int c = 234566718;
		 //What is the last digit of a number a?
		 System.out.println(c%10);
		 

	}

}
