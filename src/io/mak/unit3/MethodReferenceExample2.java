package io.mak.unit3;

import io.mak.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Mayur", "Kalekar", 22),
				new Person("Akshay", "Kalekar", 25), new Person("Loki",
						"Raccha", 23), new Person("Virkam", "Lenfave", 22));

		perFormConditionally(people, p -> true, System.out::println);
		// p -> method(p)

	}

	private static void perFormConditionally(List<Person> people,
			Predicate<Person> predicate, Consumer<Person> consumer) {
		people.forEach(p -> {
			if (predicate.test(p))
				consumer.accept(p);
		});

	}
}
