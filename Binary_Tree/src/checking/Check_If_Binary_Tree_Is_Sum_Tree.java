package checking;

import util.Node;

public class Check_If_Binary_Tree_Is_Sum_Tree {
	static boolean found;
	public static boolean check(Node root) {
		found = true;
		checkSum(root);
		return found;
	}
	public static int checkSum(Node root) {
		if (root == null) return 0;
		if ((root.left == null) && (root.right == null)) return root.value;
		int left = checkSum(root.left);
		int right = checkSum(root.right);
		System.out.println("left: " + left + " right: " + right + " value: " + root.value);
		if (root.value != (left + right)) found = false;
		return root.value + left + right;
	}
}

/*
 * Check if a given Binary Tree is SumTree
Write a function that returns true if the given Binary Tree is SumTree else false. A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Following is an example of SumTree.

          26
        /   \
      10     3
    /    \     \
  4      6      3
 */