package checking;

import java.util.LinkedList;
import java.util.Queue;

class NodeDetails {
	int value;
	int min;
	int max;
	NodeDetails(int value, int min, int max) {
		this.value = value;
		this.min = min;
		this.max = max;
	}
}

public class Check_If_Given_Array_Can_Represent_Levelorder_Traversal_Of_Binary_Search_Tree {	
	public static boolean check(int[] level) {
		Queue<NodeDetails> nodes = new LinkedList<NodeDetails>();
		int index = 0;
		nodes.add(new NodeDetails(level[index++], Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		while(true) {
			if (nodes.isEmpty()) return false;
			NodeDetails node = nodes.poll();
			if ((level[index] > node.min) && (level[index] < node.value))
				nodes.add(new NodeDetails(level[index++], node.min, node.value));
			if ((level[index] > node.value) && (level[index] < node.max)) 
				nodes.add(new NodeDetails(level[index++], node.value, node.max));
			if (index == level.length) return true;
		}
	}
}
/*
Check if the given array can represent Level Order Traversal of Binary Search Tree
Given an array of size n. The problem is to check whether the given array can represent the level order traversal of a Binary Search Tree or not.

Examples:

Input : arr[] = {7, 4, 12, 3, 6, 8, 1, 5, 10}
Output : Yes
For the given arr[] the Binary Search Tree is:
         7        
       /    \       
      4     12      
     / \    /     
    3   6  8    
   /   /    \
  1   5     10

Input : arr[] = {11, 6, 13, 5, 12, 10}
Output : No
The given arr[] do not represent the level
order traversal of a BST.
*/