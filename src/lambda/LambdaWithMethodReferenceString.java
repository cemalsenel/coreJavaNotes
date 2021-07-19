package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaWithMethodReferenceString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Mariano");
		list.add("Alberto");
		list.add("Tucker");
		list.add("Christ");
		
		elStartsWithA(list);
		
		elStartsWithAEndsWithO(list);
		sortWithLength(list);
		printElLengthGreaterThanFive(list);
		System.out.println(removeIfLengthLessThanFive(list));
	}

	/*
	   1)Create a method to print list elements which are starting with "A" in  uppercases
	 */
	public static void elStartsWithA(List<String> list) {
		//I created "startWithA()" method in "Utils" class, but it is not sensible, because "startWithA()" method is very specific method,
		//Reusability is not possible. For that kind of situations no need to use "method reference", use "lambda expression"
		list.stream().filter(Utils::startWithA).map(String::toUpperCase).forEach(System.out::println);
	}
	/*
	 2) Create a method to print list elements which are starting with "A"  or ending with "o" in lowercases
	 */
	public static void elStartsWithAEndsWithO(List<String> list) {
		list.stream().filter(t->t.startsWith("A") || t.endsWith("o")).map(String::toLowerCase).forEach(System.out::println);
	}
	/*
	 3) Create a method to print the elements in uppercases after ordering according to their length
	 */
	public static void sortWithLength(List<String> list) {
		list.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
	/*
	4) Create a method to print the element if the length is  greater than 5
	       
	 */
	public static void printElLengthGreaterThanFive(List<String> list) {
		list.stream().filter(t-> t.length() >= 5 ).forEach(System.out::println);
	}
	/*
	5) Create a method to remove the elements if the length is  less than 5
	       
	 */
	public static List<String> removeIfLengthLessThanFive(List<String> list) {
		list.removeIf(t-> t.length()<5);
		return list;
		
	}
	

}
