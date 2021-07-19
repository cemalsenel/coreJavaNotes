package day28exceptions;

public class Exceptions01 {
	/*
	 1) "finally" is used in "try-catch"
	 2) "finally" block is executed under every condition
	 3) "finally" block is used to end connection with cloud, to end connection with database
	 4) "finally" block can be used without catch block 
	 NOTE : "try block" can be used like; a) try+catch b) try + multiple catch  c) try + finally d) try + catch + finally e) try +multiple catch +finally
	 
	 try + finally ==> It means you do not want to handle exception but you want to do something like ending connection
	                   with database at the end
	 try + catch + finally ==> It means you want to handle exception and you want to do something like ending connection
	                   with database at the end
	 ===================================================================================
	 Finally keyword: 
​
		1) Why do we use it? ==> To end connections with cloud, to end connection with database; 
		2) How do we use it? ==> 
			a)in a try-catch-finally block:
​
		public static void div(int a, int b) {
		try {
		System.out.println(a/b); (12,0) 
		}catch(ArithmeticException e) {
			System.out.println("Do not use zero for the second parameter");
				} finally {
				System.out.println("Do you want to do more operations?"); //it excecutes both catch and finally
			}
			}
​
		b) with a try block regardless of whether a catch block is present:
		try {
    	System.out.println("Inside try");
		} finally {
    	System.out.println("Inside finally");
		}
​
		3) What is finally keyword? ==> finally defines a block of code we use along with the try keyword. It defines code that's always run after the try and any catch block, before the method is completed.
​
​
		a)Finally will be excecuted in any condition and It is excecuted everytime; 
		b) It is used in try catch; 
​
		Summary: 
T		the finally keyword is used to execute code (used with exceptions - try..catch statements) no matter if there is an exception or not.
		=======================================================================================================================
	 */

	public static void main(String[] args) {
		div(12,4);

	}
	public static void div(int a, int b) {
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Do not use zero for the second parameter...");
		}
		finally {
			System.out.println("Do you want to do more operations...");
		}
	}

}
