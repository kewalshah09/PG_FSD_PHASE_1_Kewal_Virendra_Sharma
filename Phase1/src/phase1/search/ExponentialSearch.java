package phase1.search;

import java.util.Arrays;

public class ExponentialSearch {
	
	public static void main(String args[])
	{
		int[] arr = {6,12,18,24,44};
		int length = arr.length;
		int value = 44;
		int outcome = exponentialSearch(arr,length,value);
		
		if(outcome < 0) {
			System.out.println("Element is not present");}
			else {
			System.out.println("Element found at Position : "+ outcome);}
		}
	
	public static int exponentialSearch(int[] arr, int length,int value)
	{
		if(arr[0] == value)
		{
			return 0;
		}
		int i = 1;
		while(i<length && arr[i] <= value)
		{
			i=i*2;
		}
		return Arrays.binarySearch(arr, i/2,Math.min(i, length),value);
	}
}
