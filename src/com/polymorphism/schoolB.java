package com.polymorphism;

public class schoolB extends schoolA{
	
	@Override
	public void maths() {
		
		super.maths();
		System.out.println("Quarterly Exam");
	}

	
	@Override
	public void social() {
		
		super.social();
		System.out.println("Unit Test");
	}
	
	
	public static void main(String[] args) {
		
		schoolB result = new schoolB ();
		result.maths();
		result.social();
		
		
				
		
	}
}
