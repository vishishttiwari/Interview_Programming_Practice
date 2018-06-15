package problems;

import java.util.ArrayList;

import basic.Insert;
import util.TrieNode;

class Substrings {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class Print_All_Subarrays_Of_A_String {	
	public static ArrayList<String> find(String string) {
		TrieNode node = new TrieNode();
		for (int i = 0; i < string.length(); i++) Insert.insert(node, string.substring(i));
		findAll(node, "");
		return Substrings.arr;
	}
	
	private static void findAll(TrieNode node, String string) {
		Substrings.arr.add(string);
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) findAll(node.map.get((char)i), string + (char)i);
		}
	}
}
