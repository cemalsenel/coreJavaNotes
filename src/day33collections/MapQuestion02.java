package day33collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



public class MapQuestion02 {
	/*
	 Create a method to return non-repeated elements from a list
 	  Example: Hellooo ==> [H, e]
	 */

	public static void main(String[] args) {
		getNonRepeatedChars("Hellooo");
		

	}

	public static List<Entry<String,Integer>> getNonRepeatedChars(String str){
		
		List<Entry<String,Integer>> list = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		String arr [] = str.split("");
		for (String w : arr) {
			
			map.computeIfPresent(w, (key,value)->value + 1  );
			map.computeIfAbsent(w, k -> 1);
			
		}
		System.out.println(map);
		for(Entry<String, Integer> w : map.entrySet()) {
			if(w.getValue()==1) {
				list.add(w);
			}
		}
		return list;
		
	}
	/*
	  public static void main(String[] args) {
        System.out.println(getNonRepeatedChars("Hellooo"));
    }
    
    public static List<String> getNonRepeatedChars(String str){
        
        List<String> list = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String arr[] = str.split("");
        
        for(String w : arr) {
            
            map.computeIfPresent(w, (key, value)-> value+1);
            
            map.computeIfAbsent(w, k->1);
    
        }
        System.out.println(map);
        
        for(Entry<String, Integer> w : map.entrySet()) {
            
            if(w.getValue()==1) {
                list.add(w.getKey());
            }
            
        }
        return list;    
    }
	 */
}
