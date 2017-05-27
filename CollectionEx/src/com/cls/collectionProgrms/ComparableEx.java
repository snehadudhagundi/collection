package com.cls.collectionProgrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>
{
	
	
	int bId;
	String bName;
	String bAuthor;
	public Book(int bId, String bName, String bAuthor) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthor;
	}
	@Override
	public int compareTo(Book o)
	{
		
		return this.bId - o.bId ;
	}
	@Override
	public String toString() {
		return "\n bId=" + bId + ",\n bName=" + bName + ", \nbAuthor=" + bAuthor + "";
	}
	
	
}
public class ComparableEx {

	public static void main(String[] args) 
	{
		List<Book> list=new ArrayList<>();
		Book b1=new Book(11,"abc","G45Y");
		Book b2=new Book(20,"12abc","78Txt");
		Book b3=new Book(5,"aB45c","xRU");
		Book b4=new Book(9,"XabG","x98bI");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		System.out.println("Before Sorting: "+list);
		
		Collections.sort(list);
		System.out.println("After Sorting : "+list);
		

	}

}
