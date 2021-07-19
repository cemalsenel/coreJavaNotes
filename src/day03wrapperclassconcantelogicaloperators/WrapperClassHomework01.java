package day03wrapperclassconcantelogicaloperators;

import java.util.Scanner;

public class WrapperClassHomework01 {
	public static void main(String[] args) {
		//Find all min and max values of primitive data types
		
		Byte byteMin = Byte.MIN_VALUE;
		System.out.println("Min value of Byte : " + byteMin);
		Byte byteMax = Byte.MAX_VALUE;
		System.out.println("Max value of Byte : " + byteMax);
		
		Short shortMin = Short.MIN_VALUE;
		Short shortMax = Short.MAX_VALUE;
		System.out.println("Min value of Short : " + shortMin);
		System.out.println("Max value of Short : " + shortMax);
		
		Integer intMin = Integer.MIN_VALUE , intMax = Integer.MAX_VALUE;
		System.out.println("Min value of Integer : " + intMin);
		System.out.println("Max value of Integer : " + intMax);
		
		Long longMin = Long.MIN_VALUE , longMax = Long.MAX_VALUE ;
		System.out.println("Min value of Long " + longMin);
        System.out.println("Max value of Long " + longMax);	
        
        Float floatMin = Float.MIN_VALUE , floatMax = Float.MAX_VALUE;
        System.out.println("Min value of Float " + floatMin);
        System.out.println("Max value of Float " + floatMax);
        
        Double doubleMin = Double.MIN_VALUE , doubleMax = Double.MAX_VALUE;
        System.out.println("Min value of Double " + doubleMin);
        System.out.println("Max value of Double " + doubleMax);
        
        double num1 = 5d/2d ;
        System.out.println(num1);
        float num2 = 5f/2f;
        System.out.println(num2);
        int num3 = 5/2;
        System.out.println(num3);
        int num4 = 5/3;
        System.out.println(num4);
        float num5 = 5f/3f;
        System.out.println(num5);
        double num6  = 5d/3d;
        System.out.println(num6);
        
        double d1 = 100.235;
        int i1 = (int)100.235;
        System.out.println(i1);
        
        int i2 = 5 ;
        double d2 = 6.2;
        System.out.println("Sum of value : " + (i2 + d2));
        
        int i3 = 20;
        System.out.println(i3);
        i3 += 1;
        System.out.println(i3);
        i3++;
        System.out.println(i3);
        i3 = i3 + 1;
        System.out.println(i3);
        
        int i4 = 15;
        System.out.println(i4);
        i4--;
        System.out.println(i4);
        i4 -= 1 ;
        System.out.println(i4);
        i4 = i4 - 1;
        System.out.println(i4);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int int1 = scan.nextInt();
        System.out.println("Please enter second integer");
        int int2 = scan.nextInt();
        int remainder = int1 % int2;
        System.out.println("Remainder : " + remainder);
        System.out.println("Sum : " + (int1 + int2));
        System.out.println("Area of rectangle : " + (remainder*(int1+int2)));
        System.out.println("Perimeter of rectangle : " + (2*(remainder+ int1+int2)));
        
        
       //Swap two numbers without temporary variable 
        System.out.println("Enter an integer,please ");
        int int3 = scan.nextInt();
        System.out.println("Enter second integer, please");
        int int4 = scan.nextInt();
        int3 = int3 + int4 ;
        int4 = int3 - int4;
        int3 = int3 - int4;
       System.out.println("New first number : " + int3);
       System.out.println("New second number : " + int4);
       
       
       
       //Swap two numbers using temporary variable
       System.out.println("Enter an integer,please ");
       int int5 = scan.nextInt();
       System.out.println("Enter second integer, please");
       int int6 = scan.nextInt();
       int temp;
       temp = int5;
       int5 = int6;
       int6 = temp;
       System.out.println("New first integer : " + int5);
       System.out.println("New second integer : " + int6);
       
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
