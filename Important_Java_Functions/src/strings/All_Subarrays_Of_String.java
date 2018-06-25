package strings;

import java.util.ArrayList;
import java.util.HashMap;


class TrieB {
	public HashMap<Character, TrieB> map;
	public boolean endOfWord;
	public TrieB() {
		map = new HashMap<Character, TrieB>();
		endOfWord = false;
	}
}

class Substrings {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class All_Subarrays_Of_String {
	public static ArrayList<String> find(String string) {
		TrieB node = new TrieB();
		for (int i = 0; i < string.length(); i++) insert(node, string.substring(i));
		findAll(node, "");
		return Substrings.arr;
	}
	
	private static void findAll(TrieB node, String string) {
		Substrings.arr.add(string);
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) findAll(node.map.get((char)i), string + (char)i);
		}
	}
	
	private static void insert(TrieB node, String value) {
		for (int i = 0; i < value.length(); i++) {
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new TrieB());
			}
			node = node.map.get(value.charAt(i));
		}
		node.endOfWord = true;
	}
}