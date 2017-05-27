package com.cls.collectionProgrms;

public class ExceptionEd {

	public static void main(String[] args) 
	{
		try{
			int b[]={10,20};
			int a=b[1]/0;
			
		}catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException ex1)
		{
			System.out.println(ex1);
		}
		catch(Exception ex2)
		{
			System.out.println(ex2);
		}
	}

}
