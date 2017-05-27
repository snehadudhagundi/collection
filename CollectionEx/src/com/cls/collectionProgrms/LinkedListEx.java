package com.cls.collectionProgrms;

import java.util.Iterator;
import java.util.LinkedList;

class Emp
{
	int eid;
	String ename;
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
}
public class LinkedListEx {

	public static void main(String[] args)
	{
		LinkedList<Emp> li=new LinkedList<Emp>();
		Emp e1=new Emp(1,"A");
		Emp e2=new Emp(2,"B");
		Emp e3=new Emp(3,"C");
		Emp e4=new Emp(4,"D");
		li.addLast(e3);
		li.add(e1);
		li.add(e4);
		li.add(e2);
	//	li.addFirst(e4);
	//	li.getFirst();
		//System.out.println("GetFirst Element:"+li.get(2));
	//	li.isEmpty();
		
		Iterator ltr=li.iterator();
		while(ltr.hasNext())
		{
			Emp em=(Emp)ltr.next();
			//Emp em1=(Emp)li.getFirst();
			
			System.out.println("EId:"+em.eid);
			System.out.println("Ename :"+em.ename);
			//System.out.println("Size:"+li.size());
			
		}
		

	}

}
