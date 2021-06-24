package phase1.sort;

public class BubbleSort {
	
	public static void main(String args[])
	{
		int[] arr = {1,25,20,15,5,10};
		int itr = 0;
		
		for(int i= 0;i < arr.length;i++) 
		{
			for(int j = 0; j<arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}itr++;
			}itr++;
		}
		
		 for (int i=0; i<arr.length; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	        System.out.println(itr);
	}

}

