package Sorting;

// 52 26 93 17 77 31 44 55 20

// 26 52 17 77 31 44 55 20 93



public class BubbleSort {
	
	public static void main(String args[])
	{
		int[] a = {52, 26, 93, 17, 77, 31, 44, 55, 20};
		int length = a.length;
		int temp;
		
		for(int j = 0 ; j < length - 2 ; j++)
		{
		for(int i = 0 ; i < length - 1 ; i++)
		{
			if(a[i] > a[i+1])
			{
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		}
		
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}

}
