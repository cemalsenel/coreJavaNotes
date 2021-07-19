package warm_up_01;

import java.util.Scanner;

public class WarmUp01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a figure to create a triangle");
		String fig = scan.next();
		System.out.println(" " + " " + fig + " " + " " );
		System.out.println(" " + fig + " " + fig + " " );
		System.out.println( fig + " " + fig+ " " + fig );
		
		
		short s1 = 128;
		int i1 = s1;
		System.out.println(i1);
		
		float f1 = 2.3f;
		double d1 = f1;
		System.out.println(d1);
		
		int i2 = 120 ;
		short s2 =  (short) i2 ;
		System.out.println(s2);
		
		int i3 = 12 ;
		byte b1 = (byte) i3;
		System.out.println(b1);
		
		int a = 5 ;
		a=a+3;
		System.out.println(a);
		a=a+5;
		System.out.println(a);
		a=a+9;
		System.out.println(a);
		a = a*6;
		System.out.println(a);
		a *= 2;
		System.out.println(a);
		a /= 3;
		System.out.println(a);
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		a +=20;
		System.out.println(a);
		a -=63;
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
