package phase1.exception;

import java.io.*;

public class MultiTryExample {
	
	public static void main(String args[])
	{
		try
		{
			checkException();
		}
		catch(Exception e)
		{
			System.out.println("EXCEPTION");
		}
		finally
		{
			System.out.println("Main Finally Block");
		}
	}
	
	public static void checkException() throws ClassNotFoundException
	{
		try
		{
			int a = 3/0;
		}
		finally
		{
			System.out.println("Function Finally Block");
		}
	}

}
