package properties;

import util.Node;

public class Diameter_Of_Tree {
	public static int diameter(Node node) {
		int left = depth(node.left);
		int right = depth(node.right);
		return left + right + 1;
	}
	
	public static int depth(Node node) {
		if (node == null) return 0;
		int left = depth(node.left);
		int right = depth(node.right);
		return Math.max(left + 1, right + 1);
	}
	
}
/*Diameter of a Binary Tree in O(n) [A new method]
The diameter of a tree is the number of nodes on the longest path between two leaves in the tree. 
The diagram below shows two trees each with diameter nine, 
the leaves that form the ends of a longest path are colored (note that there may be more than one path in tree of same diameter).
*/