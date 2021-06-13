package Main;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("String array");
		main("Test");
		main(10);
		main(10,20);
	}

	public static void main(String args) {
		System.out.println("String ");
	}
	
	public static void main(int a) {
		System.out.println("Int");
	}
	public static void main(int a,int b) {
		System.out.println("Int 2");
	}



}
