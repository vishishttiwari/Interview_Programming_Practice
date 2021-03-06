package basic;

import util.Node;

public class Delete {	
	public static Node deleteRecursive(Node root, int value) {
		if (root == null) return  null;
		if (root.value == value) {
			if ((root.left == null) && (root.right == null)) return null;
			else if ((root.left != null) && (root.right == null)) return root.left;
			else if ((root.left == null) && (root.right != null)) return root.right;
			else {
				Node Successor =  inOrderSuccessor(root);
				deleteRecursive(root, Successor.value);
				root.value = Successor.value;
			}
		}
		else if (root.value < value) root.right = deleteRecursive(root.right, value);
		else if (root.value > value) root.left = deleteRecursive(root.left, value);
		return root;
	}
	
	static Node successor;
	static boolean found;
	private static Node inOrderSuccessor(Node root) {
		successor = null;
		found = false;
		inOrder(root, root);
		return successor;
	}
	
	private static void inOrder(Node root, Node node) {
		if (root == null) return;
		inOrder(root.left, node);
		if (found) {
			successor = root;
			found = false;
		}
		if (root.value == node.value) found = true;
		inOrder(root.right, node);
	}
}
