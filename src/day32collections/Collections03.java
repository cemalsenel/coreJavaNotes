package day32collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections03 {
	/*
	  Create a Collection which has sorted unique elements
	  1. Way : Use TreeSet directly but this way will be very slow
	  2. Way : Use HashSet to create Collection, then convert to HashSet to TreeSet to put elements in order
	   */

	public static void main(String[] args) {
		
		//1. Way
		long start1 = System.currentTimeMillis();
		TreeSet <Integer> tSet = new TreeSet<>();
		
		
		for (int i = 0 ; i<1000000;i++) {
			tSet.add(2*i);
		}
		System.out.println(tSet.size());//10000
		
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		//2. Way
		long start2 = System.currentTimeMillis();
		HashSet<Integer>hSet = new HashSet<>();
		for(int i = 0 ; i<1000000;i++) {
			hSet.add(2*i);
		}
		System.out.println(hSet.size());//10000
		
		//I am converting HashSet to TreeSet
		TreeSet<Integer> ths = new TreeSet<>(hSet);
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		//Normally HashSet is faster. First add elements then sort . TreeSet is slower
	
	}

}
