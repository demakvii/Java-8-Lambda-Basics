package io.mak.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnitOneExerciseSolutionJava8 {

	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Mayur", "Kalekar", 22),
				new Person("Akshay", "Kalekar", 25), new Person("Loki",
						"Raccha", 23), new Person("Virkam", "Lenfave", 22));

		Collections.sort(people,
				(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printConditionally(people, p -> true);

		printConditionally(people, p -> p.getLastName().startsWith("K"));

		printConditionally(people, p -> p.getFristName().startsWith("M"));

	}

	private static void printConditionally(List<Person> people,
			Condition condition) {
		people.forEach(p -> {
			if (condition.test(p))
				System.out.println(p);
		});

	}

}
