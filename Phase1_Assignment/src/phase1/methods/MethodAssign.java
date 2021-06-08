package phase1.methods;

import java.util.Scanner;

public class MethodAssign {
	
	public static int addNum (int x, int y)
	{
		return x+y;
	}
	
	public static float areaCircle (int r)
	{
		float pi = 3.14152f;
		return pi*r;
	}
	
	public static int areaRect (int l, int b)
	{
		return l*b;
	}
	
	public static void main(String args[])
	{
		int x,y,r,l,b,add,op,lb;
		float ac;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select Which operation to do : ");
		System.out.println("1. Addition");
		System.out.println("2. Area of Circle");
		System.out.println("3. Area of Rectangle");
		op = scanner.nextInt();
		
		if (op == 1)
		{
		System.out.println("Please Enter Number 1");
		x = scanner.nextInt();
		System.out.println("Please Enter Number 2");
		y = scanner.nextInt();
		add = addNum(x, y);
		System.out.println("Num1 + Num2 : "+add);
		}
		
		if (op == 2)
		{
			System.out.println("Enter Radius of Circle");
			r = scanner.nextInt();
			ac = areaCircle(r);
			System.out.println("Area of Circle : "+ac);
		}
		
		if(op == 3)
		{
			System.out.println("Please Enter Length");
			l = scanner.nextInt();
			System.out.println("Please Enter Breadth");
			b = scanner.nextInt();
			lb = areaRect(l,b);
			System.out.println("Area of Rectangle : "+ lb);
		}
	}

}
