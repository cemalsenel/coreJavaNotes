package testpage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test01 {
	
	 /* 
* Write a Java program that reverse a sentence by using Array 
* (with all spaces and special characters) 
* Input : Coding is greate. 
* Output : .etaerg si gnidoC 
* 
* String word = "Coding is greate.";
		 String[] list = new String [word.length()];
		 for (int i =word.length()-1 ; i >=0 ; i--) {
			list[word.length()-1-i] = word.substring(i, i+1);
		}
		 System.out.println(Arrays.toString(list));
		String a = "";
		for (int i = 0; i < list.length; i++) {
			a = a + list[i];
		}
		System.out.println(a);
*/ 
	  /* 
* Create an int array with 5 elements. 
int [] arr = {1, 2, 3, 4, 5}; 
* Print the elements of the Array on console. 
* Increment all elements of array and print array on console.(use for loop) 
int [] arr = {2, 3, 4, 5, 6}; 
* Increment all elements of array again and print array on console.(use foreach loop) 
int [] arr = {3, 4, 5, 6, 7}; 

	 int [] arr = {1, 2, 3, 4, 5};
	 int [] brr = new int[arr.length];
	 for (int i = 0; i < arr.length; i++) {
		brr[i] = arr[i]+1;
	}
	 System.out.println(Arrays.toString(brr));
	 
	 int [] crr = new int[arr.length];
	 for (int w : arr) {
		 System.out.print((w+1)+" ");
		
		}
	 
	}
*/
	 
	  /* Create a class : RandomNameGenerator 
* Step1: Ask user to enter his/her name //john walker 
* Step2: Delete the spaces in the username//johnwalker 
* Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146") 
* Step4: If there the username is not taken, then print: This username is available 
* Step5: If the username is already taken, then print This username is already taken 
* Step6: Then generate a random number, add to the name, and Print the new username 
* 
*  Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a username");
	 String user = scan.nextLine().replaceAll(" ", "");
	 
	 List<String> list = new ArrayList<>();
	 list.add("sam");
	 list.add("johnmary");
	 list.add("johnwalker");
	 list.add("johnwalker523463146");
	 
	 Random random = new Random();
	 int num = random.nextInt(100000001);
	 if(!(list.contains(user))) {
		 System.out.println("This username is available");
	 }else {
		 System.out.println("This username is already taken, you can use :"+user+num);
	 }
	 
	 List<String> list = new ArrayList<>();
		list.add("sam");
		list.add("johnmary");
		list.add("johnwalker");
		list.add("johnwalker523463146");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name please");
		String name = scan.nextLine().replaceAll(" ", "");
		
		if (!list.contains(name)) {
			System.out.println("This username is available");
//			list.add(name);
		}
		else {
			System.out.println("This username is already taken");
			String newName = name + (int)(Math.random()*1000000000);
			System.out.println(newName + " has been assigned to you as username");
//			list.add(newName);
		}
		scan.close();
*/ 
	/*
	 Write a program that deletes those with the letter 'a' or ‘A’ in it. 
* INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} 
* OUTPUT : [Veli,Omer]

String [] list1={"Ali","Veli","Ayse","Fatma","Omer"} ;
	 List<String> list = new ArrayList<>();
	 for (String w : list1) {
		if(w.contains("a") || w.contains("A")) {
			continue;
		}else {
			System.out.print(w+ " ");
		}
	}
	 Scanner scan = new Scanner(System.in);
	        String S = scan.nextLine();
	        String a = "";
	        String b = "";
	        
	        for(int i = 0 ; i<S.length() ; i++){
	            if(i%2 == 0){
	                a = a + S.substring(i,i+1);
	            }else{
	                 b = b + S.substring(i,i+1);
	            }
	         }
	        System.out.println(a + " " + b);
	 
	 */
	

	 public static void main(String[] args) {
			String Str = "Ali came to school and Ayse came to school";
			Map<String, Integer> hm = new HashMap<>();
			for(String w : Str.replaceAll("\\W", " ").split(" "))  hm.put(w, hm.getOrDefault(w, 0) + 1);
			for(String w : hm.keySet()) System.out.printf("%-10s = %2d\n", w,hm.get(w));
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a string");
			String str = scan.nextLine();
			countWord(str);
			scan.close();
		}
	 
	 public static void countWord(String str) {
			str=str.replace(",", "");
			String arr[] = str.split(" ");
			Map<String, Long> map01= Arrays.stream(arr).collect(Collectors.
					groupingBy(Function.identity(), Collectors.counting()));
			map01.forEach((key, value) -> System.out.println(key + "=" + value));
		}
		 

	
}


