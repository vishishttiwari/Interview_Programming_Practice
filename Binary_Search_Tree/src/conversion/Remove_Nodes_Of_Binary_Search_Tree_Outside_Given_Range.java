package conversion;

import util.Node;

public class Remove_Nodes_Of_Binary_Search_Tree_Outside_Given_Range {
	public static Node remove(Node node, int min, int max) {
		if (node == null) return null;
		if (node.value < min) return remove(node.right, min, max);
		if (node.value > max) return remove(node.left, min, max);
		node.left = remove(node.left, min, max);
		node.right = remove(node.right, min, max);
		return node;
	}
}
