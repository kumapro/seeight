package com.java.se.eight.defaultstatic;

public class StaticMethodFromMultipleParentTest implements Interface1, Interface2{

	public static void main(String[] args) {
		/*StaticMethodFromMultipleParentTest obj = new StaticMethodFromMultipleParentTest();
		 
		// if testStatic() is static in both in interfaces then we will get below error
		// The method testStatic() is undefined for the type StaticMethodFromMultipleParentTest
		
		obj.testStatic();*/
		
		// to resolve this we must have to overhide the static method implementation
		testStatic();
	}
	// if all parents have static method with same name
	static void testStatic(){
		System.out.println("Test static method of Interface2");
	}
	
	// if all parents have default method with same name
	@Override
	public void testDefault() {
		System.out.println("Overriding Default method from multiple parents");
	}


}
