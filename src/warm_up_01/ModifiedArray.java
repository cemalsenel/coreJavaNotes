package warm_up_01;

import java.util.Arrays;

public class ModifiedArray {

	public static void main(String[] args) {
		/*
		   Given an array of ints, swap the first and last elements in the array. 
		   Return the modified array. 
		   The array length will be at least 1.
	​
			swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
			swapEnds([1, 2, 3]) → [3, 2, 1]
			swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
			*/
			int arr [] = {1,2,3,4,5};
			int brr [] =new int [arr.length];
			for (int i = 0; i < arr.length; i++) {
				if(i == 0 || i == arr.length-1) {
					brr[i] = arr[arr.length-1-i];
				}
				if(i > 0 && i<arr.length-1) {
					brr[i] = arr[i];
				}
			
				
			}System.out.println(Arrays.toString(brr));
			

	}

}
