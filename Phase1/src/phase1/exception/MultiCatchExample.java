package phase1.exception;

public class MultiCatchExample {
	
	public static void main(String args[])
	{
		int a[] = new int[5];
		
		try
		{
			a[2] = 10;
			a[1] = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		for (int i = 0 ; i < 5 ; i++)
		{
		System.out.println("Value at "+ i + " is : " + a[i] );
		}
	}

}
