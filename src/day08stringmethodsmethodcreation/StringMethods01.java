package day08stringmethodsmethodcreation;

public class StringMethods01 {

	public static void main(String[] args) {

		String str = " Java is Java ";

		// 19.Way : trim () method is used to delete space character from the beginning
		// and from the end of the String
		System.out.println(str.length());// " Java is Java "==>14
		System.out.println(str.trim().length());// "Java is Java"==>12

		/*
		 * By using String methods change the String " Ali123 can?!@  " to "Ali CAN"
		 */
		// 1.Way
		String str1 = "  Ali123 can?!@  ";
		System.out.println(str1.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN"));
		// 2.way
		String firstName = str1.substring(2, 5);
		String lastName = str1.substring(9, 12).toUpperCase();
		System.out.println(firstName + " " + lastName);
		// 20.Way :concat() method
		// concat() method is used to join Strings
		// "+" and "concat()" does the same. But I recommend to use "concat()" instead
		// of "+"
		System.out.println(firstName.concat(" ").concat(lastName));
		// 3.Way
		System.out.println(str1.trim().replaceAll("\\d", "").replace("can?!@", "CAN"));

		/*
		 * String str2 ="$12.99" String str3 ="$8.00" Find the sum of str2 and str3
		 */
		String str2 = "$12.99".replace(".", "");
		String str3 = "$8.00".replace(".", "");
		String s2 = str2.replace("$", "");
		String s3 = str3.replace("$", "");
		System.out.println(s2);
		System.out.println(s3);

		// we must delete "." sign to make double(12.99 and 8.00) to integer(1299
		// and800)
		// we used (100.0) to make (Integer.parseInt(s2) + Integer.parseInt(s3)) part to
		// double )
		// If we would change it (100.0) to integer, we would use integer
		// parseInt() method converts Strings to Integer, if and only if the String is
		// created just by digits.
		System.out.println(Integer.parseInt(s2));
		System.out.println(Integer.parseInt(s3));
		System.out.println((Integer.parseInt(s2) + Integer.parseInt(s3)) / 100.0);
		// valueOf() method converts Strings to Integer , if and only if the String is
		// created just by digits.
		System.out.println((Integer.valueOf(s2) + Integer.valueOf(s3)) / 100.0);

		// How to convert String to a decimal(double)
		String str4 = "$13.99";
		String str5 = "$9.00";

		String s4 = str4.replace("$", "");
		String s5 = str5.replace("$", "");
		
		System.out.println(s4);//13.99(double)
		System.out.println(s5);//9.00(double)
        
		System.out.println(Double.parseDouble(s4) + Double.parseDouble(s5));//22.99
	    System.out.println(Double.valueOf(s4) + Double.valueOf(s5));//22.99
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
