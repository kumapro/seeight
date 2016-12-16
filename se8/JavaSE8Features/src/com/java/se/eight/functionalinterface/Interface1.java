package com.java.se.eight.functionalinterface;

@FunctionalInterface
public interface Interface1 {

	void method1();
	// A functional interface can have exactly one abstract method if we define more we will get below error 
	//Invalid '@FunctionalInterface' annotation; Interface1 is not a functional interface e.g. if we define method2 we will get same error message
//	void method2();
}
