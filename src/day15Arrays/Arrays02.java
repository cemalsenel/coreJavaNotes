package day15Arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		/*
		 int a[] = {5,2,6};
		 int b[] = {5,2,6};
		 int c[] = {5,6,2};
		 1)Check if array "a" equals to array "b"
		 2)Check if array "b" equals to array "c"
		 */

		/*
		 If two arrays are equal to each other , same elements must be in same indexes.
		 */
		 int a[] = {5,2,6 ,8};
		 int b[] = {5,2,6};
		 int c[] = {5,6,2};
		 //1.Way : Used Flag
		 int count = 0; // Flag method : this will be increased as much as there are different elements
		                // And then it will be used for giving message.
		 int length = 0;
		 
		 if(a.length<b.length) {
			 length = a.length;
		 }else {
			 length = b.length;
		 }
		 for(int i = 1 ; i<length;i++) {
			 if(a[i] != b[i]) {
				 count++;
			 }
		 }
		 if(a.length!=b.length) {
			 System.out.println("Arrays are not equal");
		 }else if(count != 0) {
			 System.out.println("Arrays are not equal");
		 }else {
			 System.out.println("Arrays are equal");
		 }
		 
		 //2.Way : Use method from Arrays class...
		 
		 int d[] = {2,9,3};
		 int e[] = {2,3,9};
		 
		System.out.println(Arrays.equals(d, e)); // false
		 
		 
		 
		 
		 
		 
		 
	}

}
