package javaofficehours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questions_Assignment04 {

	public static void main(String[] args) {
//		/*
//		 * Ask user to enter a name and a character, then check how many times the
//		 * character is repeated in the name using loops. e.g: char ch1= 'a' ; String
//		 * name =“John came late" => number of a = 2
//		 */
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String");
//		String str = scan.nextLine();
//		System.out.println("Enter a character");
//		char c = scan.next().charAt(0);
//		char ch[] = str.toCharArray();
//		Arrays.sort(ch);
//		int count = 0;
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i] == c) {
//				count++;
//			}
//			
//		}
//		System.out.println(count);

		  
//		/*
//		Print even numbers between 1-20 inclusive.  e.g.2 4 6 .. 20
//		Print odd numbers between 1-20 inclusive. e.g 1,3,5,7,...,19  Including comma!
//		Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,5
//		Find the sum of all even numbers from 1 - 20 inclusive
//		Print all numbers from 1-20 except 11 or 15; use break or continue.
//		*/
//		
//		for(int i = 1; i<21;i++) {
//			if(i%2 ==0 ) {
//				System.out.print(i+" ");
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i = 0 ; i<=20;i++) {
//			if(i%2!=0 ) {
//				System.out.print(i);
//				if(i!=19)System.out.print(",");
//			}
//			
//			
//		}
//		
//		System.out.println();
//		for(int i = 20 ; i>0; i--) {
//			if(i%5==0) {
//				System.out.print(i);
//				if(i!=5)System.out.print(",");
//			}
//		}
//		
//		System.out.println();
//		int sum = 0;
//		for(int i = 0 ; i<=20; i++) {
//			sum +=i;
//			}
//		System.out.println(sum);
//		
//		for(int i = 1; i<=20;i++) {
//			if(i==11||i==15) continue;
//				System.out.print(i);
//				if(i!=20)System.out.print(",");
//		}
		
//		/*
//		Write a code that returns the duplicate chars in a String array e.g. 
//		String str=“ilovejavatoo” 
//		Output: o v a
//		         	*/
//		Scanner scan1=new Scanner(System.in);
//		  System.out.println("please enter string");
//			String str=scan1.next();
//			String[] arr = str.split("");
//			Arrays.sort(arr);
//			List<String> list = new ArrayList<>();
//			
//			for(int i=0; i<arr.length; i++) {
//				for (int j = i + 1 ; j < arr.length; j++) {
//					if (arr[i].equals(arr[j])) { 
//						if(!list.contains(arr[i])) {
//							list.add(arr[i]);
//						}
//				   }
//				}
//			}
//			System.out.println(list);
		
//		/*
//		Get numbers from the user and output that number consecutive fibonacci number sequence
//		     	e.g : User enters 10
//		output : 0 1 1  2  3  5 8 13 21 34
//		      	*/
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = scan.nextInt();
//		
//		List<Integer> fibo = new ArrayList <>();
//		//first and second element created
//		fibo.add(0);
//		fibo.add(1);
//		for(int i = 2 ; i<num ;i++) {
//			//creating element sequence except first and second
//			fibo.add(fibo.get(i-2)+fibo.get(i-1));
//		}
//		//printing elements on the console until entered number
//		System.out.println(fibo);
//		//printing the elements in the list one by one on the console
//		for(int i = 0 ; i<fibo.size() ;i++) {
//			System.out.print(fibo.get(i)+" ");
//		}
		
//		/*
//		String day= "8MARCH";
//		         use charAt method and loop then print all letters on the console
//		          */
//		
//
//		String day= "8MARCH";
//		for(int i = 0 ; i<day.length();i++) {
//			System.out.print(day.charAt(i)+",");
//		}
		}
      }