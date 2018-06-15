package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackIterator<T> {
	public static ArrayList<Integer> iterate(Stack<Integer> set) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Iterator<Integer> itr= set.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next()); 
			arr.add(itr.next());
		}
		return arr;
	}
}
