package com.java.se.eight.defaultstatic;

public interface Interface1 {

	static void testStatic(){
		System.out.println("testStatic method of Interface1");
	}
	
	static void test(){
		System.out.println("static test method of Interface1");
	}
	
	default void testDefault(){
		System.out.println(" testDefault of Interface1");
	}
}