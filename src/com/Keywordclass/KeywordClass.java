package com.Keywordclass;

public class KeywordClass {

	static int a = 20;
	
	private void boss() {
	
		int b = 25;
		int c = 30;
		
		c--;
		b++;
		
		System.out.println(b);
		System.out.println(c);
		
		}
	
	public final void employee() {
	int d = 35;
	int e = 40;
	d--;
	e++;
	System.out.println(d);
	System.out.println(e);
	}
	
	public static void main(String[] args) {
		
		
		KeywordClass L = new KeywordClass ();
				L.boss();
				L.employee();
				System.out.println(a);
		
	}
	
}
