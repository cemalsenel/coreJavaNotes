package day34maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		HashMap<String , Integer> hm1 = new HashMap<>(); 
		hm1.put("cat", 3);
		hm1.put("caterpillar", 11);
		hm1.put("lion", 4);
		hm1.put("tiger", 5);
		//If you send existing key value into a map, map overwrites, it means updates the value
		//hm1.put("cat", 999);
		System.out.println(hm1);//{caterpillar=11, cat=3, tiger=5, lion=4}
		
		HashMap<String , Integer> hm2 = new HashMap<>(); 
		hm2.put("cat", 3);
		hm2.put("caterpillar", 11);
		hm2.put("lion", 4);
		hm2.put("tiger", 5);
		System.out.println(hm2);
		
		System.out.println(hm1.keySet());//[caterpillar, cat, tiger, lion]
		System.out.println(hm1.values());//[11, 3, 5, 4]
		
		System.out.println(hm1.containsKey("cat"));//true
		System.out.println(hm1.containsValue(11));//true
		
		System.out.println(hm1.entrySet());//[caterpillar=11, cat=3, tiger=5, lion=4] ==> Collection
		//equals() does not check order of elements
		System.out.println(hm1.equals(hm2));//true
		//To get value of a specific key, use get() method
		System.out.println(hm1.get("cat"));//3
		//get() returns "null" for non-existing keys
		System.out.println(hm1.get("snake"));//null
		//getOrDefault() method returns the value ,if the key exists. Otherwise returns the given value which is used in method call
		System.out.println(	hm1.getOrDefault("cat", 404));//3 => cat exists
		System.out.println(hm1.getOrDefault("snake", 404));//404 => snake does not exist
		
		//It puts all elements from "hm2" into "hm1" 
		hm1.putAll(hm2);//{caterpillar=11, cat=3, tiger=5, lion=4}
		System.out.println(hm1);//{caterpillar=11, cat=3, tiger=5, lion=4}
		
		//compute() method is used to update value of a specific key
		//By using compute() method , you cannot update the key
		//If you use compute method with a non-existing key , you will get "NullPointerException"
		hm1.compute("lion", (key,value)-> value = value + 5 );
		hm1.compute("tiger", (key,value)-> value = 555);
		hm1.compute("tiger", (key,value)-> value = key.length()+11);
		
		//computeIfPresent() method updates the value of key, if the key exists
		//If the key does not exist, it does not do anything
		hm1.computeIfPresent("caterpillarxx", (key, value)->value + 9);
		hm1.computeIfPresent("caterpillar", (key, value)->value + 9);
		
		//computeIfAbsent() method executed if the key does not exist, if the key exists it does not run
		hm1.computeIfAbsent("snake",  k  -> 5); /* (k) -> 5 is also possible*/
		hm1.putIfAbsent("bird",15);
		System.out.println(hm1);
		
		
		
		
		
	}

}
