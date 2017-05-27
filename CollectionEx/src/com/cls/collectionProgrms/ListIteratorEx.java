package com.cls.collectionProgrms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("ABC");
		al.add("hello");
		al.add(null);
		al.add("ABC");
		al.add("He");
		al.add(3,"ABC");
		System.out.println(al);
		System.out.println("Get 5th Element: "+al.get(5));
		
		System.out.println("Traversing Elements in Forword Direction :\n");
		ListIterator<String> ltr=al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("In Backword Direction : \n");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}

	}

}
