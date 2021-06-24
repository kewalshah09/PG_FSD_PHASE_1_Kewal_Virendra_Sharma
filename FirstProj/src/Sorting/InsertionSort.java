package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = {8,2,4,1,3};
		int current;
		int length = a.length;
		
		for(int i = 1; i < length ; i++)
		{
			current = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > current)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
		
		for(int i = 0 ; i <a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
