package Collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class HashMapOperation {

	public static void main(String[] args) {
		//Declare the HaspMap
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();

		//Adding elements into HashMap
		hmap.put(1, "Sayantan");
		hmap.put(2, "Priyanka");
		hmap.put(4, "Bubu");
		hmap.put(3, "Shaan");
		hmap.put(10, "Arizona");
		hmap.put(9, "Tempe");
		hmap.put(8, "AZ");

		//Get the size of the hashmap
		System.out.println("The size of the hashmap: "+hmap.size());

		//Display HaspMap elements
		System.out.println("HaspMap elements : " + hmap);

		//Check if the hashmap is empty
		System.out.println("Is the HashMap empty? " + hmap.isEmpty());

		//Get values based on the key
		System.out.println(hmap.get(8));

		//Remove value based on the key
		Object rem = hmap.remove(8);
		System.out.println("The item removed from the HaspMap:" + rem);
		System.out.println(hmap.get(8)); //the value AZ is removed so the value returned in null

		//Iterating the HashMap using FOR LOOP
		System.out.println("Iterate using for loop");
		for(Map.Entry me : hmap.entrySet())
		{
			System.out.println("key: " + me.getKey() + " value: " + me.getValue());
		}

		//Iteraring the HapMap using WHILE LOOP
		System.out.println("Iterate using while loop");
		Iterator iterator = hmap.entrySet().iterator();

		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println("key: " + me.getKey() + " value: " + me.getValue());
		}

		//Sorting HashMap By Keys

		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		Set set = map.entrySet();
		System.out.println("Sorting HashMap by Keys");
		Iterator newiterator = set.iterator();
		while(newiterator.hasNext())
		{
			Map.Entry newmap = (Map.Entry)newiterator.next();
			System.out.println(newmap.getKey() + " : " + newmap.getValue());
		}

		//Sort by value
		System.out.println("Sorting HashMap by Values");
		List list = new LinkedList<>(hmap.entrySet());
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		} 
		Set set2 = sortedHashMap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry)iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}

		//Serlization of HashMap
		try {
			FileOutputStream fp = new FileOutputStream("/home/sayantan/workspace/HashMapSerialize.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fp);
			obj.writeObject(hmap);
			obj.close();
			fp.close();
		} catch (IOException e) {
			System.out.println("Error in serialization");
			e.printStackTrace();
		}


		//Clone HashMap
		HashMap<Integer,String> cloned = new HashMap<Integer,String>();
		cloned = (HashMap<Integer, String>)hmap.clone();
		System.out.println("The cloned hashmap is : "+cloned);
		//Removing all Mapping
		hmap.clear();

	}

}
