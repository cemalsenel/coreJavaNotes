package warm_up_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		/*
	       A pangram is a sentence that contains every single letter of the alphabet at least once. 
	       For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, 
	       because it uses the letters A-Z at least once (case is irrelevant).
	       Given a string, detect whether or not it is a pangram. 
	       Return True if it is, False if not. Ignore numbers and punctuation.
	     */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String[]alph = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		List<String> alphabet = new ArrayList<>();
		for(int j = 0 ; j<alph.length;j++) {
			alphabet.add(alph[j]);
		}
		String word[] = scan.nextLine().replaceAll(" ", "").toLowerCase().split("");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < word.length; i++) {
			if(!(list.contains(word[i]))){
				list.add(word[i]);
			}
		}
		Collections.sort(list);
		if(list.equals(alphabet)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		

	}

}
