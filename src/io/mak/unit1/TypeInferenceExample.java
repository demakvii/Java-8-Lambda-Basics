package io.mak.unit1;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLamdba l) {
		System.out.println(l.getLength("Mayur"));
	}

	interface StringLengthLamdba {
		int getLength(String s);
	}
}
