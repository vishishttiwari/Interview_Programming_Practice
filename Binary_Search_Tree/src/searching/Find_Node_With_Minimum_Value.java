package searching;

import util.Node;

public class Find_Node_With_Minimum_Value {
	public static Node search(Node node) {
		if (node.left == null) return node;
		return search(node.left);
	}
}
