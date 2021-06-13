package JavaBasics;

public class WrapperClass {

	public static void main(String[] args)
	{
		
		String s="100";
		System.out.println(s+20);
		
		int i=Integer.parseInt(s);
		System.out.println(i+20);
		
		String x="11.22";
		System.out.println(x);
		
		double d=Double.parseDouble(x);
		System.out.println(d+22.11);
		
		String y="true";
		System.out.println(y);
		 
		boolean b=Boolean.parseBoolean(y);
		System.out.println(b);
		
		int j=100;
		System.out.println(j);
		
		System.out.println(j+10);
		
		String s1=String.valueOf(j);
		System.out.println(s1);
		System.out.println(s1+30);
		
		String u="100A";
			
		Integer.parseInt(u);
		
		String s = "java";
		char c = s.charAt(0);
		System.out.println(c);
	}

}
