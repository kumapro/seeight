package com.java.se.eight.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i<=20 ; i++){
			numbers.add(i);
		}
		
		Stream<Integer> sequentialStream = numbers.stream();
		Stream<Integer> highNums = sequentialStream.filter(p -> p > 15);
		highNums.forEach(s -> System.out.println(s));
		
		System.out.println("Paralle actin started....");
		
		Stream<Integer> parallelStream = numbers.parallelStream();
		Stream<Integer> parHiNums = parallelStream.filter(p -> p > 5);
		parHiNums.forEach(s -> System.out.println(s));
		
	}

}
