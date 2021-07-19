package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {
	/*
	     1) There are two main types of Exceptions; 
	        a) Compile Time Exceptions (Checked Exceptions) 
	        b) Run Time Exceptions (Unchecked Exceptions)
	     2) After try block you can use 1 or more catch blocks
	     3) "try" block cannot be used alone
	     4) When you use multiple catch block, make the child exception classes first
	 */

	/*
	 What is the meaning of "platform independent"? 
	 The meaning of platform-independent is that the java compiled code (byte code) can run on all operating systems.
	 */

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = null;
		// You may use nested try-catch block
//		try {
//		fis = new FileInputStream("C:\\Users\\Sersefil\\eclipse-workspace\\winterjava01\\src\\day25overridingexceptions\\fileForExc");
//		int k = 0;
//		try {
//			while((k = fis.read()) != -1) {
//				System.out.print((char)k);
//			}
//		} catch (IOException e) {
//			System.out.println("File could not be read");
//		}
//		}catch(FileNotFoundException e) {
//			System.out.println("File is deleted or path is wrong");
//		}

		// Without using nested try-catch block
		try {
			fis = new FileInputStream("C:\\Users\\Sersefil\\eclipse-workspace\\winterjava01\\src\\day25overridingexceptions\\fileForExc");
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());//C:\Users\Sersefil\eclipse-workspace\winterjava01\src\dayoverridingexceptions\fileForExc (Sistem belirtilen yolu bulamýyor)
			
			e.printStackTrace();
			/*
			 java.io.FileNotFoundException: C:\Users\Sersefil\eclipse-workspace\winterjava01\src\dayoverridingexceptions\fileForExc (Sistem belirtilen yolu bulamýyor)
					at java.base/java.io.FileInputStream.open0(Native Method)
					at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
					at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
					at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
					at winterjava/day26exceptions.Exception01.main(Exception01.java:41)
			 */
			
			System.out.println("File is deleted or path is wrong" + e.getMessage());
			
		} catch (IOException e) {
			
			System.out.println("File could not be read");
		}
	}

}
