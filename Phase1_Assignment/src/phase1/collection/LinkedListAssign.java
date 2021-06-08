package phase1.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssign {
	
	public static void main(String args[])
	{
		LinkedList<String> months = new LinkedList<String>();
		
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("April");
		
		System.out.println("Array Size : "+months.size());
		
		Iterator itrl = months.iterator();
		while(itrl.hasNext())
		{
			System.out.println("Months : "+itrl.next());
		}
		
		months.add("Sep");
		months.add("Oct");
		
		System.out.println("Array Size : "+months.size());
		
		Iterator itrl1 = months.iterator();
		while(itrl1.hasNext())
		{
			System.out.println("Months : "+itrl1.next());
		}
		
		months.add(4,"May");
		months.add(5,"June");
		months.add(6,"July");
		months.add(7,"August");
		
		System.out.println("Array Size : "+months.size());
		System.out.println("Array : "+months);
		
		months.addLast("Nov");
		months.addLast("Dec");
		
		System.out.println("Array Size : "+months.size());
		System.out.println("Array : "+months);
		
	}

}
