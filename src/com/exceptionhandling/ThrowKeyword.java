package com.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args)
	{
		System.out.println("PASS");
		
		try {
			throw new Exception("PRAVEEN EXCEPTION");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("FAIL");
	}
}
