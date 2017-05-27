package com.cls.collectionProgrms;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args)
	{
		Set s=new HashSet<>();
		s.add(98);
		s.add(1);
		s.add("ABC");
		s.add(5);
		s.add(1);
		s.add("bdr");
		s.add(null);
		s.add(null);
		System.out.println(s);
		boolean b=s.contains(5);
		System.out.println(b);
		

	}

}
