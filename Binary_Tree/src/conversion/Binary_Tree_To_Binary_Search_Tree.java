package conversion;

import java.util.ArrayList;
import java.util.Collections;

import util.Node;

public class Binary_Tree_To_Binary_Search_Tree {
	static ArrayList<Integer> arr;
	static int index;
	public static Node convert(Node root) {
		arr = new ArrayList<Integer>();
		index = 0;
		inorder(root);
		Collections.sort(arr);
		inorderAgain(root);
		return root;
	}
	
	public static void inorder(Node root) {
		if (root == null) return;
		inorder(root.left);
		arr.add(root.value);
		inorder(root.right);
	}
	
	public static void inorderAgain(Node root) {
		if (root == null) return;
		inorderAgain(root.left);
		root.value = arr.get(index);
		index++;
		inorderAgain(root.right);
	}
}
