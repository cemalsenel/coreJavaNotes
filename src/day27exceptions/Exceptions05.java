package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions05 {
	public static void main(String[] args) throws FileNotFoundException,IOException, ArithmeticException {
		/*
		 1)  "throws" keyword is used for "checked exceptions"
		 2)  "throws" keyword is used when we do not want to handle exception
		 3)   After "throws keyword,you can use multiple Exception classes by putting comma between them
		 4)  "throws" keyword cannot be used in method body. It must be used in method name line
		 5)  After "throws" keyword , if you use child and parent Exception Classes togehter, it works but not recommended. 
		     Because when you use just parent it will cover the child
		 */

		FileInputStream fis = new FileInputStream("C:\\Users\\Sersefil\\eclipse-workspace\\winterjava01\\src\\day25overridingexceptions\\fileForExc");

		int k = 0;

		while ((k = fis.read()) != -1) {

			System.out.print((char) k);
			
		}
	}
}
