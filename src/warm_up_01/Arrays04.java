package warm_up_01;

import java.util.Arrays;

public class Arrays04 {

	/*
 	Suppose the weekly hours for all employees are stored in a two-dimensional array. 
 	Each row records an employee's seven-day work hours with seven columns. 
 	Write a program that displays employees and their total hours in increasing order of the total hours.
	int[][] arr = { {2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1}, 
                   {3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9} };
                   
                   employee 5 has 32 work hours
                   employee 3 has 37
                   ...
                   employee 2 has 45 
                   
                   34, 28, 20, 31, 32, 28, 37, 41  same order
                   340,281...202			   417 same order
                   
                   combine total hours and empnum
                   singledim array
                   sort
                   break them down into their compenant
                   
             		0, 1, 2, 3, 4, 5, 6, 7
 */
		public static void main(String[] args) {
				int[][] arr = { {2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1}, 
								{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9} }; // 8 employee work time
	// arr[8][7]
	// { { 0 , 1 , 2 , ,,, 7 } , { sum0 , sum1 , sum2 ,,,, sum7 } 
	
	
	int[][] brr = new int[2][8];
	
	for ( int i = 0 ; i < brr[0].length ; i++) {
		brr[0][i] = i;
	}
	
	for ( int i = 0 ; i < 8 ; i++ ) {
		int sum = 0;
		for ( int j = 0 ; j < 7 ; j++ ) {
			sum += arr[i][j];
		}
		brr[1][i] = sum;
	}
	
	System.out.println(Arrays.deepToString(brr));
	
	int[] crr = new int[8];
	
	for ( int i = 0 ; i < 8 ; i++) {
		crr[i] = brr[1][i] * 10 + brr[0][i];
	}
	System.out.println(Arrays.toString(crr));
	
	Arrays.sort(crr);
	
	for ( int i = 0 ; i < crr.length ; i++) {
		int empNum = crr[i] % 10;
		int workTime = crr[i] / 10;
		System.out.println("Employee " + empNum + " has " + workTime + " hours work time");
	}	
}

}
