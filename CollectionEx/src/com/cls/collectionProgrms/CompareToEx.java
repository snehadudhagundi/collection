package com.cls.collectionProgrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Shop 
{
	int itemNo;
	String itemName;
	public Shop(int itemNo, String itemName) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
	}
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Shop [\nitemNo=" + itemNo + ",\n itemName=" + itemName + "]";
	}
	
	
	
	
	
}

class Item_No implements Comparator<Shop>
{

	
@Override
public int compare(Shop a, Shop b)
{

	return a.getItemNo()-b.getItemNo();
}
	
}

class Item_Name implements Comparator<Shop>
{

	
@Override
public int compare(Shop a, Shop b)
{

	return a.getItemName().compareTo(b.getItemName());
}
	
}
public class CompareToEx {

	public static void main(String[] args)
	{
		List<Shop> li=new ArrayList<>();
		Shop s1=new Shop(45,"Abc");
		Shop s2=new Shop(4,"23Abc");
		Shop s3=new Shop(88,"a56bc");
		Shop s4=new Shop(1,"abc");
		
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		
		
		
		System.out.println("Before Sorting ItemNo:"+li);
		
		Collections.sort(li,new Item_No());
		
		System.out.println("After Sorting ItemNo :"+li);

System.out.println("Before Sorting Name :"+li);
		
		Collections.sort(li,new Item_Name());
		
		System.out.println("After Sorting Name :"+li);

	}

}
