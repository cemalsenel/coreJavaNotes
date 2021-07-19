package javaoffice;

public class javaAdvance_05BmiWithPrintf {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts name,surname, age, weight, height than
		 * calculates BMI and prints the user’s status like that; John CARPENTER is 25
		 * years old, his height is 180 cm and his weight is 80 kg. He is HEALTHY
		 * because his BMI=24.7
		 */
		/*
		 * % Format Specifier %s , %S formats strings %f formats the floating-point
		 * numbers (precision, floating=> 5,2f) Ex. 188.34 %d formats decimal integers
		 * %[flags][width][.precision]S https://www.baeldung.com/java-printstream-printf
		 */

		String name = "John";
		String surname = "CARPENTER";
		int age = 25;
		double weight = 80.24;
		double height = 170.5;

		String status;
		double bmi = weight / (height * height / 10000);
		if (bmi <= 20) {
			status = "weak";
		} else if (bmi <= 25) {
			status = "healthy";
		} else if (bmi <= 30) {
			status = "fat";
		} else
			status = "obese";

		System.out.println(name + " " + surname + " is " + age + " old, his height is " + height
				+ " is and his weight is " + weight + ". He is " + status + " because his BMI = " + bmi);

//		System.out.printf("%S",name);//JOHN
//		System.out.printf("%s",name);//John
//		System.out.println();
		System.out.printf("%s %S is %d years old, his height is %.1f cm and his weight is %.2f kgs. He is "
				+ "%S because his BMI = %.1f.", name, surname, age, height, weight, status, bmi);
	}

}
