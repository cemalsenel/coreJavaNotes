package lambda;

import java.util.stream.IntStream;

public class LambdaForForLoop {
	

	public static void main(String[] args) {
		printOneToHundred(1,100);
		System.out.println();
		printOneToHundredFunctional(1,100);
		System.out.println();
		
		System.out.println(findSum(3,98));
		System.out.println();
		System.out.println(findSumOfEven(3,98));
		System.out.println(findMultiOdd(3,11));
		System.out.println(findMFactorial(9));
		System.out.println(productOfFirst(7));
		System.out.println(productOfFirst2(7));
		System.out.println(addFirstOdds(23));
		System.out.println(productOfOdd(5));

	}
	/*
	 Print all integers from 1 to 100 without using any loop
	 */
	//1) Use structured programming
	public static void printOneToHundred(int starting, int ending) {
		System.out.print(starting +" ");
		starting++;
		if(starting<101) {
		printOneToHundred(starting,ending);
		}
	}
	//2)Use Functional Programming
	//In range() method  second parameter is exclusive, but in rangeClosed() method first and second parameters are both inclusive
	public static void printOneToHundredFunctional(int starting, int ending) {
		//IntStream.range(starting, ending+1).forEach(t-> System.out.print(t + " "));
		IntStream.rangeClosed(starting, ending).forEach(t-> System.out.print(t + " ")); // both are inclusive in rangeClosed() method
		
	}
	/*
	  Find the sum of integers from 3 to 98 by using functional programming
	 */
	public static int findSum(int starting, int ending) {
		
		return IntStream.rangeClosed(starting, ending).sum();
	}
	/*
	 Find the sum of even integers from 3 to 98 by using functional programming
	 */
	public static int findSumOfEven(int starting, int ending) {
		
		return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeEven).sum();
	}
	//Find the multiplication of odd integers from 3 to 11
	public static int findMultiOdd(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);
	}
	/*
	  Find 9! by using functional programming
	 */
	public static int findMFactorial(int num) {
		return IntStream.rangeClosed(1,num).reduce(1, Math::multiplyExact);
	}
	//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
	//1.Way => not recommended
	public static int productOfFirst(int num) {
		return IntStream.rangeClosed(1,num*2).filter(Utils::checkToBeEven).reduce(1, Math::multiplyExact);
	}
	//2.Way
	public static int productOfFirst2(int num) {
		return IntStream.iterate(2, t-> t+2).limit(num).reduce(1, Math::multiplyExact);
	}
	//Find the sum of first 23 odd counting numbers 
	public static int addFirstOdds(int num) {
		return IntStream.iterate(1, t-> t+2).limit(num).sum();
	}
	//Find the multiplication of first 5 odd counting numbers which are greater than 6
	public static int productOfOdd(int num) {
		return IntStream.iterate(7, t-> t+2).limit(num).reduce(1, Math::multiplyExact);
	}
}
