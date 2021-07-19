package warm_up_01;

import java.util.Scanner;

public class WarmUp07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value ");
		double min = sc.nextDouble();
		long years =(long) (min/(365*24*60));
		long days = (long)(min/(60*24))%365;
		
		
		System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
 
	}

}
