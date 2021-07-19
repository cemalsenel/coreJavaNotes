package practiseclass;

import java.util.Scanner;

public class Ternary04R {
	/*
	 * Ask user to enter an integer. If the integer is negative , return
	 * "this integer is negative" If the integer is not negative return its square
	 * Use ternary
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int i = scan.nextInt();
        //1.Way
		String result = i < 0 ? "This integer is negtive" : "Square of integer is : " + (i * i);
		System.out.println(result);
        //2.Way(If there are both Integer and String,  we can put Ternary function directly into the System.out.println();.
		System.out.println(i < 0 ? "This integer is negtive" : i * i);

	}

}
