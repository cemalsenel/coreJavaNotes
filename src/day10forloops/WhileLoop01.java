package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		printOdd1();
		System.out.println();
		printOdd2();
		System.out.println();
		printDivBySixEight();

	}

	/*
	 * Type a program to print odd integers from 4 to 25 on the console in the same
	 * line. 1)use for-loop 2)use while-loop
	 */
	// For loop
	public static void printOdd1() {
		for (int i = 5; i < 26; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}

		}
	}

	public static void printOdd2() {
		// While loop
		int i = 4;
		while (i < 26) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

	public static void printDivBySixEight() {
		/*
		 * Create a method o print integers which are divisible by 6 and 8 from 500 to
		 * 25 In same line and with a space
		 */
		int i = 500;
		while (i > 24) {
			if (i % 6 == 0 && i % 8 == 0) {
				System.out.print(i + " ");
			}
			//Do not forget to type increment/decrement ,otherwise it will be infinite loop
			i--;
		}
	}
}
