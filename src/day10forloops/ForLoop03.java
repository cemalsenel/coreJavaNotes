package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {
		sumOfAllInt();
		

	}
/*
 * Find the sum of all integers from 10 to 200
 */
	public static void sumOfAllInt() {
		
		int sum = 0;
		for (int i = 10 ; i<=200 ; i++) {
			sum = sum +i;
			//If you want to see the sum value for every loop,put "System.out.println(sum);" inside the for loop
			//System.out.println(sum);
		}
		//If you type "System.out.println(sum);" after the for loop, it will show the final value.
		
		System.out.println(sum);
	}
	
}
