package conversion;

import java.util.ArrayList;

import util.Node;

public class Binary_Search_Tree_To_Balanced_Binary_Search_Tree {	
	static ArrayList<Integer> arr;
	public static Node convert(Node node) {
		arr = new ArrayList<Integer>();
		inorder(node);
		Integer[] array = new Integer[arr.size()];
		arr.toArray(array);
		return construct(array);
	}
	
	private static void inorder(Node node) {
		if (node == null) return;
		inorder(node.left);
		arr.add(node.value);
		inorder(node.right);
	}
	
	private static Node construct(Integer[] arr) {
		return (constructTree(arr, 0, arr.length - 1));
	}
	
	private static Node constructTree(Integer[] arr, int lo, int hi) {
		if (hi < lo) return null;
		int mid = (hi + lo)/2;
		Node node = new Node(arr[mid]);
		node.left = constructTree(arr, lo, mid - 1);
		node.right = constructTree(arr, mid + 1, hi);
		return node;
	}
}