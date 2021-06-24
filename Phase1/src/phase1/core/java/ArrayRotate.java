package phase1.core.java;

public class ArrayRotate {
	
	public static void main(String args[]) {
		
		int[] a = new int[] {11,31,4,3,61};
		int small = a[0];
		
		
		for(int i = 0 ; i<5 ; i++)
		{
			if(small > a[i])
			small = a[i];
		}
		System.out.println("Smallest element is : " + small);

	}

}
