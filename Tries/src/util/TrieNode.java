package util;

import java.util.HashMap;

public class TrieNode {
	public HashMap<Character, TrieNode> map;
	public boolean endOfWord;
	public TrieNode() {
		map = new HashMap<Character, TrieNode>();
		endOfWord = false;
	}
}
