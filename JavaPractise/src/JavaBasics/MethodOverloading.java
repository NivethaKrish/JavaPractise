package JavaBasics;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		
	}
	
	public static void main(int x)
	{
		System.out.println("Overloaded main method");
		System.out.println(x);
	}
	
	public void sum()
	{
		System.out.println("No param");
		
	}
	
	public void sum(double d)
	{
		System.out.println("Dif  datatype");
		System.out.println(d);
		
	}
	
	public void sum(int i)
	{
		System.out.println("one param");
		System.out.println(i);
	}
	
	public void sum(int j,int k)
	{
		System.out.println("Two param");
		System.out.println(j+k);
	}
	
	public void sum(double b,double c)
	{
		System.out.println("Double Dif  datatype");
		System.out.println(b+c);
		
	}
}
