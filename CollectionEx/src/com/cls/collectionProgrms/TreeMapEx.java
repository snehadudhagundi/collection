package com.cls.collectionProgrms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args)
	{
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		map.put(1, 111);
		map.put(2, 222);
		map.put(3, 333);
	//	map.put(1, 444);
		//System.out.println(map);
		
		//Iterating over keys or values using For-Each loop.
		
	/*	for(Integer key:map.keySet())
		{
			System.out.println("Key : "+key);
		}
		for(Integer value:map.values())
		{
			System.out.println("Values : "+value);
		}
		*/
		
		/*
		 * Iterating using Iterator.
		 * 	Using Generics:
		 */
		/*	Iterator<Map.Entry<Integer, Integer>> entries=map.entrySet().iterator();
				while(entries.hasNext())
				{
					Map.Entry<Integer, Integer> ent=entries.next();
					System.out.println("\nKey : "+ent.getKey()+"\nValues : "+ent.getValue());
				}
			*/
		
		
		/*
		 * Iterating over entries using For-Each loop
		 */
		/*for(Map.Entry<Integer, Integer> entries:map.entrySet())
		{
			System.out.println("\nKeys : " + entries.getKey() + "\nValues : "+entries.getValue());
		}
		*/
		
		/*
		 * Iterating over keys and searching for values (inefficient)
		 */
		for(Integer key:map.keySet())
		{
			Integer value=map.get(key);
			System.out.println("\nKey : "+key+"\nValues : "+value);
		}
		

	}

}
