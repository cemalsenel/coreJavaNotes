package javaofficehours;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		/*
		 Ask user to their weight and height and type a program
		 which calculates body mass index
		
		 HINT : Body Mass Index = Weight (kg) / Square of height (m)
		 Then give a message to user as following:
		 If BMI is less than 18.5 , you are weak
		 If BMI is between 18.5 and 25 , your weight is ideal
		 If BMI is between 25 and 30, you are fat
		 If BMI is more than or equal to 30, obese
		
		 EXAMPLE :
		
		 INPUT: Weight : 71
		 		Height : 1.72
		 		
		 OUTPUT : Your BMI is  : 23.99945916711736
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your weight");
		double weight = scan.nextDouble();
		System.out.println("Please enter your height");
		double height = scan.nextDouble();
		double bmi = weight/(height*height);
		if(bmi<18.5) {
			System.out.println("You are weak");
		}else if(bmi<25) {
			System.out.println("Your weight is ideal");
		}else if(bmi<30) {
			System.out.println("You are fat");
		}else {
			System.out.println("You are obese");
		}

	}

}
