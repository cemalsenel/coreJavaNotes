package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaWithIntegers {
	/*
	 We learned "structured programming" so far, we will learn "functional programming" now
	 "structured programming" focuses on " how to do" and " what to do", but in "functional programming" we will focus on "what to do"
	 
	 */

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
	    l.add(15);
		
		printEvensStructured(l);
		System.out.println();
		printEvensFunctional(l);
		System.out.println();
		printSqrOdds(l);
		System.out.println();
		printDistinctCubeOfOdds(l);
		System.out.println();
		System.out.println(sumOfSquaresOfEvens(l));
		
		System.out.println(productOfCubesOfOdds(l));
		System.out.println(maxEl(l));
		System.out.println(maxEl2(l));
		System.out.println(minEl(l));
		System.out.println(minEl2(l));
	}
	/*
	 * 1) Structured Programming
	 Create a method to print the even list elements on the console in the same line
	  with a space between two consecutive elements.
	 */
	public static void printEvensStructured(List<Integer> l) {
		for(Integer w : l) {
			if(w%2 == 0) {
				System.out.print(w + " ");
			}
		}
	}
	/*
	 * 2) Functional Programming
	 Create a method to print the even list elements on the console in the same line
	  with a space between two consecutive elements.
	 */
	public static void printEvensFunctional(List<Integer> l) {
		
		l.stream().filter(t ->t%2==0).forEach(t -> System.out.print(t+" "));
	}
	/*
	 * 3) Functional Programming
	 Create a method to print the square of odd list elements on the console in the same line
	  with a space between two consecutive elements.
	 */
	public static void printSqrOdds(List<Integer> l) {
		l.stream().filter(t -> t %2 != 0).map(t -> t*t).forEach(t -> System.out.print(t + " "));
	}
	/*
	 * 4) Functional Programming
	 Create a method to print the cube of distinct odd list elements on the console in the same line
	  with a space between two consecutive elements.
	 */
	public static void printDistinctCubeOfOdds(List<Integer> l) {
		l.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t->System.out.print(t+" "));
	}

	/*
	 * 5) Functional Programming
	 Create a method to calculate the sum of the squares of distinct even elements
	 */
	public static int sumOfSquaresOfEvens(List<Integer> l) {
		int sum = l.stream().filter(t -> t%2 ==0).distinct().map(t->t*t).reduce(0,(x,y)->x+y);
		return sum;
		
	}
	/*
	 * 6) Functional Programming
	 Create a method to calculate the product of the cubes of distinct odd elements
	 */
	
	public static int productOfCubesOfOdds(List<Integer> l) {
		int product = l.stream().distinct().filter(t -> t%2 != 0).map(t -> t*t*t).reduce(1, (x,y)->x*y);
		return product;
	}
	/*
	 * 7) Functional Programming
	 Create a method to calculate the max element in the list
	 */
	
	public static Optional<Integer> maxEl(List<Integer> l) {
		return	l.stream().reduce((x,y)-> x>y ? x : y);// If you use just Lamda Expression in reduce() method, return type will be Optional<Integer>
		
		
	}
	public static Integer maxEl2(List<Integer> l) {
		return	l.stream().reduce(Integer.MIN_VALUE,(x,y)-> x>y ? x : y);//If you use 2 parameters in reduce() method, return type will not be Optional<Integer>
		
		
	}
	/*
	 * 7) Functional Programming
	 Create a method to calculate the min element in the list
	 */
	public static Integer minEl(List<Integer> l) {
		return l.stream().reduce(Integer.MAX_VALUE,(x,y)-> x<y ? x:y);
	}
	public static Optional<Integer> minEl2(List<Integer> l) {
		return l.stream().reduce((x,y)-> x<y ? x:y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
