package ConstructorConcept;

public class B extends A {

	public B() {
		super();
		System.out.println("Child Constructor");
	}

	public B(int i) {
		super(10);
		System.out.println("Child Constructor");
	}

	public B(int a, int b) {
		super(10, 20);
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {

		B obj1 = new B();
		B obj2 = new B(5);
		B obj3 = new B(25, 35);

	}

}
