package day16multidimensionalarrays;

public class MultiDimArrays02 {

	public static void main(String[] args) {
		/*
		 Find the sum of all elements in a multidimensional array
		 
		 */

		int arr [][] = {{3 ,4} ,{5} , {6,7,9} ,{11 ,21}};
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
