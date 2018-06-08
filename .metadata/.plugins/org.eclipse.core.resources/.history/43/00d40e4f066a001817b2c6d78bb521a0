package conversion;

import util.Node;

public class Binary_Search_Tree_To_Binary_Tree_With_Sum_Of_Smaller_Keys {	
	static int prev;
	public static void convert(Node root) {
		prev = 0;
		convertTree(root);
	}
	
	private static void convertTree(Node root) {
		if (root == null) return;
		convertTree(root.left);
		root.value += prev;
		prev = root.value;
		convertTree(root.right);
	}
}
