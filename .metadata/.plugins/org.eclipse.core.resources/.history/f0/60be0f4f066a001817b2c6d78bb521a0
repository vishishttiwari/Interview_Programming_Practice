package conversion;

import util.Node;

public class Binary_Search_Tree_To_Greater_Sum_Tree {
	static int prev;
	public static void convert(Node root) {
		prev = 0;
		convertTree(root);
	}
	
	private static void convertTree(Node root) {
		if (root == null) return;
		convertTree(root.right);
		int value = root.value + prev;
		root.value = prev;
		prev = value;
		convertTree(root.left);
	}
}

/*
 * Transform a BST to greater sum tree
Given a BST, transform it into greater sum tree where each node contains sum of all nodes greater than that node.
 */