package warm_up_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class repeatingletters {

	public static void main(String[] args) {
		/*
		 Write a code that returns the duplicate chars in a String array e.g. 
		
		String str=“ilovejavatoo” 
		Output: o v a

		 */
		
		String str = "ilovetoojava";
		String[] arr = str.split("");
		Arrays.sort(arr);
		List<String> list = new ArrayList<>();
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1].equals(arr[i])) {
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
				
			
		}
		
		

	}

}
