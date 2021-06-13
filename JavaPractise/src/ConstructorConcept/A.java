package ConstructorConcept;

public class A {
	
	public A()
	{
		System.out.println("Parent Constructor");
	}
	
	public A(int i)
	{
		System.out.println("one Parameter Constructor");
		System.out.println(i);
	}
	
	public A(int a,int b)
	{
		System.out.println("Two Parameter Constructor");
		System.out.println(a + "  " +b);
	}
}
