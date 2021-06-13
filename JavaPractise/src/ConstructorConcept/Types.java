package ConstructorConcept;

public class Types {
		
	String color;
	int price;
			
		public Types()
		{
			System.out.println("Default Constructor");
		}
		

		public Types(int price)
		{
			System.out.println("One Parameter Constructor");
			System.out.println(price);
		}
		
		public Types(String color,int price)
		{
			System.out.println("Two Parameter Constructor");
			System.out.println(price);
			System.out.println(color);
		}

		public static void main(String[] args) {
			
			Types p1=new Types();
			Types p2=new Types(5);
			Types p3=new Types("Black",5);
			
			
		}

		

	}


