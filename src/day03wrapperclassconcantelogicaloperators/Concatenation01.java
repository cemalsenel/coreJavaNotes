package day03wrapperclassconcantelogicaloperators;

public class Concatenation01 {
	/*
	  Concatenation: Joining Strings ( "+" has two meanings. 1) Addition 2) Concatenation
	 */
	public static void main(String[] args) {
		
		String s1 = "Ali";
		String s2 = "Can";
		System.out.println(s1 + " " + s2);//AliCan 
		//3 Ways to get space between Strings 1) Put a space before "Ali" 2) Put a space before "Can" 3) Put a space between them by adding (" ")
		
		int a = 5;
		int b = 7;
		String s3 = "Java";
		System.out.println(a + s3);
		System.out.println(s3 + a);
		System.out.println(a + s3 + b);
		System.out.println(a + b + s3);
		System.out.println(s3 + a*b);
		
		//By using following variables , print " 61 Study-1" on console
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2= "Hard";
		
		//System.out.println((numA*numB)+""+(numB-numA)+ " "+str1+(numA-numB));
		System.out.println(((numA+numB)*numA*numA*numB) +(numB-numA) + str1 + (numA - numB) );
		
		
		
		
		
		
		
		
	}

}
