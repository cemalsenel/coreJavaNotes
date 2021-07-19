package warm_up_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arrays01 {
	/*
	Occurrence of numbers: Write a program that reads the integers 
		 	between 1 and 50 and counts the occurrences of each.
		 	Assume the input ends with 0.
		 	3 , 4 , 4 , 5 , 3 , 5 , 43 , 43 , 34 , 0
		 	3 , 3 , 4 , 4 , 5 , 5 , 34 , 43 , 43  sorted version
		 	3 , 3 , 4 , 4 , 5 , 5 , 34 , 34 , 43  another senario
		 	
		 	 */
	

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			List<Integer> list = new ArrayList<>();
			int n = -1, invalidCount = 0;
			do {
				
				System.out.println("Enter a number. Press '0' to quit");
				n = scan.nextInt();
				if ( n > 0 && n <= 50 ) list.add(n);
				else if ( n == 0) continue;
				else invalidCount++;
				
			}while( n != 0 );
			
			int[] arr = new int[list.size()];
			
			
			for ( int i = 0 ; i < arr.length ;i++) {
				arr[i] = list.get(i);
			}
			Arrays.sort(arr);
			//3 , 3 , 4 , 4 , 5 , 5 , 34 , 43 , 43  sorted version
			//3 , 3 , 4 , 4 , 5 , 5 , 34 , 34 , 43  sorted version
			int count = 1;
			for ( int i = 0 ; i < arr.length-1 ; i++) {
				
				if ( arr[i] == arr[i+1]) {
					count++;
				}
				else {
					System.out.println("The occurence of " + arr[i] + " is " + count);
					count = 1;
				}
				if ( i == arr.length-2) { // print last element
					System.out.println("The occurrence of " + arr[i+1] + " is " + count);
				}
				
			}
			if ( invalidCount != 0) {
				System.out.println("You entered " + invalidCount + " invalid number" + ((invalidCount==1)?(""):("s") ));
			}
			scan.close();
		}


}
