package practiseclass;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Ahmed");
		list1.add("Yavuz");
		list1.add("Cemal");
		list1.add("Sibel");
		list1.add(2, "Ali");
		list1.add("Veli");
		list1.add("Yavuz");
		System.out.println(list1);
		
		System.out.println(list1.size());//6
		
		//to get a specific element in list:
		System.out.println(list1.get(2));//Ali
		//System.out.println(list1.get(7));//OutofBoundException
		
		//to get index of specific element
		System.out.println(list1.indexOf("Cemal"));//3
		System.out.println("X");
		System.out.println(list1.indexOf("Yavuz"));//returns the first occurrence Yavuz
		System.out.println(list1.lastIndexOf("Yavuz"));
		
		//How to remove an element from a list
		//There are two remove() methods
		// 1) remove(index) => returns element that is removed
		// 2) remove(elementName) => returns boolean
		System.out.println(list1.remove(2));//Ali
		System.out.println(list1);
		
		System.out.println(list1.remove("SÝbel"));//true
		System.out.println(list1);
		
		//Lists are "mutable" you can update them without assigning them
		//Strings are "immutable" . You cannot change them unless you assign them
		String s = "Strings are immutable";
		String str = s.replace("are", "");
		System.out.println(s);//Strings are immutable
		System.out.println(str);//Strings immutable
		
		// to update elements in list
		list1.set(2, "John");
		System.out.println(list1);//[Ahmed, Yavuz, John, Sibel, Veli, Yavuz]
		
		
		//to get a part of list:
		//in subList() first index is inclusive, second index is exclusive
		System.out.println(list1.subList(1, 3));// [Yavuz, John]
		
		
		List<String> list2 =  new ArrayList<>();
		list2.add("Ayse");
		list2.add("Seher");
		list2.add("Ayse");
		list2.add("Recep");
		
		list1.addAll(list2);
		System.out.println(list1);//[Ahmed, Yavuz, John, Sibel, Veli, Yavuz, Ayse, Seher, Ayse, Recep]
		System.out.println(list2);//[Ayse, Seher, Ayse, Recep]
		list1.addAll(2, list2);
		System.out.println(list1);//[Ahmed, Yavuz, Ayse, Seher, Ayse, Recep, John, Sibel, Veli, Yavuz, Ayse, Seher, Ayse, Recep]=> added list in a specific index
		
		//to remove multiple elements :
		//removeAll() method removes all the elements that have same name
		list1.removeAll(list2);
		System.out.println(list1);
		//to remove all the elements
		list1.clear();
		System.out.println(list1);//[]
		//to check if list has elements or not
		System.out.println(list1.isEmpty());//true
		
		
	}

}
