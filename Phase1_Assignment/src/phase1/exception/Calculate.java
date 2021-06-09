package phase1.exception;

import java.util.Scanner;
import java.io.*;

public class Calculate {
	
	public static void main(String args[])
	{
		int l,b,ar = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter Length : ");
		l = scanner.nextInt();
		
		System.out.println("Please Enter Breadth : ");
		b = scanner.nextInt();
		
		Calculate obj = new Calculate();
		
		try
		{
		ar = obj.calculateArea(l,b);
		}
		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}
		
		System.out.println("Area of Rectangle : "+ar);
}

	int calculateArea(int l,int b) throws IOException
	{
		return display(l,b);
	}
	
	int display(int l, int b) throws IOException
	{
		if (l>b)
		{
			throw new IOException("Length is greater than Breadth");
		}
		else
		{
			return l*b;
		}
		
	}
}