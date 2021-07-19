package javaofficehours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questions_Assignments06 {
	public static void main(String[] args) {

		/*
		 * write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 *
		 * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
		 *
		 * Output : [sofia,brad,emily]
		 */

		String[] s1 = { "John", "Brad", "Ange", "Sofia", "Emily" };
		String[] s2 = { "sofia", "brad", "grace", "emily", "hazel" };

		List<String> list1 = new ArrayList<>();

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equalsIgnoreCase(s2[j])) {
					list1.add(s2[j]);
//				 or list1.add(s1[i]); => upper case
				}
			}
		}

		System.out.println(list1);

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see if the array contains it or not:");
		int num = scan.nextInt();
		if (contains(arr, 6)) {
			System.out.println("Array contains " + num);
		} else {
			System.out.println("Array doesn't contain " + num);
		}

		/*
		 * Ask user to enter 5 names then assign them to an array eg: String names =
		 * "john Marry william Brian Richard"; Then print the names 1 by 1 on the
		 * console String [] arrayNames = names.split(" ");
		 */

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter five names:");
		String names = scan2.nextLine();

		String[] arrayNames = names.split(" ");
		System.out.println(Arrays.toString(arrayNames));
		List<String> list2 = new ArrayList<>();

		for (String w : arrayNames) {
			list2.add(w);
		}

		arrNames(list2);
	}

/*
 * Create a method to test if an array contains a specific value returns true or
 * false Then print the result in main method
 * 
 * input[]= {1,2,3,4,5,6,7} num:6 Output : “Array contains 6”
 */
public static boolean contains(int arr[], int a) {
	for (int w : arr) {
		if (arr[w] == a) {
			return true;
		}
	}
	return false;
}

public static void arrNames(List<String> list2) {
list2.stream().filter(t -> t.length() == 4).forEach(t -> System.out.println(t));
	
}

}
