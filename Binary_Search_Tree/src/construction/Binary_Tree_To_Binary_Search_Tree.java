package construction;

import java.util.ArrayList;
import java.util.Collections;

import util.Node;

public class Binary_Tree_To_Binary_Search_Tree {
	static ArrayList<Integer> Arr;
	static int index;
	public static void convert(Node node) {
		Arr = new ArrayList<Integer>();
		index = 0;
		inorderTraversal(node);
		Collections.sort(Arr);
		inorderTraversalAgain(node);
	}
	
	private static void inorderTraversal(Node node) {
		if (node == null) return;
		inorderTraversal(node.left);
		Arr.add(node.value);
		inorderTraversal(node.right);
	}
	
	private static void inorderTraversalAgain(Node node) {
		if (node == null) return;
		inorderTraversalAgain(node.left);
		node.value = Arr.get(index++);
		inorderTraversalAgain(node.right);
	}
}
