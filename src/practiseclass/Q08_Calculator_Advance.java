package practiseclass;

public class Q08_Calculator_Advance extends Q08_Calculator {
	
	public void absolute(double a)  {
		System.out.println("The absolute value is " + Math.abs(a));
	}
	
	public void squareRoot(double a) {
		try {
			System.out.println("The square root is " + Math.sqrt(a));
		}catch(ArithmeticException e) {
			System.out.println("Square can not be negative numbers in square root");
		}
	}

}
