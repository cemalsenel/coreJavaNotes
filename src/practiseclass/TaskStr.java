package practiseclass;

import java.util.Scanner;

public class TaskStr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter  mid term grade");
		double mid = scan.nextDouble();
		System.out.println("Please enter project grade");
		double project = scan.nextDouble();
		System.out.println("Please enter final grade");
		double finalGrade = scan.nextDouble();

		System.out.println("total grade : " + ((mid * 0.3) + (0.2 * project) + (finalGrade * 0.5)));

		   
	}

}
