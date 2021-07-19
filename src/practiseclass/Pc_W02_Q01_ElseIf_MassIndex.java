package practiseclass;

import java.util.Scanner;

public class Pc_W02_Q01_ElseIf_MassIndex {
	/*
	 * Ask user to their weight and height and type a program with calculates mass
	 * index HINT : Body Mass Index = Weight (kg) / Square of height (m) Then give a
	 * message to user as following: If BMI is less than 18.5 , print "you re weak"
	 * If BMI is between 18.5 and 25 ,print "your weight is ideal" If BMI is between
	 * 25 and 30, print "you re fat" If BMI is more than or equal to 30, print
	 * "obese"
	 * 
	 * EXAMPLE :
	 * 
	 * INPUT: Weight : 71 Height : 1,72
	 * 
	 * OUTPUT : Your BMI is : 23.99945916711736
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height as meters");
		double height = scan.nextDouble();
		System.out.println("Please enter your weight as kilograms");
		double weight = scan.nextDouble();

		double massIndex = (weight) / (height * height);
		System.out.println("Your BMI is : " + massIndex);

		if (weight <= 0 || height <= 0) {
			System.out.println("Please enter a valid values");
		} else if (massIndex < 18.5) {
			System.out.println("You are weak");
		} else if (massIndex <= 25) {
			System.out.println("Your weight is ideal");
		} else if (massIndex < 30) {
			System.out.println("You are fat");
		} else {
			System.out.println("You are obese");
		}

	}

}
