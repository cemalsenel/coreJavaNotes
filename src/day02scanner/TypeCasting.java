package day02scanner;

public class TypeCasting {

	
	public static void main(String[] args) {
		
		/*
		 * byte < short < int < long < float < double (both ways possible)
		 * small to large..no need to type any codes
		 * large to small is little bit complicated
		 */
		
		//Auto widening: If you assign a small data type to a large data type , type casting
		//               is done automatically by Java.
		//               This process is called "Auto Widening"
		byte b1 = 112;
		int i1= b1;
		System.out.println(b1);
		System.out.println(i1);
		
		//Explicit Narrowing: If you assign a large data type to a small data type, type casting 
		//                    can not be done by Java automatically.
		//                    You should take the responsibility and type the casting explicitly.
		//                    This process is called "Explicit Narrowing"
		int i2 = 120 ;
		short s1 = (short)i2 ;
		System.out.println(i2);
		System.out.println(s1);
		
		// When you type "float f1 = 2.3; " ,it will complain.
		//To fix that issue , you have 4 options
		//1.way
		float f1 = 2.3f;
		//2.way
		float f2 = 2.3F;
		//3.way
		float f3 = (float)2.3;
		//4.way
		double f4 = 2.3;
		
		
		// If you use Explicit Narrowing with the numbers which are not in the interval
		//then you will get different results. The result will be calculated accoording to the modulus operation.
		short s2 = 255 ;
		byte b4 = (byte) s2;    // byte==> -128 -127..-1 0 1....126 127
		System.out.println(s2);
		System.out.println(b4);
		
		// The result will be 2, because int/int = int for Java.
		int i3 = 5;
		int i4 = 2;
		System.out.println(i3 / i4);
		
		
		//If you use different data types in mathematical operations, the result data type will be the largest data type
		int i5 =5 ;
		double d1 =2;
		System.out.println(i5 / d1); //2.5 ==> double
		
		
		
		
		
		
		
		
		
		
		
	}
}
