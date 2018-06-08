package searching;

import util.Node;

public class Floor_Of_A_Number_Using_Binary_Search_Tree {	
	static Node found;
	public static Node search(Node node, int value) {
		found = null;
		find(node, value);
		return found;
	}
	
	private static Node find(Node root, int value) {
		if ((root.left == null) && (root.right == null)) {
			if (root.value <= value) return root;
			else return new Node(-1);
		}
		if (root.value == value) {
			return root;
		}
		if (root.value < value) {
			if ((root.right.value > value) || root.right == null) return root;
		}
		if (root.value > value) return find(root.left, value);
		else return find(root.right, value);
	}
}
