package com.java.se.eight.foreachtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachTest {

	public static void main(String[] args) {
		iterateList();
		System.out.println();
		iterateSet();
		
	}
	
	public static void iterateList(){
		// create a list of integers
		List<Integer> list = new ArrayList<>();
		
		// add integer values to the list
		for(int i=1; i<=10; i++){
			list.add(i);
		}
		
		// iterate over the list and print the values
		list.forEach(s -> System.out.print(s + " "));
	}
	
	
	public static void iterateSet(){
		// create a list of integers
		Set<Integer> set = new HashSet<>();
		
		// add integer values to the list
		for(int i=1; i<=10; i++){
			set.add(i);
		}
		
		// iterate over the list and print the values
		set.forEach(s -> System.out.print(s + " "));
	}

}
