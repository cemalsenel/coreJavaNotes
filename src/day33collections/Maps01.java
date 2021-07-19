package day33collections;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		/*
		 1) HashMap puts the elements in random order, because of that it is fast
		 2) HashMap is "not thread-safe" that is; HashMap objects cannot be used in multi-threading
		 3) HashMap is "not synchronized" that is; HashMap objects cannot be synchronized
		 4) HashMap can have a single "null" in "keys" part
		 5) HashMap can have multiple null values in "values" part
		 */
		HashMap<String , Integer> hm = new HashMap<>(); 
		hm.put("Cat", 3);
		hm.put("Caterpillar", 11);
		hm.put("Lion", 4);
		hm.put("Tiger", 5);
		
		System.out.println(hm);
		//keySet() method returns just all keys in Set Collection
		System.out.println(hm.keySet());//[Cat, Lion, Caterpillar, Tiger]
		
		//values() method returns all values in Collection
		System.out.println(hm.values());//[3, 4, 11, 5]

	}

}
