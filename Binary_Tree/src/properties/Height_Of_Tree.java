package properties;

import util.Node;

public class Height_Of_Tree {
	public static int depth(Node node) {
		if (node == null) return 0;
		int left = depth(node.left);
		int right = depth(node.right);
		return Math.max(left + 1, right + 1);
	}
}
