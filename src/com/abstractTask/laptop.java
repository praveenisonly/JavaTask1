package com.abstractTask;

public class laptop extends mobile{

	@Override
	public void application() {
		System.out.println("Mobile application");
	}
	
	@Override
	public void games() {
		System.out.println("GTA");
	}
	
	public static void main(String[] args) {
		
		
		laptop Mobile = new laptop ();
				Mobile.application();
		        Mobile.games();
	}

	
	
}
