package deneme;

public class Question_For_Loop {
//Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
	public static void main(String[] args) {
		// loop1();
		// loop2();
		// loop3();
		// loop4();
		// loop5();
		 loop6();

	}

	public static void loop1() {
		for (int x = 10; x <= 57; x++) {
			System.out.println(x);
		}
	}

	public static void loop2() {
		// Write a program to print even counting numbers from 100 to 43 on the console
		// by using for-loop.
		for (int x = 100; x >= 43; x -= 2) {
			System.out.println(x);
		}
	}

	public static void loop3() {
		// Write a program to print odd counting numbers from 200 to 33 on the console
		// by using for-loop.
		for (int x = 199; x >= 33; x -= 2) {
			System.out.println(x);
		}
	}

	public static void loop4() {
		// Write a program to add counting numbers from 23 to 57 by using for-loop.Print
		// the sum on the console
		int sum = 0;
		for (int x = 23; x <= 57; x++) {
			sum = x + sum;
		}
		System.out.println(sum);

	}

	public static void loop5() {
		// Write a program to multiply counting numbers from 7 to 15 by using
		// for-loop.Print the multiplication on the console
		int multiplication = 1;
		for (int x = 7; x <= 15; x++) {
			multiplication = multiplication * x;
		}
		System.out.println(multiplication);

	}

	public static void loop6() {
		// Write a program to print counting numbers which are less than 200 and
		// divisible by 5 On the console by using for-loop.
		for (int x = 200; x >= 1; x--) {
			if(x%5==0) {
				System.out.println(x);
			}
			
		}
	}
}
