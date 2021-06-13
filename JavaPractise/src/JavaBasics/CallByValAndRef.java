package JavaBasics;

import com.test.xml;

public class CallByValAndRef {
	
	int p;
	int q;
	
	public static void main(String[] args) {
		<?xml version="1.0" encoding="UTF-8"?>
		
		
		CallByValAndRef obj=new CallByValAndRef();
		obj.p=10;
		obj.q=20;
		System.out.println(obj.p + " " + obj.q);
		int s=obj.sum(obj);
		System.out.println(obj.p + " " + obj.q);
		System.out.println(s);
		
		
	}

	
	
	public  int sum(CallByValAndRef t)
	{
		int r=t.p+t.q;
		return r;
	}
}
