package day18arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(9);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		
		
		//How to join two lists
		//list1 changes below
		//addAll() method adds the element at the end
		//addAll() method returns true, if this list changed as a result of the call
		list1.addAll(list2);
		System.out.println(list2);//[111, 222, 333, 444, 555]
		System.out.println(list1);//[12, 21, 32, 25, 9, 111, 222, 333, 444, 555]
		System.out.println(list1.addAll(list2));//true
		
		list1.addAll(2, list2);
		System.out.println(list1);//[12, 21, 111, 222, 333, 444, 555, 32, 25, 9, 111, 222, 333, 444, 555, 111, 222, 333, 444, 555]
		
		//How to delete all elements from list
		//clear() method returns nothing.
		//clear () : Removes all of the elements from list ==>return type is "void"
//		list2.clear();
//		System.out.println(list2);//[]
		
		//How to check existence of multiple elements
		//containsAll() method returns true if all elements exist in the first list
		//list1.containsAll(list2) returns true if all elements of list2 exists in the  list1
		list1.containsAll(list2);
		System.out.println(list1.containsAll(list2));//true
		
		//How to get the index of last occurrence of an element in a list
		list1.lastIndexOf(111);
		System.out.println(list1.lastIndexOf(111));//15
		
		//How to remove multiple elements from a list
		list1.removeAll(list2);
		System.out.println(list1);//[12, 21, 32, 25, 9]
		
		
		//How to delete elements by using some conditions
		//It returns true if any element is removed otherwise it returns false
		list1.removeIf(t->t>35);//removes all elements if they are bigger than 35
		list1.removeIf(t-> t % 2 != 0);//removes all odd elements
		System.out.println(list1);
		
		
		//How to get a specific part of a list
		//subList(1,3) ==> 1 is inclusive, 3 is exclusive
		//subList(1,3) ==> It returns the subList()
		System.out.println(list2.subList(1, 3));//[222, 333]
		
		//How to convert a list to an array
		System.out.println(list2.toArray());//[Ljava.lang.Object;@5b464ce8
		System.out.println(Arrays.toString(list2.toArray()));//[111, 222, 333, 444, 555] (Array)
		
		
		//How to convert an array to a list <== We use that many times
		//When you create a list by using array, some array features transferred to the list
		//As you know, arrays are not flexible in length, the list which is created from an array will not be
		//flexible in size
		
		//Note: The methods are not related with length can be used in Lists which are created from arrays.
		Integer arr[] = {1,54,21,13};
		List<Integer> list3 = Arrays.asList(arr);
		//System.out.println(list3);//[[I@57829d67]
		//list3.remove(2);//UnsupportedOperationException
		//list3.clear();//UnsupportedOperationException
		//list3.add(34,arr);//UnsupportedOperationException
		list3.set(1,63); //[111, 222, 333, 444, 555]
		System.out.println(list3);//[1, 63, 21, 13]
		System.out.println(list3.subList(2, 4));//[21, 13]
		
		
	}

}
