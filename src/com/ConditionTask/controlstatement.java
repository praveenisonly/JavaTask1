package com.ConditionTask;

public class controlstatement {
	
	public static void main(String[] args) {
		
		long Value = 25000;
		int salary = 20000;
		
		if (Value <=2000 || salary <=2000) {
			System.out.println("Value is Insufficient");
			}
		else if (Value <10000) {
		System.out.println("Value is Lesser than Actual");
		}
		
		else if (Value <= 20000) {
			System.out.println("Value is nearest");
		}
		
		else if (Value > 25000) {
			System.out.println("Value is Maximum");
		
		}
		
		else {
			System.out.println("Value is Not available");
		}
		
		
	}

}
