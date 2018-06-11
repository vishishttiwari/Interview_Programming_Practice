package rotation;

import util.Node;

public class Right_Rotation {
	public static Node right(Node root) {
		Node left = root.left;
		Node leftRight = root.left.right;
		
		left.right = root;
		root.left = leftRight;
		
		root.height = Math.max(root.left.height, root.right.height) + 1;
        left.height = Math.max(left.left.height, left.right.height) + 1;
		
		return left;
	}
}

/*
T1, T2, T3 and T4 are subtrees.
 	  z                                      y 
 	 / \                                   /   \
    y   T4      Right Rotate (z)          x      z
   / \          - - - - - - - - ->      /  \    /  \ 
  x  T3                               T1  T2  T3  T4
 / \
T1 T2
*/