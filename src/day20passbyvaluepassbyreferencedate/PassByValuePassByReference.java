package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		int price = 100;
		System.out.println(discount(price));//90
		System.out.println(price);//100
		
		String str = "Java";
		System.out.println(concatenate(str));//JavaX
		System.out.println(str);//Java
		
		List<Integer>list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(updateAllElements(list));//there is assignment operation behind set() method. so list is updated and assigned
		System.out.println(list);//String class is immutable, List is mutable. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String d = scan.next();//"Java" was entered
		
		String a ="Java";
		String b = "Java";
		String c = new String("Java");
		System.out.println(a+"-"+b+"-"+c);//Java-Java-Java
		
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true
		System.out.println(a==c);//false
		System.out.println(a.equals(c));//true
		System.out.println(a==d);//false
		System.out.println(a.equals(d));//true
		// "==" compares both reference and value
		//"equals()" compares only values
		//primitives and String are immutable
		//List is mutable
	}
	public static int discount(int price) {
		price = price -10;
		return price;
	}
	public static String concatenate(String str) {
		str = str + "X";
		return str;
	}
	public static List<Integer> updateAllElements(List<Integer> list){
		for(int i = 0 ; i<list.size();i++) {
			list.set(i, list.get(i)+3);
			}
		return list;
	}

}
