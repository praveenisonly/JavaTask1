package com.Scanner;

import java.util.Scanner;

public class scannerclass {
	
	public static void main(String[] args) {
		
	Scanner b = new Scanner (System.in);	
	
	System.out.println("Enter your name");
	long nextLong = b.nextLong();
	System.out.println("Your Name: " + nextLong);
	
	System.out.println("Your First Name");
	String next = b.next();
	System.out.println("Your First Name: " + next);
	
	System.out.println("Enter your phone number");
	long nextLong2 = b.nextLong();
	System.out.println("Your phone number" + nextLong2);
	
	
	System.out.println("Enter your height");
	float nextFloat = b.nextFloat();
	System.out.println("Your Height"+nextFloat);
		
	
		
	}

}
