package com.java.se.eight.creatingstream.from.collectionandarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.java.se.eight.staticMethodreference.Person;

public class ArrayToStream {

	public static void main(String[] args) {
		streamFromArray();
		streamFromCollection();
	}

	private static void streamFromArray() {
		System.out.println("Creating stream from Array....");
		Person[] person = {
				new Person("Jamuna", 65),
				new Person("Anil", 34),
				new Person("Atul", 44),
				new Person("Bihari", 39)
		}; 
		
		// There is two way to create stream from array 1.	Using of() method of Stream interface 2.	Using stream() method of Arrays class 
//		Stream<Person> stream = Stream.of(person);
		Stream<Person> stream = Arrays.stream(person);
		stream.forEach(p -> System.out.println(p));
	}

	private static void streamFromCollection() {
		
		System.out.println("\nCreating stream from Collection....");
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Jamuna", 65));
		persons.add(new Person("Anil", 34));
		persons.add(new Person("Atul", 44));
		persons.add(new Person("Bihari", 39));
		
		Stream<Person> stream = persons.stream();
		stream.forEach(p -> System.out.println(p));
	}

}
