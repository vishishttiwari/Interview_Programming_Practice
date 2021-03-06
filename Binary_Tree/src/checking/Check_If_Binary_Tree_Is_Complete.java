package checking;

import util.Node;

public class Check_If_Binary_Tree_Is_Complete {
	static boolean found;
	public static boolean check(Node root) {
		found = true;
		checkTree(root);
		return found;
	}
	
	public static int checkTree(Node root) {
		if (root == null) return -1;
		int left = checkTree(root.left);
		int right = checkTree(root.right);
		if (left < right - 1) found = false;
		if (left > right + 1) found = false;
		if ((root.left == null) && (root.right != null)) found = false;
		return Math.max(left , right) + 1;
	}
}

/*
 * Check whether a given Binary Tree is Complete or not | Set 1 (Iterative Solution)
Given a Binary Tree, write a function to check whether the given Binary Tree is Complete Binary Tree or not.

A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible. See following examples.

The following trees are examples of Complete Binary Trees
    1
  /   \
 2     3
  
       1
    /    \
   2       3
  /
 4

       1
    /    \
   2      3
  /  \    /
 4    5  6
The following trees are examples of Non-Complete Binary Trees
    1
      \
       3
  
       1
    /    \
   2       3
    \     /  \   
     4   5    6

       1
    /    \
   2      3
         /  \
        4    5
 */