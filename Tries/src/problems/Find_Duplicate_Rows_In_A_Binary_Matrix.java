package problems;

import java.util.ArrayList;
import java.util.HashMap;

class TrieNode {
	HashMap<Integer, TrieNode> map;
	boolean end;
	public TrieNode() {
		map = new HashMap<Integer, TrieNode>();
		end = false;
	}
}

public class Find_Duplicate_Rows_In_A_Binary_Matrix {	
	public static ArrayList<Integer> find(int[][] bin) {
		TrieNode node = new TrieNode();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < bin.length; i++) {
			if (!insert(node, bin[i])) arr.add(i + 1);
		}
		return arr;
	}
	
	private static boolean insert(TrieNode node, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (node.map.get(arr[i]) == null) node.map.put(arr[i], new TrieNode());
			node = node.map.get(arr[i]);
		}
		if (node.end) return false;
		else {
			node.end = true;
			return true;
		}
	}
}
