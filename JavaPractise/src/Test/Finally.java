package Test;

public class Finally {

	public static void main(String[] args) {
		test3();

	}

	public static void test1()
	{
		try {
			System.out.println("Inside try");
			throw new RuntimeException("throw");
		}
		
		catch(Exception e)
		{
			System.out.println("Inside catch");
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}
	
	
	public static void test2()
	{
		try {
			System.out.println("Inside try");
			
		}
		
		
		finally
		{
			System.out.println("Inside finally");
		}
	}
	
	
	public static void test3()
	{
		int i=10;
		try {
			System.out.println("Inside try");
			int div=i/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch");
		}
		
		finally
		{
			System.out.println("Inside finally");
		}
	}
}
