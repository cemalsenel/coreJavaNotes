package WarmUpQuestions;

import java.util.ArrayList;
import java.util.List;

public class Questions_Min_Num {

	public static void main(String[] args) {
		// Arkadaslar iyi aksamlar , bugun cozdugumuz sorularin pratik yapmak icin iki
		// tane soru yolluyorum . : arr[]= {3,4,5, 7,8,9,12,34,7,8,90}; is given array,
		// find the two elements who has min value in a given list // output : [3,4];

		int arr[] = { 3, 4, 5, 7, 8, 9, 12, 34, 7, 8, 90 };
		List<Integer> list = new ArrayList<>();

		for (int w : arr) {

			list.add(w);
		}

		System.out.println(list);
		List<Integer> list2 = new ArrayList<>();

		int count = 0;
		while (count < 2) {
			int min = list.get(0);
			for (int i = 1; i < list.size(); i++) {

				if (list.get(i) < min) {

					min = list.get(i);
				}

			}
			list2.add(min);
			list.remove(list.indexOf(min));
			count++;

		}

		System.out.println(list2);

	}

}
