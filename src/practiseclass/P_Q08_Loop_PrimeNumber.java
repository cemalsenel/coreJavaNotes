package practiseclass;

import java.util.Scanner;

public class P_Q08_Loop_PrimeNumber {

	public static void main(String[] args) {
		/*
		 Ask user to enter a number and check it this number prime number or not
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println(primeNumber(num));

	}
	public static String primeNumber(int num) {
		int i =2;
		do {
			
			if(num%i ==0) {
				return "Not Prime Number";
			}else {
				return "prime Number" ;
			}
			
		}while(i<num);
		
	}

}
