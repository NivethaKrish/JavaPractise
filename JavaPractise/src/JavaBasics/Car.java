package JavaBasics;

public class Car {
	//Class variables or global variables-these are non static variables
	int model=2014;
	String name="City";
	
	
	public static void main(String[] args) 
	//static function
	{
		int age=25;
		System.out.println(age);
		
		 Car a=new Car();
		 System.out.println(a.model);
		 
		 a.test();
		 
		 int d=a.sum();
		 System.out.println(d);
		 
		 int k=a.avg(10,2);
				 System.out.println(k);
		 
	}

	
	public void test()
	{
		
		System.out.println("Hi hello");
		
	}
	
	public int sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	
	public int avg(int i, int j)
	{
		int avg=i/j;
		
		 return avg;
		
	}
}
