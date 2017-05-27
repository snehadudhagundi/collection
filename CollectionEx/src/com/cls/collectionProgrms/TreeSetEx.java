package com.cls.collectionProgrms;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args)
	{
		
		TreeSet<String> tr=new TreeSet<>();
		tr.add("A");
		tr.add("abc");
		tr.add("123Ab");
		tr.add("x");
		//tr.add(null);
		System.out.println(tr);
		
		TreeSet tr1=new TreeSet<>();
		tr1.add(1);
		tr1.add(2);
		tr1.add(3);
		tr1.add(4);
		System.out.println(tr1);
	}

}

