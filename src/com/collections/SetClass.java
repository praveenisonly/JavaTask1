package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	
	
	public static void main(String[] args) {
		
		
		Set<Object> cd = new LinkedHashSet <>();
		
		cd.add(100);
		cd.add(200);
		cd.add(300);
		cd.add(400);
		cd.add('K');
		cd.add("King");
		cd.add(null);
		
		System.out.println(cd);
		
		int size = cd.size();
		System.out.println(size);
		
		cd.remove(5);
		System.out.println(cd);
		
		boolean contains = cd.contains(400);
		System.out.println(contains);
		
		cd.clear();
		System.out.println(cd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
