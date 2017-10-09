package io.mak.unit2;

import io.mak.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {

	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Mayur", "Kalekar", 22),
				new Person("Akshay", "Kalekar", 25), new Person("Loki",
						"Raccha", 23), new Person("Virkam", "Lenfave", 22));

		Collections.sort(people,
				(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		perFormConditionally(people, p -> true, p -> System.out.println(p));

		perFormConditionally(people, p -> p.getLastName().startsWith("K"),
				p -> System.out.println(p));

		perFormConditionally(people, p -> p.getFristName().startsWith("M"),
				p -> System.out.println(p.getFristName()));

	}

	private static void perFormConditionally(List<Person> people,
			Predicate<Person> predicate, Consumer<Person> consumer) {
		people.forEach(p -> {
			if (predicate.test(p))
				consumer.accept(p);
		});

	}
}
