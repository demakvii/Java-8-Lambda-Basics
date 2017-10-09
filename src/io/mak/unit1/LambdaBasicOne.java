package io.mak.unit1;

public class LambdaBasicOne {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		MyLambda myLambdaFunction = (c,d) -> {
			
			System.out.print(c+d);
			
		};
		myLambdaFunction.foo(a,b);
	}

}

interface MyLambda {
	void foo(int a,int b);
}

