package practiseclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_02_Lists {

	public static void main(String[] args) {
		/*
		 * Create an integer array with 5 elements Convert to a list Add 11, and 13 into
		 * the list, 11 will be at the beginning, 13 will be at index 3 Increase the
		 * value of every element by 3 Print the multiplication of the elements from
		 * index 2 to index 5
		 */

		int[] arr = { 5, 6, 9, 8, 7 };
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}
		System.out.println(list1);
		list1.add(0, 11);
		list1.add(3, 13);
		System.out.println(list1);
		for (int j = 0; j < list1.size(); j++) {
			list1.set(j, list1.get(j) + 3);
		}
		System.out.println(list1);
		int product = 1;
		for (int i = 2; i <= 5; i++) {
			product = product * list1.get(i);
		}
		System.out.println(product);

	}

}
