package Collections;

import java.util.*;


public class TreeMapOperations {

	public static void main(String[] args) {
		
		//Declare a TreeMap
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		//Add the items in the TreeMap
		tmap.put(1, "Sayantan");
		tmap.put(2, "Priyanka");
		tmap.put(5, "Guha");
		tmap.put(3, "Bubu");
		tmap.put(4, "Pappu");
		
		//Iterator in normal order
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println("Key is: "+ me.getKey() + " Value: " + me.getValue());
			
		}
		
		// TreeMap in reverse order declare like below 
		// TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(Collections.reverseOrder());
		
		// Count the number of items in the TreeMap
		System.out.println("The number of items in the TreeMap: "+tmap.size());
		
		//Check the treemap is empty or not
		System.out.println("Check the TreeMap is empty: " + tmap.isEmpty());
		
		Object itemremove = tmap.remove(3);
		System.out.println("The item removed is :" + itemremove);
		System.out.println(tmap);
		
		//SubMap from TreeMap
		SortedMap<Integer, String> sortmap = tmap.subMap(3, 4);
		System.out.println("SortedMap contains" + sortmap);
		
		//sort by value
		
		// Calling the method sortByvalues
	    Map sortedMap = sortByValues(tmap);
	 
	    // Get a set of the entries on the sorted map
	    Set set1 = sortedMap.entrySet();
	 
	    // Get an iterator
	    Iterator i = set1.iterator();
	 
	    // Display elements
	    while(i.hasNext()) {
	      Map.Entry me = (Map.Entry)i.next();
	      System.out.print(me.getKey() + ": ");
	      System.out.println(me.getValue());
	    }
		
		//Remove all mapping from the TreeMap
		tmap.clear();
	}
	
	public static <K, V extends Comparable<V>> Map<K, V> 
    sortByValues(final Map<K, V> map) {
    Comparator<K> valueComparator = 
             new Comparator<K>() {
      public int compare(K k1, K k2) {
        int compare = 
              map.get(k1).compareTo(map.get(k2));
        if (compare == 0) 
          return 1;
        else 
          return compare;
      }
    };
 
    Map<K, V> sortedByValues = 
      new TreeMap<K, V>(valueComparator);
    sortedByValues.putAll(map);
    return sortedByValues;
  }

}
