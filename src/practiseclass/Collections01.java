package practiseclass;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections01 {

	public static void main(String[] args) {
		// Create a collection which has sorted unique elements
		// 1st way: Use Treeset directly but this way will be very slow
		// 2nd way: Use Hashset to create Collection then convert Treeset to put
		// elements in order
		/*
		 * If they ask you what is the fastest way of creating an ordered set? I will
		 * create an hashset and covert it to treeset
		 */

		TreeSet<Integer> ts = new TreeSet<>();
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			ts.add(3 * i);
		}
		System.out.println(ts.size());
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);

		HashSet<Integer> hs = new HashSet<>();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			hs.add(3 * i);
		}
		System.out.println(hs.size());
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);

		TreeSet<Integer> ths = new TreeSet<>(hs);
		long start3 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			ths.add(3 * i);
		}
		System.out.println(ths.size());
		long end3 = System.currentTimeMillis();
		System.out.println(end3 - start3);

	}

}
