package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {


		ArrayList<String> ar = new ArrayList<String>();

		ar.add("Bepannah");
		ar.add("Ishqbaaz");
		ar.add("KRP");
		ar.add("Diya");
		ar.add("Yeh");

	System.out.println("**********for each**********");	
	
	for(String shows : ar)
	{
		System.out.println(shows);
	}
	
	
	System.out.println("**********Simple for**********");	
	for(int n=0;n<ar.size();n++)
	{
		System.out.println(ar.get(n));
	}
	
	System.out.println("**********Iterator**********");
	Iterator<String> it = ar.iterator();
	
	while(it.hasNext())
	{
		String shows = it.next();
		System.out.println(shows);
		
	}
	
	System.out.println("**********List Iterator(Next)**********");
	ListIterator<String> ittn = ar.listIterator();
	
	while(ittn.hasNext())
	{
		String show = ittn.next();
		System.out.println(show);
		
	}
	
	System.out.println("**********List Iterator**********");
	ListIterator<String> itt = ar.listIterator(ar.size());
	
	while(itt.hasPrevious())
	{
		String shows = itt.previous();
		System.out.println(shows);
		
	}
	
	System.out.println("**********For Each Iterator**********");
	ar.forEach(show ->{
		System.out.println(show);
	});
	
	
	System.out.println("**********For Each Remaining Iterator**********");
	it=ar.iterator();
	it.forEachRemaining(show ->{
		System.out.println(show);
	});
	}

}
