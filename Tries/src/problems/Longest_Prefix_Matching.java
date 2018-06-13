package problems;

import util.TrieNode;

public class Longest_Prefix_Matching {
	public static String findWords(TrieNode node, String string) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (node.endOfWord) answer = sb.toString();
			if (node.map.get(string.charAt(i)) == null) {
				node.map.put(string.charAt(i), new TrieNode());
			}
			node = node.map.get(string.charAt(i)) ;
			sb.append(string.charAt(i));
			if (node.endOfWord) answer = sb.toString();
		}
		return answer;
	}
}
