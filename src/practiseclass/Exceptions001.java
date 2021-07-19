package practiseclass;

public class Exceptions001 {
	/*
	 Exception is an abnormal situation. In Java Exception is an event that disrupts the normal flow of the program
	 
	 There are two types of Exceptions:
	 1) Compile Time Exceptions (Checked Exceptions) : Occurs before click on the Run button
	 2) Run Time Exceptions (Unchecked Exceptions) : Occurs after click on the Run button
	 
	 eçgerMessage() : Every Exception class has their catch block does not run
	 */
	public static void main(String[] args) {

		try {
		
		divide(6,3);
		divide(3,12);
		divide(-3,1);
		divide(0,7);
		divide(8,0);
		
		}catch(ArithmeticException e) {
			e.printStackTrace();// detailed messages about Exception
			System.out.println("Numbers cannot be divided by zero"+e.getMessage());// brief message about Exception ==>   Numbers cannot be divided by zero/ by zero
		}
		System.out.println("can you tell me something?");
		
	}
	public static void divide(int a ,int b) {
		System.out.println(a/b);
	}
}
