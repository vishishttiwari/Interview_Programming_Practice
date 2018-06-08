package searching;

import util.Node;

public class kth_Largest_Element {
	static int kth;
	static Node found;
	public static Node search(Node node, int k) {
		kth = k;
		found = null;
		searchValue(node);
		return found;
	}
	
	public static void searchValue(Node node) {
		if (node == null) return;
		System.out.println(node.value);
		searchValue(node.right);
		kth--;
		if (kth == 0) {
			found = node;
			return;
		}
		searchValue(node.left);
	}
}
