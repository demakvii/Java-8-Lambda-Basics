package io.mak.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Mayur", "Kalekar", 22),
				new Person("Akshay", "Kalekar", 25), new Person("Loki",
						"Raccha", 23), new Person("Virkam", "Lenfave", 22));

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return (o1.getLastName().compareTo(o2.getLastName()));
			}
		});

		printAll(people);

		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("K");
			}
		});
	}

	private static void printConditionally(List<Person> people,
			Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}

interface Condition {
	boolean test(Person p);
}