package com.ScannerTask;

import java.util.Scanner;

public class ApplicationForm {
	
	public void scannertask() {
		
	}
	
	public static void main(String[] args) {
		
		Scanner F = new Scanner (System.in);
		
		System.out.println("Your favourite Cricketer");
		String nextLine2 = F.nextLine();
		
		System.out.println("Your Favourite Cricketer is:"+nextLine2);
		
		System.out.println("Enter his profile");
		String nextLine = F.nextLine();
		System.out.println("His Profile is:"+ nextLine);
	
		
		System.out.println("Enter his average");
		float nextFloat = F.nextFloat();
		System.out.println("His average is:"+nextFloat);
		
		System.out.println("Enter His best Performance");
		long nextLong2 = F.nextLong();
		System.out.println("His Best is:"+nextLong2+nextLine);
		
		
		
		
	
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
	
}
