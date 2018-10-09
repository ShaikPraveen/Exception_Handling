package com.exceptionhandling;

public class ThrowsKeyword 
{
	//Throws keyword also  handle exceptions
	//Throws handles the exception one method to another method
	public static void main(String[] args)  
	{
		ThrowsKeyword tk=new ThrowsKeyword();
		tk.sum();
		System.out.println("PASS");
	
    }
	
	
	public void sum() throws ArithmeticException
	{
		try
		{
			div();	
		} catch (Exception e) 
		{
			
		}	
	}
	
	public void div() throws ArithmeticException
	{
		int i=10/0;
	}
}
