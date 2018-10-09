package com.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		/*int i=9/0;
		System.out.println(i); //ArithmetixException
		*/
		
	//1.try-catch block 
		try 
		{
			int i=9/10; //This code will throw an exception
			
		} catch (ArithmeticException e)  //catch (Error e) //catch (Exception e) //catch (Throwable e)
		{
			 e.printStackTrace(); // Means it will print the Error Message
			 System.out.println(e.getMessage());
		}
		System.out.println("PASS");
		
	}

}
