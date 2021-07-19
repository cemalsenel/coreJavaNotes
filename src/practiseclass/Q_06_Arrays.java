package practiseclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_06_Arrays {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String and count the vowels (a,e,i,o,u) contained in the
		 * String
		 * 
		 */
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter a string");
	        String str=scan.nextLine().toLowerCase();
	        int count=0;
	        List<Character> vovels=new ArrayList<>();
	        vovels.add('a');
	        vovels.add('e');
	        vovels.add('i');
	        vovels.add('u');
	        vovels.add('o');
	        for (int i = 0; i < str.length(); i++) {
	            if(vovels.contains(str.charAt(i))) {
	                count++;
	            }
	        }
	        System.out.println(count);

	}

}
