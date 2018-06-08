package conversion;

import java.util.ArrayList;

import util.Node;

public class Binary_Search_Tree_To_Min_Heap {	
	static ArrayList<Integer> arr;
	static int index;
	public static void convert(Node node) {
		arr = new ArrayList<Integer>();
		index = 0;
		inOrder(node);
		preOrder(node);
	}
	
	private static void inOrder(Node node) {
		if (node == null) return;
		inOrder(node.left);
		arr.add(node.value);
		inOrder(node.right);
	}
	
	private static void preOrder(Node node) {
		if (node == null) return;
		node.value = arr.get(index++);
		preOrder(node.left);
		preOrder(node.right);
	}
}

/*
Convert BST to Min Heap
Given a binary search tree which is also a complete binary tree. 
The problem is to convert the given BST into a Min Heap with the condition that 
all the values in the left subtree of a node should be less than all the values 
in the right subtree of the node. This condition is applied on all the nodes in 
the so converted Min Heap.

Examples:

Input :          4
               /   \
              2     6
            /  \   /  \
           1   3  5    7  

Output :        1
              /   \
             2     5
           /  \   /  \
          3   4  6    7 

The given BST has been transformed into a
Min Heap.
All the nodes in the Min Heap satisfies the given
condition, that is, values in the left subtree of
a node should be less than the values in the right
subtree of the node. 
*/
