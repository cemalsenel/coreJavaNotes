package testpage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class test001 {
	//Write a Java Program to reverse a string
	//1.Way: By using StringBuilder()
	//2.Way: By using String Class
	//3.Way: Create a method then call the method from main 
	/*
	 StringBuilder str1 = new StringBuilder("Java is good");
		System.out.println(str1.reverse());
		
		String str2 = "Java is good";
		String nw = "";
		for(int i = str2.length()-1 ; i>=0;i--) {
			nw += str2.charAt(i);
		}
		System.out.println(nw);
		
		System.out.println(reversion("Java is good"));
	 */
	
	//Write a Java Program to swap two numbers
	//1.Way: Use 3rd variable 
	//2.Way: Do not use 3rd variable
	/*
	 int a = 5;
		int b = 6;
		int temp = a;
		
		a = b;
		b =temp;
		System.out.println( a + " " + b);
		
		a = a + b;
		b = a-b ;
		a= a-b;
		System.out.println( a + " " + b);
	 */
	
	/* Ask the user for an integer smaller than 100, and write a method that returns to the user whether this number is in the previously defined array.

	Array={3,5,21,32,34,45,56,57,76,87,95};

	Input : 5  
	Output: The number you entered is in the Array.
	Input : 15
	Output: The number you entered is not included in the Array.
	
	
	int arr[] = {3,5,21,32,34,45,56,57,76,87,95};
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	int counter = 0;
	for(int i = 0 ; i<arr.length;i++) {
		if(num == arr[i]) {
			counter++;
		}
	}
	if(counter!=0) {
		System.out.println("The number you entered is in the Array.");
	}else {
		System.out.println("The number you entered is not included in the Array.");
	}
	*/
	
	/*
	Create a string list with five elements and do the following operations;
		Names : {Jim,Jack,Tom,Lee,Pam};
	Add Lucy instead of Jim.
	Add Tony to the 3rd index.
	Remove Jack from the list.
	Add Gregor to the list.
	Find the size of the list.
	Put it in alphabetical order,
	Delete all the elements of the list.
	
	List<String> str = new ArrayList<>();
	 str.add("Jim");
	 str.add("Jack");
	 str.add("Tom");
	 str.add("Lee");
	 str.add("Pam");
	
	 str.set(0, "Lucy");
	 str.add(3, "Tony");
	 str.add("Gregor");
	
	 System.out.println(str);
	 System.out.println(str.size());
	
	str.sort(null);
	System.out.println(str);
	str.clear();
	System.out.println(str);
	*/

	public static void main(String[] args) {
		
		
		
		

		
		
		
		

		
	}
	public static String reversion(String nWord) {
		String nword = "";
		for(int i = nWord.length()-1 ; i>=0;i--) {
			nword += nWord.charAt(i);
		}
		return nword;
		
	}
}
