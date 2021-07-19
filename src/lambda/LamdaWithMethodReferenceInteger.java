package lambda;

import java.util.ArrayList;
import java.util.List;

public class LamdaWithMethodReferenceInteger {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
	    l.add(12);
	    l.add(9);
	    l.add(13);
	    l.add(4);
	    l.add(9);
	    l.add(2);
	    l.add(4);
	    l.add(12);
	    l.add(7);
	    printEvensFunctional(l);
	    System.out.println("==========");
	    printSqrOdds(l);
	    System.out.println("=========");
	    System.out.print(sumOfSquaresOfEvens(l));
	    System.out.println("=======");
	    System.out.println(productOfCubesOfOdds(l));

	}
	/*
	 * 1) Functional Programming
	 Create a method to print the even list elements on the console in the same line
	  with a space between two consecutive elements.
	  
	  Note : Method Reference ==> Class Name :: Method Name (without parenthesis)
	 */

	public static void printEvensFunctional(List<Integer> l) {
		l.stream().filter(Utils :: checkToBeEven).forEach(System.out::println);
	}
	
	/*
	 * 2) Functional Programming
	 Create a method to print the square of odd list elements on the console in the same line
	  with a space between two consecutive elements.
	 */
	public static void printSqrOdds(List<Integer> l) {
		l.stream().filter(Utils::checkToBeOdd).map(Utils::findSquare).forEach(System.out::println);
	}
	/*
	 * 3) Functional Programming
	 Create a method to calculate the sum of the squares of distinct even elements
	 */
	public static int sumOfSquaresOfEvens(List<Integer> l) {
		int sum = l.stream().filter(Utils::checkToBeEven).distinct().map(Utils::findSquare).reduce(0,Math::addExact);
		return sum;
		
	}
	/*
	  4) Functional Programming
	 Create a method to calculate the product of the cubes of distinct odd elements
	 */
	
	public static int productOfCubesOfOdds(List<Integer> l) {
		int product = l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::findCube).reduce(1, Math::multiplyExact);
		return product;
	}
	
	

}
