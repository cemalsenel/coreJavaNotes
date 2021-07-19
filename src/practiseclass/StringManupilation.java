package practiseclass;

import java.util.Scanner;

public class StringManupilation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String and character");
		String str = scan.nextLine();
		char ch = scan.next().charAt(0);

		String result = str.indexOf(ch) == -1 ? "The String has no character" : "The String has the character";
        System.out.println(result);
	}

}
