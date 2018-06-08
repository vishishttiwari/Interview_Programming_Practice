package properties;

import java.util.ArrayList;
import java.util.Collections;

import util.Node;

public class Lowest_Common_Ancestor {	
	static ArrayList<Node> arr1;
	static ArrayList<Node> arr2;	
	public static Node find(Node root, Node first, Node second) {
		arr1 = new ArrayList<Node>();
		arr2 = new ArrayList<Node>();
		findPath1(root, first);
		findPath2(root, second);
		Collections.reverse(arr1);
		Collections.reverse(arr2);
		int size = Math.max(arr1.size(), arr2.size());
		for (int i = 0; i < size; i++) {
			if (arr1.get(i).value != arr2.get(i).value) return arr1.get(i - 1);
		}
		return null;
	}
	
	public static boolean findPath1(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath1(root.left, find);
		boolean right = findPath1(root.right, find);
		if (root.value == find.value) {
			arr1.add(root);
			return true;
		}
		if (left || right) {
			arr1.add(root);
			return true;
		}
		else return false;
	}
	
	public static boolean findPath2(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath2(root.left, find);
		boolean right = findPath2(root.right, find);
		if (root.value == find.value) {
			arr2.add(root);
			return true;
		}
		if (left || right) {
			arr2.add(root);
			return true;
		}
		else return false;
	}
}
/*
Lowest Common Ancestor in a Binary Tree | Set 1
Given a binary tree (not a binary search tree) and two values say n1 and n2, write a program to find the least common ancestor.

Following is definition of LCA from Wikipedia:
Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 
is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root. 
Computation of lowest common ancestors may be useful, for instance, as part of a procedure for determining the distance between pairs of nodes in a tree: 
the distance from n1 to n2 can be computed as the distance from the root to n1, 
plus the distance from the root to n2, minus twice the distance from the root to their lowest common ancestor. (Source Wiki)
 */