package com.cls.collectionProgrms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args)
	{
		Set s1=new LinkedHashSet();
		s1.add(2);
		s1.add("xyz");
		s1.add(null);
		s1.add('G');
		s1.add("123xyz");
		s1.add(null);
		s1.add(2);
		System.out.println(s1);

	}

}
