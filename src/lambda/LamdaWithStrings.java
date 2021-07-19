package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaWithStrings {

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
        System.out.println();
        elStartsWithAEndsWithO(list);
        System.out.println();
        sortWithLength(list);
        System.out.println();
        sortWithLastChar(list);
        System.out.println();
        getCharAndLength(list);
        System.out.println();
        removeLessThanFive(list);
        System.out.println();
        System.out.println(checkLength(list));
        System.out.println(checkAnyLength(list));
        System.out.println(checkNoLength(list));

	}
	/*
	  1)Create a method to print list elements which are starting with "A" in uppercases
	 */
	public static void elStartsWithA(List<String> list) {
		list.stream().filter(t->t.startsWith("A")).forEach(t-> System.out.print(t.toUpperCase() + " "));
	}
	/*
	 2) Create a method to print list elements which are starting with "A"  or ending with "o" in lowercases
	 */
	public static void elStartsWithAEndsWithO(List<String> list) {
		list.stream().filter(t->t.startsWith("A") || t.endsWith("o")).map(t-> t.toLowerCase()).forEach(t-> System.out.print(t+ " "));
	}
	/*
	 3) Create a method to print the elements in uppercases after ordering according to their length
	  
	  Note :sorted() method puts the elements in natural order
	        sorted(Comparator.comparing(t-> t.length())) method puts the elements in order by using their lengths
	 */
	public static void sortWithLength(List<String> list) {
		list.stream().map(t-> t.toUpperCase()).sorted(Comparator.comparing(t-> t.length())).forEach(t-> System.out.print(t+" "));
	}
	/*
	  4) Create a method to print the elements in lowercases after ordering according to their last characters
	 */
	public static void sortWithLastChar(List<String> list) {
		list.stream()
		.map(t-> t.toLowerCase())
		.sorted(Comparator.comparing(t-> t.charAt(t.length()-1)))
		.forEach(t-> System.out.print(t+" "));
	}
	
	/*
	 5)Create a method to print the length of every
	       element in the following format. Sort by length. Ali: 3 Mark: 4 Amanda: 6 etc.
	 */
	public static void getCharAndLength(List<String> list) {
		list.stream().sorted(Comparator.comparing(t-> t.length())).map(t-> t+":"+t.length()).forEach(t->System.out.print(t+"//"));
	}
	
	/*
	6) Create a method to print the element if the length is  greater than 5
	       
	 */
	public static void removeLessThanFive(List<String> list) {
		list.stream().filter(t-> t.length() > 5 ).forEach(t-> System.out.print(t + " "));;
	}
	/*
	7)Create a method to check if the length of all elements are greater than 3
	 */
	
	public static boolean checkLength(List<String> list) {
		return  list.stream().allMatch(t-> t.length()>3);
	}
	/*
	8)Create a method to check if the length of any element is 4
	 */
	public static boolean checkAnyLength(List<String> list) {
		return  list.stream().anyMatch(t-> t.length()==4);
	}
	/*
	9)Create a method to check if the length of no element is 11
	 */
	public static boolean checkNoLength(List<String> list) {
		return  list.stream().noneMatch(t-> t.length()==11);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
