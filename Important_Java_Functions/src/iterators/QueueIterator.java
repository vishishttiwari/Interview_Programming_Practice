package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class QueueIterator {
	public static ArrayList<Integer> iterate(Queue<Integer> set) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Iterator<Integer> itr= set.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next()); 
			arr.add(itr.next());
		}
		return arr;
	}
}
