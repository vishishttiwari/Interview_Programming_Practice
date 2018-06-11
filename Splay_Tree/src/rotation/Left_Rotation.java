package rotation;

import util.Node;

public class Left_Rotation {
	public static Node left(Node root) {
		Node right = root.right;
		Node rightLeft = root.right.left;
		
		right.left = root;
		root.right = rightLeft;
		
		return right;
	}
}
