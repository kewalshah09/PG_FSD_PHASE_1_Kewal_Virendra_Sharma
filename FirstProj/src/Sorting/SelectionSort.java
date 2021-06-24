package Sorting;

public class SelectionSort {
	
	public static void main(String args[])
	{
		int[] a = { 38,52,9,18,6,62,13 };
		int temp;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = i+1 ; j <= a.length-1 ; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			
		for(int i = 0 ; i <a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
