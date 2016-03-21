package Collections;

import java.util.*;


public class HashSetOperations {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<>();
		//Add items in the HashSet
		hset.add("Sayantan");
		hset.add("Priyanka");
		hset.add("Bubu");
		hset.add("Guchu");
		hset.add("hello");

		System.out.println(hset);

		//Iterate through items
		System.out.println("----Iterate HashMap----");
		Iterator iterator = hset.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		//Convert HashSet to Array
		System.out.println("-----HashMap to Array----");
		String array[] = new String[hset.size()];
		hset.toArray(array);

		for(String item: array)
		{
			System.out.println(item);
		}

		//Convert HashSet to TreeSet -- This will throw nullexpection if the value in the HashSet is null
		System.out.println("-----HashMap to TreeSet----");
		Set<String> tset = new TreeSet<String>(hset);


		for(String item: tset)
		{
			System.out.println(item);
		}

		//Convert HashSet to Array
		System.out.println("-----HashMap to List/Array----");
		List<String> list = new ArrayList<String>(hset);

		for(String item: list)
		{
			System.out.println(item);
		}


		//Clear the HashSet
		hset.clear();
	}

}
