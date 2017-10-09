package io.mak.unit2;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i :" + i);
			System.out.println(this);

		});
	}

	public static void main(String args[]) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i :" + i);
				System.out.println(this);
			}

			public String toString() {
				return "this is the anonymous inner class";
			}
		});

		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i :" + i);
			// System.out.println(this); not work

			});

		thisReferenceExample.execute();
	}

}
