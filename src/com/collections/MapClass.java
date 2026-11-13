package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		
		
		Map<Integer, Integer> P = new TreeMap<>();
		
//		P.put(10, "Kids");
//		P.put(20, "Patients");
		P.put(10, 200);
		P.put(40, null);
//		P.put(20, "Players");
		P.put(60, 500);
//		P.put(100, "List");
		
		System.out.println(P);
		
		int size = P.size();
		System.out.println(size);
		
		Object object = P.get(5);
		System.out.println(object);
		
		Set<Integer> keySet = P.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = P.values();
		System.out.println(values);
		
//		boolean containskey = P.containsKey(true);
//		System.out.println(containskey);
		
		boolean containsValue = P.containsValue(true);
		System.out.println(containsValue);
		
		Set<Entry<Integer, Integer>> entrySet = P.entrySet();
		System.out.println(entrySet);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
