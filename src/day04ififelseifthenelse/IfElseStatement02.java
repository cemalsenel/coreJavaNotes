package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if(ch >=  'a' && ch <='z') {
			System.out.println("It is from alphabet");
			
		}else {
			System.out.println("It is not from alphabet");
			
		}scan.close();
	}

}
