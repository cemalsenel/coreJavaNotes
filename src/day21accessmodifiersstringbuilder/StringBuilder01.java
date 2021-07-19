package day21accessmodifiersstringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		//How to create a String by using "StringBuilder Class"
		//1.Way:
		StringBuilder sb1 = new StringBuilder();
		//If you will add new characters constatntly into your String, use 1st way
		System.out.println(sb1);//Empty String
		
		System.out.println(sb1.capacity());//16 is the default capacity
		
		sb1.append("Ali Can");
		System.out.println(sb1);//Ali Can
		sb1.append(" is a student");
		System.out.println(sb1);//Ali Can is a student
		//StringBuilder is mutable,but String is immutable
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder("Veli Han is a parent");
		//If you will create an ordinary String use 2nd way
		System.out.println(sb2);//Veli Han is a parent
		
		//3.Way:
		StringBuilder sb3 = new StringBuilder(5);//If you are sure the length of the String, use 3rd way
		sb3.append("Javaxxxx");//it will be updated . so it will accept 
		
		System.out.println(sb3.capacity());//5 <== It returns the capacity of the StringBuilder field
		System.out.println(sb3.length());//4 <== It returns the number of characters
											//If String is bigger than capacity,capacity will be "2*length+2"
		
		
		//StringBuilder Methods
		
		StringBuilder sb4 = new StringBuilder("Java");
		//1.Way  :Use append() in method chain
		sb4.append("x").append("y").append("z");
		System.out.println(sb4);//Javaxyz
		
		//2.Way :
		sb4.append("mnr", 1, 2);//If you want to add some characters from a String use append() method like that
		System.out.println(sb4);//Javaxyzn
		
		System.out.println(sb4.charAt(5));//y
		
		sb4.delete(4, 7);//String Class does not have that kind of method
		System.out.println(sb4);//Javan
		
		sb4.deleteCharAt(4);
		System.out.println(sb4);//Java
		
		StringBuilder sb5 =  new StringBuilder("Java1299");
		
		sb4.equals("Java");
		System.out.println(sb4);//false
		
		//StringBuilder equals() method is different from String equals() method.
		//StringBuilder equals() method returns true just for same objects
		//If you use StringBuilder equals() method with different object whose values are same, you will get false.(StrinBuilder "==" for equals. this checks values and references)
		
		System.out.println(sb5.equals(sb4));//false
		
		System.out.println(sb4.indexOf("v"));//2
		
		sb4.insert(3, "CCC");//==> 3 is the starting index
		System.out.println(sb4);//JavCCCa 
		
		sb4.insert(5, "Program", 1, 4);
		System.out.println(sb4);//JavCCrogCa
		
		sb4.replace(3, 5, "***");
		System.out.println(sb4);//Jav***rogCa
		
		
		//reverse() method is used to reverse a String.
		sb5.reverse();
		System.out.println(sb5);//9921avaJ
		
		sb4.setCharAt(5, '9');
		System.out.println(sb4);//Jav**9rogCa
		
		System.out.println(sb4.subSequence(3, 5));//**
		System.out.println(sb4);//Jav**9rogCa
		
		//sb4.toString(); ==> converts to String 
		
		sb4.trimToSize(); //Attempts to reduce storage used for the character sequence
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
