package javaofficehours;

import java.util.ArrayList;

import java.util.List;

public class ArrayListGetNumber {

	public static void main(String[] args) {

		/*
		 * From an integer list find the closest two elements
		 */

		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(41);
		numbers.add(28);
		numbers.add(24);
		numbers.add(19);
		numbers.add(29);
		numbers.add(34);
		System.out.println(numbers);
		List<Integer> differences = new ArrayList<>();
		List<String> indexes = new ArrayList<>();

		for (int i = 0; i < numbers.size(); i++) {
			for (int k = i + 1; k < numbers.size(); k++) {
				differences.add(Math.abs(numbers.get(i) - numbers.get(k)));
				indexes.add(i + "" + k);
			}
		}
		System.out.println(differences);
		System.out.println(indexes);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i<differences.size();i++) {
			if(min>differences.get(i)) {
				min=differences.get(i);
			}
		}
		System.out.println(min);
		
		int indexMin = differences.indexOf(min);
		System.out.println(indexMin);
		String strMin = indexes.get(indexMin);
		System.out.println(strMin);
		System.out.println("The first number(Min) : " + numbers.get(Integer.valueOf(strMin.substring(0, 1))));
		System.out.println("The second number(Min) : " +numbers.get(Integer.valueOf(strMin.substring(1, 2))));
		
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i<differences.size();i++ ) {
			if(max<differences.get(i)) {
				max=differences.get(i);
			}
		}
		System.out.println(max);
		int indexMax = differences.indexOf(max);
		String strMax = indexes.get(indexMax);
		System.out.println(strMax);
		System.out.println("The first(Max) number : " + numbers.get(Integer.valueOf(strMax.substring(0, 1))));
		System.out.println("The Second(Max) number : " + numbers.get(Integer.valueOf(strMax.substring(1, 2))));
	}

}
