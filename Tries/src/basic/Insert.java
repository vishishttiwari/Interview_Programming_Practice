package basic;

import util.TrieNode;

public class Insert {
	public static void insert(TrieNode node, String value) {
		for (int i = 0; i < value.length(); i++) {
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new TrieNode());
			}
			node = node.map.get(value.charAt(i));
		}
		node.endOfWord = true;
	}
}
