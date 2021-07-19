package testpage;

import java.io.FileInputStream;
import java.io.IOException;

import practiseclass.AccessModifiers001;

public class AccessModifiers003 extends AccessModifiers001 {

	public static void main(String[] args) throws IOException {
		
		AccessModifiers003 obj = new AccessModifiers003();
		System.out.println(obj.publicString);
		System.out.println(obj.publicString);
		obj.protectedMethod();
		obj.publicMethod();
		
		String s = "123";
		int num = Integer.parseInt(s);
		System.out.println(num+1);
		
	}

}
