package iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
	public static ArrayList<Integer> iterate(HashSet<Integer> set) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Iterator<Integer> itr= set.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next()); 
			arr.add(itr.next());
		}
		return arr;
	}
}
