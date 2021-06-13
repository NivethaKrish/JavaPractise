package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Peter");
		ll.add("Tom");
		ll.add("Harry");
		ll.add("Sejal");
		
		
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.addFirst("First");
		System.out.println(ll);
		
		ll.addLast("Last");
		System.out.println(ll);
		
		ll.remove(1);
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		
		System.out.println(ll.get(0));
		
		ll.set(0,"Jane");
		System.out.println(ll.get(0));
		System.out.println(ll);
		
		System.out.println("*************");

	for(int n = 0;n<ll.size();n++)
	{
		System.out.println(ll.get(n));
	}
	
	System.out.println("------------------");
	for(String str : ll)
	{
		
		System.out.println(str);
	}
	
	System.out.println("/////////////////");
	int num=0;
	while(num<ll.size())
	{
		System.out.println(ll.get(num));
		num++;
	}
	

	System.out.println("++++++++++++");
	 
	Iterator<String> it = ll.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	
}}
