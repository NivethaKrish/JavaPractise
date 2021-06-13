package JavaBasics;

public class StaticAndNonStatic {
	
	
	String name="Nivetha";
	static int age=25;

	public static void main(String[] args) 
	{
		
		StaticAndNonStatic obj =new StaticAndNonStatic();
		obj.sum();
		System.out.println(obj.name);
		StaticAndNonStatic.mail();
		System.out.println(StaticAndNonStatic.age);
	}
	
	public void sum()
	{
		System.out.println("Non static method");
	}
	
	public static void mail()
	
	{
		System.out.println("Static method");
	}

}
