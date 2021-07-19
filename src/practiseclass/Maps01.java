package practiseclass;

import java.util.HashMap;

public class Maps01 {
	 public static void main(String[] args) {
		    
	        /*
	         ======MAPS=======
	         Maps uses {}
	         Maps use key-value structure
	         Keys have to be unique
	         Values can be repeated
	         
	         ====HashMap=====
	         HashMap puts the elements in random order. 
	         It is very fast
	         HashMap is not "thread-safe" that is HashMap objects cannot be used in multi-threading
	         HashMap is "not synchronized" 
	         Keys accept "null" but only once
	         Values accept multiple "null"
	         */
	        
	        HashMap <Integer, String> hm1 = new HashMap<>();
	        
	        hm1.put(101, "Milk");
	        hm1.put(102, "Cheese");
	        hm1.put(103, "Meat");
	        hm1.put(107, "Butter");
	        hm1.put(110, "Honey");
	        
	        //try to use same key, it will overwrite
	        hm1.put(101, "Apple");
	        System.out.println(hm1);
	        //try to use same value:
	        hm1.put(111, "Honey");
	        System.out.println(hm1);
	        //try to use null as a key
	        hm1.put(null, "orange");
	        System.out.println(hm1);
	        //try to null as a key one more time:
	        hm1.put(null, "olive");
	        System.out.println(hm1);
	        //try to use null as a value
	        hm1.put(120, null);
	        System.out.println(hm1);
	        hm1.put(130, null);
	        System.out.println(hm1);
	        //keyset() returns just keys in Set Collection
	        System.out.println(hm1.keySet());
	        //values() returns values , it returns Collection
	        System.out.println(hm1.values());
	        //get() retruns the specific value, it works like index
	        System.out.println(hm1.get(102));
	        //If you use get() with nox existing key it will return null
	        System.out.println(hm1.get(50));//null
	        //If you want to get a message for nox existing key you can use getOrDefault()
	        System.out.println(hm1.getOrDefault(400, "The product that you look for does not exist"));
	        System.out.println(hm1.getOrDefault(110, "The product that you look for does not exist"));
	        
	        //containsKey() returns true if the key exists
	        System.out.println(hm1.containsKey(107));//true
	        System.out.println(hm1.containsKey(707));//false
	        //continsValue() returns true if the value exists
	        System.out.println(hm1.containsValue("Honey"));//true
	        System.out.println(hm1.containsValue("Banana"));//false
	        
	        //putIfAbsent(key,value) puts a value if key does not exist
	        //if key exists it will keep the old one.
	        hm1.putIfAbsent(107, "bread");
	        System.out.println(hm1);
	        hm1.putIfAbsent(507, "bread");
	        System.out.println(hm1);
	        //remove(key) removes the value if the key exists
	        System.out.println(hm1.remove(101));//Apple
	        System.out.println(hm1);
	        System.out.println(hm1.remove(999));//null
	        
	        hm1.remove(110, "Honey");
	        System.out.println(hm1);
	        
	        hm1.replace(103, "Chocalate");
	        System.out.println(hm1);
	        
	        hm1.replace(888, "strawberry");
	        System.out.println(hm1);
	        
	        //Instead of replace() do not use put(), because put() adds new value
	        //if you non-existing key, replace() does nothing if key does not exist.
	        
	 }
}
