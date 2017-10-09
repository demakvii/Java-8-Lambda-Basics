package io.mak.unit3;

import io.mak.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Mayur", "Kalekar", 22),
				new Person("Akshay", "Kalekar", 25), 
				new Person("Loki","Raccha", 23), 
				new Person("Virkam", "Lenfave", 22)
				);

		people
		.stream()
		.filter(p -> p.getLastName().startsWith("K"))
		.forEach(p -> System.out.println(p.getFristName()));  //terminal

		long count = people
		.stream()
		.filter(p -> p.getLastName().startsWith("K"))
		.count(); //terminal point
		
		System.out.println(count);
	}

}
