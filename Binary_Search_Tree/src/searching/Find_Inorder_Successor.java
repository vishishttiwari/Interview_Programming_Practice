package searching;

import util.Node;

public class Find_Inorder_Successor {
	static Node successor;
	static boolean found;
	public static Node inOrderSuccessor(Node root, Node node) {
		successor = null;
		found = false;
		inOrder(root, node);
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
