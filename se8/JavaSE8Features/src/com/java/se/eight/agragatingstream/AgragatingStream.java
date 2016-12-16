package com.java.se.eight.agragatingstream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import com.java.se.eight.staticMethodreference.Person;

public class AgragatingStream {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Jamuna", 65));
		persons.add(new Person("Anil", 34));
		persons.add(new Person("Atul", 44));
		persons.add(new Person("Bihari", 39));
		
		int sum = persons.stream().mapToInt(a -> a.getAge()).sum();
		System.out.println("Sum is " + sum);
		
		OptionalDouble avg = persons.stream().mapToInt(a -> a.getAge()).average();
		if (avg.isPresent()) {
			System.out.println("Agerage is " + avg);
		} else {
			System.out.println("Average not calculated...");
		}
	}

}
