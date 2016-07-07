package com.journaldev.access;

import com.journaldev.access.TestA;

public class TestB {
	public static void main(String[] args) {
		TestA.methodPublic();
		TestA.methodProtected();
		TestA.methodDefault();
	}
	
	public static void methodPublic(){
        System.out.println("B's public");
    }
	protected static void methodProtected(){
		System.out.println("B's protected");
    }
     
    static void methodDefault(){
    	System.out.println("B's default");
    }
     
    private static void methodPrivate()
    {
    	System.out.println("B's private");
    }
}
