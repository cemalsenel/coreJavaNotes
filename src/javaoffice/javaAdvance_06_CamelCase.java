package javaoffice;

import java.util.Scanner;

public class javaAdvance_06_CamelCase {

	/*
	 * Write a return method that accepts a sentence as parameter Then converts it
	 * to Camelcase (without any space or specialCharacter)
	 *
	 * Input : I am writing code easily, it is great Output :
	 * IAmWritingCodeEasilyItIsGreat
	 *
	 */
	public static void main(String[] args) {
		String input = "I am wr@iting co-de ea!sily, it is great";
		camelCase1(input);
		camelCase2(input);
	}

	private static void camelCase2(String input) {
		StringBuilder camelCase = new StringBuilder();
		// Solution
		String words[] = input.replaceAll("[^a-zA-Z]", "").split(" ");

		for (int i = 0; i < words.length; i++) {
			camelCase.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
		}
		System.out.println(camelCase);
	}

	private static void camelCase1(String input) {
		String words[] = input.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i].replaceAll("[^a-zA-Z]", "");
			output += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		}
		System.out.println(output);
	}

}
