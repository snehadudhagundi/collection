package com.cls.collectionProgrms;
import java.util.Iterator;
import java.util.ArrayList;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListCapacityIncr {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
	//	a.ensureCapacity(arg0);
	//a.ensureCapacity(20);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		
		//System.out.println(a);
		Iterator it= a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Iterator itr= (Iterator)a.iterator();
/*	for(int x:a)
		{
			System.out.println(a);
		}*/
		
	/*	a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("F");
		a.add("G");
		a.add("H");
		a.add("I");
		a.add("J");
		a.add("K");
		a.add("L");
		for(String s:a)
		{
			System.out.println(a);
		}
		*/
		

	}

}
