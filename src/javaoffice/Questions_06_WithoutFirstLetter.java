package javaoffice;

public class Questions_06_WithoutFirstLetter {

	public static void main(String[] args) {
		/*
		 * StringMethods Write a Java program to read a string and if the first or last
		 * characters are ‘t’, return the string without those ‘t’ otherwise return the
		 * string unchanged.
		 * 
		 * Ex: INPUT : The given strings is: testcricket OUTPUT : The new string is:
		 * estcricke
		 */

		String input = "testcricket";
		without_t(input);
	}

	private static void without_t(String input) {
		String str = input.toLowerCase();
		String result;
		if (str.charAt(0) == 't' && str.charAt(str.length() - 1) == 't') {
			result = str.substring(1, str.length() - 1);
		} else if (str.charAt(0) == 't') {
			result = str.substring(1);
		} else if (str.charAt(str.length() - 1) == 't') {
			result = str.substring(0, str.length() - 1);
		} else
			result = str;

		System.out.println(result);

	}

}
