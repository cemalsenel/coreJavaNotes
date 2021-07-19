package practiseclass;

import java.util.ArrayList;
import java.util.List;

public class Q_01_Lists01 {

	public static void main(String[] args) {
		/*
		 Create an integer list which has 5 elements
		 Update all elements by adding "*" on the right of every element
		 */
		List<Integer> list  = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(7);
		list.add(11);
		
		List<String> list1  = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			 list1.add(i, list.get(i)+"*");
		}
		System.out.println(list1);
		
		
		

	}

}
