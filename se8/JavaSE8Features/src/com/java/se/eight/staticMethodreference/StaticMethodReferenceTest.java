package com.java.se.eight.staticMethodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReferenceTest {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Jamuna", 65));
		persons.add(new Person("Anil", 34));
		persons.add(new Person("atul", 44));
		persons.add(new Person("Bihari", 39));

		Collections.sort(persons, Person :: compareAges);
		persons.forEach(s -> System.out.println(s));

	}

}