package practiseclass;

import java.util.Scanner;

public class Ternary01R {
	/*
	 * 2.Question Type java code by using ternary and if-else, ask user to enter an
	 * integer, if the integer is even, the output will be “The integer is even”. If
	 * the integer is odd, the output will be “The integer is odd”.
	 */

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter an integer");
        int a = scan.nextInt();
        
        String result = a%2==0 ? "The integer is even" : "The integer is odd";
        System.out.println(result);
	}

}
