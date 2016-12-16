package com.java.se.eight.instanceMethodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.se.eight.staticMethodreference.Person;

public class InstanceMethodReferenceTest {

	public static void main(String[] args) {
		InstanceMethodReferenceTest obj = new InstanceMethodReferenceTest();
		obj.sortData();
	}

	public void sortData() {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Jamuna", 65));
		persons.add(new Person("Anil", 34));
		persons.add(new Person("Atul", 44));
		persons.add(new Person("Bihari", 39));
		
		Collections.sort(persons, this :: compareAges);
		persons.forEach(s -> System.out.println(s));
		System.out.println();
		Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		persons.forEach(s -> System.out.println(s));
	}
	
	public int compareAges(Person p1, Person p2){
		Integer age2 = p2.getAge();
		return age2.compareTo(p1.getAge());
	}

}
