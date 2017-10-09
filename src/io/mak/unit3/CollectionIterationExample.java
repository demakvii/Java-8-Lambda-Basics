package io.mak.unit3;

import io.mak.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Mayur", "Kalekar", 22),
				new Person("Akshay", "Kalekar", 25), new Person("Loki",
						"Raccha", 23), new Person("Virkam", "Lenfave", 22));
		// external iterator(Controlling iterator)
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		for (Person person : people) {
			System.out.println(person);
		}

		// internal iterator(Giving control to someone else)

		people.forEach(System.out::println);

	}

}
