package basic;

import util.TrieNode;

public class Search {
	public static boolean search(TrieNode node, String string) {
		for (int i = 0; i < string.length(); i++) {
			if (node.map.get(string.charAt(i)) == null) return false;
			node = node.map.get(string.charAt(i));
		}
		if (node.endOfWord) return true;
		return false;
	}
}
