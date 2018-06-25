package iterators;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
	@SuppressWarnings("rawtypes")
	public static void iterate(HashMap<Integer, Integer> map) {
		for(Map.Entry m:map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}
	}
}
