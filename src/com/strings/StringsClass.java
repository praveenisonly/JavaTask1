package com.strings;

public class StringsClass {
	
	public static void main(String[] args) {
		
		String A = "Government Medical College Campus";
		String A1 = "Medical College Road";
		
		int address = A.length();
		int road = A1.length();
		System.out.println(road);
		System.out.println(address);
		
		
		System.out.println(A.equals(A1));
		System.out.println(A.equalsIgnoreCase(A1));
		System.out.println(A.toUpperCase());
		System.out.println(A1.toUpperCase());
		System.out.println(A.toLowerCase());
		System.out.println(A1.toLowerCase());
		System.out.println(A.startsWith("M"));
		System.out.println(A1.startsWith("G"));
		System.out.println(A.endsWith("s"));
		System.out.println(A1.endsWith("s"));
		System.out.println(A.indexOf("m"));
		System.out.println(A1.indexOf("C"));
		System.out.println(A.lastIndexOf("c"));
		System.out.println(A1.lastIndexOf("M"));
		System.out.println(A.charAt(5));
		System.out.println(A1.charAt(15));
		System.out.println(A.startsWith("M"));
		System.out.println(A1.startsWith("C"));
		System.out.println(A.endsWith("s"));
		System.out.println(A1.endsWith("D"));
		System.out.println(A.replace('m', 'L'));
		System.out.println(A1.replace('C', 'B'));
		System.out.println(A.substring(6));
		System.out.println(A1.substring(6 , 10));
		System.out.println(A1.isEmpty());
		
	     String[] split = A.split(" ");
	     
	     for (int i = 0; i < split.length; i++) {
	    	 System.out.println(split[i]);
			
		}
		
	     char[] charArray = A.toCharArray();
	     for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
			
		}
	     
	     
	     
	     
		
	}
	
	
	
	
	
	


