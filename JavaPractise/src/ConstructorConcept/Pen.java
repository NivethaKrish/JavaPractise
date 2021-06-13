package ConstructorConcept;

public class Pen {
	
	String color;
	int price;
	String brand;
	
	public Pen(String color,int price,String brand)
	{
		this.color=color;
		this.price=price;
		this.brand=brand;
		
	}

	public static void main(String[] args) {
		
		Pen p1=new Pen("Blue",5,"Reynolds");
		Pen p2=new Pen("Red",5,"Cello");
		Pen p3=new Pen("Black",5,"Elkos");
		
		System.out.println(p1.color + " "+ p1.price +" "+ p1.brand);
		System.out.println(p2.color + " "+ p2.price +" "+ p2.brand);
		System.out.println(p3.color + " "+ p3.price +" "+ p3.brand);
	}

}
