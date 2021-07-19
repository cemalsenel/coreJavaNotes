package warm_up_01;
// Write a method that returns true if a given number is palindrome, returns false otherwise ( Optional )
// For example 121 --> true ; 123 --> false

import java.util.stream.IntStream;

public class PalindromeNumberWithLambda {
	
	public static void main(String[] args) {
		
		System.out.println(isPalNumber(1331)); 
//		System.out.println(isPalStructural(1221));
//		System.out.println((""+Integer.MAX_VALUE).length()); // 10
		
	}
	public static boolean isPalNumber(int i) {// 123 0,1 r1,2 r2,3
		
//		return IntStream.iterate(n, e-> e/10).limit(11).filter(f->f>0).map(e->e%10).reduce(0,(c,e)->c*10+e)==n;
		// 123  3 + 2*10+3
		return i==IntStream.iterate(i, n->n!=0, m->m/10).map(n->n%10).
				reduce(0, (x,y)->x*10+y);
		
		// iterate method with different number of parameters
		// 2 parameter ==> beginning value, pattern
		// 3 parameter ==> beginning value, condition, pattern
	}
	
	public static boolean isPalStructural(int x) {
		
		int y = 0, x_in = x; 
				
		while(x>0) { // 251  abc   
									//      
			y =  10*y + x%10;       // 0+1   10*1 + 5   150 + 2
			x /= 10; // ab, a, 0    //  25      2		   0
			
		}
		return x_in == y;	
	}
}
