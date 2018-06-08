package searching;

import util.Node;

public class Lowest_Common_Ancestor {	
	public static Node search(Node node, int node1, int node2) {
		if (node == null) return null;
		if (node.value < node1) return search(node.right, node1, node2);
		else if (node.value > node2) return search(node.left, node1, node2);
		else if ((node.value >= node1) && (node.value <= node2)) return node;
		return null;
	}
}
