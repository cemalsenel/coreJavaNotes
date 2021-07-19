package warm_up_01;

import java.util.Arrays;
import java.util.Scanner;

public class ValuestWord {
	/*
    Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: 
For example : a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
  */
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("please enter a sentence");
		 String sentence=scan.nextLine();
		 String words[]=sentence.split(" ");
		 System.out.println(Arrays.toString(words));
		   int value=0;
		   int biggestValue=0;
		   String biggestValueWord="";
          for(String w: words) {
        		 value=0;
        	  for(int k=0; k<w.length(); k++) {
        		  value=value+w.charAt(k);
        		  
        	  }System.out.println(value);
        	  
        	 
          		if(value>biggestValue) {
          			biggestValueWord=w;
          			biggestValue=value;
          			
          		}
          		
              
          	} 
        	  System.out.println(biggestValueWord);
    
          
          }

}
