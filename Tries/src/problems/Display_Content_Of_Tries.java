package problems;

import java.util.ArrayList;

import util.TrieNode;

class printWords {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class Display_Content_Of_Tries {
	public static void find(TrieNode node) {
		findWords(node, "");
		System.out.println(printWords.arr.toString());
	}
	
	private static void findWords(TrieNode node, String string) {
		if (node.endOfWord) printWords.arr.add(string);
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) findWords(node.map.get((char)i), string + (char)i);
		}
	}
}
