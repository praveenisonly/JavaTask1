package com.Constructor;

public class airport {
	
	airport () {
System.out.println("Indigo");
}
	
	airport (int K) {
		System.out.println("AirIndia" + K);
	}
	
	public static void main(String[] args) {
		
		
		airport A = new airport ();
		airport A1 = new airport (007);		
	}
	
	
}