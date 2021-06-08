package phase1.collection;

import java.util.*;

public class TreeSetExample {
	
	public static void main(String args[])
	{
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("x");
		ts.add("a");
		ts.add("y");
		ts.add("b");
		ts.add("z");
		
		System.out.println("TreeSet Output : "+ts);
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Aa");
		hs.add("Ab");
		hs.add("Ax");
		hs.add("Ba");
		hs.add("Ac");
		hs.add("Ah");
		
		System.out.println("HashSet Output : "+hs);
		
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		lh.add("Aa");
		lh.add("Ab");
		lh.add("Ax");
		lh.add("Ba");
		lh.add("Ac");
		lh.add("Ah");
		
		System.out.println("LinkedHashSet Output : "+lh);
		System.out.println("Size of LinkedHashSet : "+lh.size());
		System.out.println("Is LinkedHashSet Empty? : "+lh.isEmpty());
	}

}
