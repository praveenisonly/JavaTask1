package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollections {
	
	
	public static void main(String[] args) {
		
		
		List<Object> ab = new ArrayList<>();
		
		ab.add(10);
		ab.add(20);
		ab.add(30);
		ab.add('V');
		ab.add("Reject");
		ab.add(null);
		ab.add(30);
		
		System.out.println(ab);
		
		int size = ab.size();
		System.out.println(size);
		
		Object object = ab.get(5);
		System.out.println(object);
		
		Object set = ab.set(1, 10);
		System.out.println(ab);
		
		
//		Object set1 = ab.set(3, 'K');
//		System.out.println(ab);
		
//		ab.remove(4);
//		System.out.println(ab);
		
		int indexOf = ab.indexOf('V');
		System.out.println(indexOf);
		
		boolean contains = ab.contains(null);
		System.out.println(contains);
		
		ab.clear();
		System.out.println(ab);
		
		
		
		
		
		
		
		
		
		
	}

}
