package Collections;

import java.util.*;

public class LinkedHashMapOperations {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhashmap = new LinkedHashMap<Integer, String>();
		lhashmap.put(1, "Sayantan");
		lhashmap.put(2, "Guha");
		lhashmap.put(4, "Brisbane");
		lhashmap.put(3, "Austrlia");
		//Print the LinkedHashMap
		System.out.println(lhashmap);
		
		//Iterate through LinkedHashMap
		Set set = lhashmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());
		}
		
	}

}
