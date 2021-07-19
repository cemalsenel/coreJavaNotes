package practiseclass;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	    public static void main(String[] args) {
	        /*
	         * 1)it adds elements in "insertion order" 
	         * 2)it is fast in adding and
	         * deleting.)not fast than hashSet) 
	         * 3)It accepts "null" as an element
	         * 
	         */
	        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
	        lhs1.add("A");
	        lhs1.add("K");
	        lhs1.add("c");
	        lhs1.add("n");
	        System.out.println(lhs1);// [A, K, c, n]
	        lhs1.add("n");// When you try to add same element it will overwrite it
	        System.out.println(lhs1);// [A, K, c, n]
	        // hashCode(): The hash code of a set is
	        // defined to be the sum of the hash codes of the elements in the set
	        System.out.println(lhs1.hashCode());// 349
	        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
	        lhs2.add("A");
	        lhs2.add("j");
	        lhs2.add("c");
	        lhs2.add("b");
	        // retainAll() it removes different elements
	        // it returns false if all of the elements are same
	        // lhs1.retainAll(lhs2)==>lhs1 changes, lhs2 does not change
	        System.out.println(lhs1.retainAll(lhs2));//
	        System.out.println(lhs1);// [A, c]
	        System.out.println(lhs2);// [A, j, c, b]
	        
	        lhs2.add(null);
	        System.out.println(lhs2);//[A, j, c, b, null]

}
}
