package javaofficehours;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		 /*
         * Write a Java program that asks to user 2 questions
         * 1 = how many tea do you drink in a day?
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */

		Scanner scan = new Scanner(System.in);
		System.out.println("How many tea do you drink in a day?");
		int tea = scan.nextInt();
		System.out.println("How many sugar do you use  for a glass of a tea?");
		int sugar = scan.nextInt();
		
		if (sugar>0) {
		double totalSugar = sugar*365*(2.7/1000);
		double fortySugar = totalSugar*40;
		
		System.out.println("You use " + totalSugar + "  per year");
		System.out.println("You use  " + fortySugar + " in 40 years");
		}else {
			System.out.println("Good job,less sugar more health");
		}





	}

}
