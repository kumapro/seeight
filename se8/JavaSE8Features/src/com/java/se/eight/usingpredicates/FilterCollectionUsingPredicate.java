package com.java.se.eight.usingpredicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.java.se.eight.staticMethodreference.Person;

public class FilterCollectionUsingPredicate {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Jamuna", 65));
		persons.add(new Person("Anil", 34));
		persons.add(new Person("Atul", 44));
		persons.add(new Person("Bihari", 39));

		Predicate<Person> predicate = (p) -> (p.getAge() > 40 && p.getName().equalsIgnoreCase("atul"));
		
		displayPeople(persons, predicate);

	}

	private static void displayPeople(List<Person> persons, Predicate<Person> predicate) {
		// traversing collections using forEach method.
		/*persons.forEach(p -> {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		});*/
		
//		 traversing collection with stream.
		/*
		 * There are two type of stream
		 * 1.	sequential stream
		 * 2.	parallel stream 
		 * 
		 * to create sequential stream we can call stream() method of Collection interface
		 * parallel stream could be created in two way
		 * a.	by calling parallelStream().
		 * b.	by calling stream() and then parallel() methods.
		 * */
		persons.stream().filter(predicate).forEach(s -> System.out.println(s));
	}

}
