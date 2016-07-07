package com.journaldev.access;

public class TestA {
	
	public static void methodPublic(){
		System.out.println("A's public (before)");
		methodPrivate();
		System.out.println("A's public (after)");
	}
	
	protected static void methodProtected(){
		System.out.println("A's protected (before)");
		methodPrivate();
		System.out.println("A's protected (after)");
	}
	
	static void methodDefault(){
		System.out.println("A's Default (before)");
		methodPrivate();
		System.out.println("A's Default (after)");
	}
	
	private static void methodPrivate(){
		System.out.println("A's Private");
	}
}
