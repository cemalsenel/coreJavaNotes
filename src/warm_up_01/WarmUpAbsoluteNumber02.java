package warm_up_01;

import java.util.Scanner;

public class WarmUpAbsoluteNumber02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to see absolute number");
		int x = sc.nextInt();
		if (x > 0) {
			System.out.println(x);
		} else {
			System.out.println(-1 * x);
		}
		sc.close();
	}

}
