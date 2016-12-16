package com.java.se.eight.defaultstatic;

// Either test() method is default or static in both the interfaces we will get compile time error
// to resolve this we must have to override/overhide test method 
public class DefaultStaticMethodTests implements Interface1, Interface2{
	public static void main(String[] args) {
		DefaultStaticMethodTests obj = new DefaultStaticMethodTests();
		// if one is default and other is static and we call test() method then default one gets priority.
		obj.test(); 
	}

	@Override
	public void testDefault() {
		System.out.println("Overriding Default method from multiple parents");
	}

	
}
