package day11whileloopdowhileloop;

public class DoWhileLoop01 {

	public static void main(String[] args) {

		printsOdds();

//		int i = 1;
//		// Type a code by using while loop
//		while (i > 1) {
//			System.out.println("Hello While Loop");
//		}
//		// Type a code by using do-while loop
//
//		do {
//			System.out.println("Hello Do While Loop");
//		} while (i > 1);
		
		/*
		 * Note: 1)while-loop checks the condition first, then execute the code in loop
		 * body do-while-loop executes the code first, then checks the condition.
		 * 2)do-while -loop is executed at least once.bt while-loop is possible not to
		 * be executed.
		 */

	}

	public static void printsOdds() {
		/*
		 * Create a method to print odd integers less than 100 by using do-while-loop
		 */
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i < 100);

	}

}
