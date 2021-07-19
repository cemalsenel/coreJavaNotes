package javaofficehours;

public class Office_3_MaxAndMinValueOfAnArray {
	/*
	 * Write a method that accepts an integer array as input and prints the minimum
	 * and the maximum numbers from given array
	 *
	 * Input : {3,2,5,4,1,6} Output : min: 1 max : 6
	 */
	public static void main(String[] args) {
		int input[] = { 2, 3, 4, 6, 8, 9 };
		maxAndMin(input);
	}

	public static void maxAndMin(int input[]) {
		int max = input[0];
		int min = input[0];

		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
			if (input[i] < min) {
				min = input[i];
			}
		}

		System.out.println("Min value in the array: " + min + "\nMax value in the array: " + max);

	}
}
