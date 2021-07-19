package warm_up_01;

import java.util.Scanner;

public class Pangram_2 {

public static void main(String[] args) {
		
    	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a sentence:");
	String str=scan.nextLine().toLowerCase();
	System.out.println(pangram(str));
	
	
	}
	public static boolean pangram(String s) {
	
	 int count=0;
	    for(char letter='a'; letter<='z'; letter++) {
	    if(!(s.contains(String.valueOf(letter)))){// i googgle a little bit, if string does not contain any of the alphabet add 1 to count, 
            count++;                                  //it means if count is 1 ore more than one it does not contain all  alphabet letters
}
	}System.out.println(count);
	  if(count>=1) {
		  return false;
	  }else {
		  return true;
	  }
}
}
