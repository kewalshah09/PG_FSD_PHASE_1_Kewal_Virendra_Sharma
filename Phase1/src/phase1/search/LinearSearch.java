package phase1.search;

public class LinearSearch {
	
	public static void main(String args[])
	{
		
		int[] arr = {5,13,90,10,7,12,11,2,15};
		int ele = 12;
		int pos = 0;
		
		for(int i = 0 ; i < 9;i++)
		{
			if(arr[i] == ele)
				pos = i;
		}
		System.out.println("Position of Element " + ele + " is : "+ pos);
	}
}
