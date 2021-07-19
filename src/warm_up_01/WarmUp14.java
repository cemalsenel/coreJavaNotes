package warm_up_01;

import java.util.Scanner;

public class WarmUp14 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert minutes into a number of years and days.
		 * EXAMPLE: INPUT : number of minutes: 3456789
		 * 
		 * OUTPUT : 3456789 minutes is approximately 6 years and 210 days
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter minute value");
		
		double mins = sc.nextDouble();
		long years = (long) mins/(365*24*60);
		int days = (int) mins/(24*60)%365;
		System.out.println(mins + " mins is approximately "+years + " years and " + days + (" days") );
		
        
	}

}
