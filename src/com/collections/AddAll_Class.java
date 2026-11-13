package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AddAll_Class {

	public static void main(String[] args) {
		
		List<Object> AB = new ArrayList<>();
		
		AB.add(50);
		AB.add(60);
		AB.add(70);
		AB.add(80);
		AB.add('K');
		AB.add('L');
		AB.add('M');
		AB.add('N');
		System.out.println(AB);
		
		List<Object> CD = new ArrayList<>();
		
		CD.add(50);
		CD.add(60);
		CD.add(70);
		CD.add(80);
		CD.add('O');
		CD.add('P');
		CD.add('Q');
		CD.add('R');
		System.out.println(CD);
		
		AB.addAll(CD);
		System.out.println(AB);
		
		AB.retainAll(CD);
		System.out.println(AB);
		
		AB.removeAll(CD);
		System.out.println(AB);
		
		
		
		
	}
	
	
}
