package practiseclass;

public class StringMethods {

	public static void main(String[] args) {
		
		String str1 = "Learn coding by typing";
		/*
		 12) 
		 1. startsWith() is used for to check if this String starts with 
		    the specific prefix . 
		 2.startsWith() can be used with only String. We cannot use it with char
		 3.startsWith() can be used with more than one characters
		 4.startsWith() returns boolean 
		 */
		
		
		System.out.println(str1.startsWith("L"));//true
		System.out.println(str1.startsWith("l"));//false
		System.out.println(str1.startsWith("Le"));//true
		System.out.println(str1.startsWith("c",6));//true
		System.out.println(str1.startsWith("by",13));//true
		System.out.println(str1.startsWith("by",16));//true
		
		/*
		 13) 
		 1. endsWith() is used for to check if this String ends with 
		    the specific prefix . 
		 2.endsWith() can be used with only String. We cannot use it with char
		 3.endsWith() can be used with more than one characters
		 4.endsWith() returns boolean 
		 */
		System.out.println(str1.endsWith("g"));//true
		System.out.println(str1.endsWith("g"));//true
		System.out.println(str1.endsWith("m"));//false
		System.out.println(str1.endsWith("ping"));//true
		
		/*
		14) isEmpty() returns boolean, true means the length of the String is 
		 equal to 0.
		 */
		System.out.println(str1.isEmpty());//false
		String s = "";
		System.out.println(s.isEmpty());//true
		
		/*
		 15) replace() : to replace all occurrences of a specific character , I can use replace() method.
		 */
		String str2 = "Java is easy";
		System.out.println(str2.replace("a", "e"));//Jeve is easy
		System.out.println(str2);//Java is easy
		System.out.println(str2.replace("a", "???"));
		System.out.println(str2.replace("a", str2));//JJava is easyvJava is easy is eJava is easysy
		System.out.println(str2.replace("a", ""));//Jv is esy
		System.out.println(str2.replace("", "!"));
		System.out.println(str2.replace('a', 'e'));
		
		
		//16 replaceAll() : replaceAll() and replace() does the same thing. But there are some differences:
		               //   1) In replaceAll() we cannot use chars but we can use Regular expressions
		String str3 = "Teach_more, learn123 more!!!  ..";
		/*
		    Regular explanations
		    \\s : space character
		    \\S : All characters except space character
		    \\w : a->z   A->Z  _  0 -> 9
		    \\W : All characters except a->z   A->Z  _  0 -> 9
		    \\d : 0 -> 9 
		    \\D :All characters except 0 -> 9
		    
	 */
		//   \\s : space character
		System.out.println(str3.replaceAll("\\s", "*"));
		
		//   \\S : All characters except space character
		System.out.println(str3.replaceAll("\\S", "*"));
		
		//   \\w : a->z   A->Z  _  0 -> 9
		System.out.println(str3.replaceAll("\\w", "&"));
		
		//   \\W : All characters except a->z   A->Z  _  0 -> 9
		System.out.println(str3.replaceAll("\\W", "%"));
		
		//   \\d : 0 -> 9 
		System.out.println(str3.replaceAll("\\d", "+"));
		
		//   \\D :All characters except 0 -> 9
		System.out.println(str3.replaceAll("\\D", "*"));
		
		//17 replaceFirst() : It changes just the first occurrence of the character
		System.out.println(str3.replaceFirst("a", "e"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
