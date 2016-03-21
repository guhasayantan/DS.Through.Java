package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Sayantan");
		treeset.add("Bubu");
		treeset.add("Guchu");
		treeset.add("Sonu");
		
		Iterator iterator = treeset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
