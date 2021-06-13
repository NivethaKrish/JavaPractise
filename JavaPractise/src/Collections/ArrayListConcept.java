package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
 
		ArrayList ar = new ArrayList();

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);

		System.out.println(ar.size());

		ar.add(60);
		ar.add(70);
		ar.add(30);
		ar.add("Tom");
		ar.add('a');
		ar.add(13.33);
		ar.add(true);

		System.out.println(ar.size());

		System.out.println(ar.get(4));
		System.out.println(ar.get(5));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("**************************");

		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ar1.add(101);
		ar1.add(201);
		ar1.add(301);
		ar1.add(401);
		ar1.add(501);

		for (int j = 0; j < ar1.size(); j++) {
			System.out.println(ar1.get(j));
		}

		System.out.println("**************************");

		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("hi1");
		ar2.add("hi2");
		ar2.add("hi3");
		ar2.add("hi4");
		ar2.add("hi5");

		for (int k = 0; k < ar2.size(); k++) {
			System.out.println(ar2.get(k));
		}

		Student s1 = new Student("Tom", 5, 'B');
		Student s2 = new Student("Peter", 8, 'C');
		Student s3 = new Student("Harry", 6, 'D');

		ArrayList<Student> ar4 = new ArrayList<Student>();

		ar4.add(s1);
		ar4.add(s2);
		ar4.add(s3);

		Iterator<Student> it = ar4.iterator();
		while (it.hasNext()) {
			Student stu = it.next();

			System.out.println(stu.name);
			System.out.println(stu.grade);
			System.out.println(stu.section);
			System.out.println("*******************");
		}

		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("QA");
		ar5.add("IQA");
		ar5.add("HQA");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("NQA");
		ar6.add("DEV");
		ar6.add("ADMIN");

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Tom");
		ar7.add("QA");
		ar7.add("Test");

		ar5.addAll(ar6);
		for (int x = 0; x < ar5.size(); x++) {
			System.out.println(ar5.get(x));
		}

		System.out.println("*******************");

		ar5.removeAll(ar6);
		for (int x = 0; x < ar5.size(); x++) {
			System.out.println(ar5.get(x));
		}

		System.out.println("*******************");

		ar5.retainAll(ar7);
		for (int x = 0; x < ar5.size(); x++) {
			System.out.println(ar5.get(x));
		}
	}

}
