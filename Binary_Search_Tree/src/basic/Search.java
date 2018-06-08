package basic;

import util.Node;

public class Search {	
	public static Node searchRecursive(Node root, int value) {
		if (root == null) return null;
		if (root.value == value) return root;
		Node left = searchRecursive(root.left, value);
		Node right = searchRecursive(root.right, value);
		if (left != null) return left;
		return right;
	}
	
	public static Node searchIterative(Node root, int value) {
		Node node = root;
		while (node != null) {
			if (node.value < value) node = node.right;
			else if (node.value > value) node = node.left;
			else return node;
		}
		return null;
	}
}
