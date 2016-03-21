package Collections;

import java.util.*;

public class VectorOperations {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		//Adding items into vector
		vector.add("Sayantan");
		vector.add("Bubu");
		vector.add("Guchu");
		vector.add("Guha");

		//Display the vector
		System.out.println("Vector is : "+vector);

		//Display size and capacity
		System.out.println("The size of vector is: " + vector.size());
		System.out.println("The capacity of vector is: " + vector.capacity());

		//Additional items are added
		vector.add("Brisbane");
		vector.add("Tempe");

		//Iterate through Enumerate
		System.out.println("----------Iterate through Enumeration-----------");
		Enumeration en =vector.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

		//Sub list from vector
		List sublist = vector.subList(2, 5);
		System.out.println("----------Sub list from vector-----------");
		System.out.println(sublist);

		//Sort using Collections.sort()
		System.out.println("----------Sort using Collections.sort()-----------");
		Collections.sort(vector);
		System.out.println(vector);

		//Search element using vector using index
		System.out.println("-----Search element using vector using index ------");
		System.out.println(vector.elementAt(1));

		Vector<String> newvector = new Vector<String>();
		newvector.add("Apple");
		newvector.add("Orange");

		//Copy vector
		System.out.println("-----Copy vector ------");
		System.out.println(newvector);
		Collections.copy(vector, newvector);
		System.out.println(vector);

		//Iterator example
		System.out.println("-----Iterator------");
		Iterator iterator = vector.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		//Listiterator example
		System.out.println("-----Listiterator------");
		ListIterator literator = vector.listIterator();
		while(literator.hasNext())
		{
			System.out.println(literator.next());
		}

		//Remove element from vector
		System.out.println("----Remove element from vector----");
		System.out.println("The removed item is: "+ vector.remove("Apple"));
		System.out.println(vector);

		//Remove element from vector using index
		System.out.println("----Remove element from vector using index----");
		System.out.println("The removed item is: "+ vector.remove(1));
		System.out.println(vector);

		//Vector to List
		List<String> list = Collections.list(vector.elements());
		System.out.println("----Vector to List ----");
		for(String str: list)
		{
			System.out.println(str);
		}

		//Vector to Array
		ArrayList<String> arrlist = new ArrayList<String>(vector);
		System.out.println("----Vector to Array ----");
		for(String str1: arrlist)
		{
			System.out.println(str1);
		}

		//Vector to String Array
		String[] arr = vector.toArray(new String[vector.size()]);
		System.out.println("----Vector to String Array ----");
		for(String str2: arr)
		{
			System.out.println(str2);
		}
		//Set the size of vector
		vector.setSize(10);
		System.out.println(vector);
		
		//clear all vector elements
		vector.clear();
	}

}
