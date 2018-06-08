package checking;

import util.Node;

public class Check_If_Binary_Search_Tree_Contains_Deadend {
	public static void main(String[] args) {
		Node node = new Node(8);
		node.left = new Node(7);
		node.right = new Node(10);
		node.left.left = new Node(2);
		//node.right.left = new Node(9);
		node.right.right = new Node(13);
		
		System.out.println(check(node));
	}
	
	public static boolean check(Node node) {
		return checkTree(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean checkTree(Node node, int min, int max) {
		if (node == null) return false;
		boolean left = checkTree(node.left, min, node.value);
		if (((min + 1) == node.value) && ((node.value + 1) == max)) return true;
		if ((node.value == 1) && (node.left == null) && (node.right == null)) return true;
		boolean right = checkTree(node.right, node.value, max);
		return (left || right);
	}
}
/*
Simple Recursive solution to check whether BST contains dead end
Given a Binary Search Tree that contains positive integer values greater than 0. 
The task is to check whether the BST contains a dead end or not. 
Here Dead End means, we are not able to insert any integer element after that node.

Examples:

Input :        8
             /   \
           5      9
         /   \
        2     7
       /
      1
Output : Yes
Explanation : Node "1" is the dead End because
         after that we cant insert any element.

Input :       8
            /   \
           7     10
         /      /   \
        2      9     13

Output :Yes
Explanation : We can't insert any element at
              node 9.
*/