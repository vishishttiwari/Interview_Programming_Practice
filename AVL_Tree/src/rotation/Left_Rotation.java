package rotation;

import util.Node;

public class Left_Rotation {
	public static Node left(Node root) {
		Node right = root.right;
		Node rightLeft = root.right.left;
		
		right.left = root;
		root.right = rightLeft;
		
		root.height = Math.max(root.left.height, root.right.height) + 1;
        right.height = Math.max(right.left.height, right.right.height) + 1;
		
		return right;
	}

}

/*
 	  z                                y
	 /  \                            /   \ 
    T1   y     Left Rotate(z)       z      x
   	    /  \   - - - - - - - ->    / \    / \
       T2   x                     T1  T2 T3  T4
      	   / \
      	  T3  T4
*/