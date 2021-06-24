package phase1.sort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {9,12,3,21,44,5,1,10,25};
		selectionSort(arr);
		System.out.print("Sorted Element are : ");
		for(int i :arr)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			int index = i;
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			
			int smallest = arr[index];
			arr[index] = arr[i];
			arr[i] = smallest;
		}
	}
}
