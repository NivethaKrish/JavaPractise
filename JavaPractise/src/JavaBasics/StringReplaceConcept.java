package JavaBasics;

import java.util.Scanner;

public class StringReplaceConcept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter s1");	
		String s1 = sc.nextLine();
		
		System.out.println("Enter s2");
		String s2 = sc.nextLine();
		
		System.out.println("Enter s3");
		String s3 = sc.nextLine();
		
		String newstring = s1.replace(s2, s3);
			System.out.println(newstring);
		}

}
