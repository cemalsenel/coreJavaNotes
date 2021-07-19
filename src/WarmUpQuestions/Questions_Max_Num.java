package WarmUpQuestions;

import java.util.ArrayList;
import java.util.List;

public class Questions_Max_Num {

	public static void main(String[] args) {
		/*
		  arr[]= {3,4,5, 7,8,9,12,34,7,8,90}; 
		  is given array, find the maximum 3 element in a given list // output : [90, 34, 12];
		 */

		int arr[]= {3, 4, 5, 7, 8, 9, 12, 34, 7, 8, 90};
		
		List<Integer> list = new ArrayList<>();
		
		for (Integer w : arr) {
			list.add(w);
		}
		System.out.println(list);
		
		int count = 0;
		
		List<Integer> list2 = new ArrayList<>();
		
		while(count < 3) {	
			
			int max = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if(list.get(i)>max) {
					max = list.get(i);
				}
			}
			
			list2.add(max);	
			
			list.remove(list.indexOf(max));
			count++;		
		}
		System.out.println(list2);

	}

}
