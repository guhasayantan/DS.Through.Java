package Collections;

import java.util.*;

public class LinkedHashSetOperations {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhashset = new LinkedHashSet<String>();
		lhashset.add("Sayantan");
		lhashset.add("Guha");
		lhashset.add("Bubu");
		lhashset.add("Priyanka");
		System.out.println(lhashset);
		
		//Iterate through the LinkedHashSet
		System.out.println("----------Iterate LinkedHashSet---------");
		Iterator iterator = lhashset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
