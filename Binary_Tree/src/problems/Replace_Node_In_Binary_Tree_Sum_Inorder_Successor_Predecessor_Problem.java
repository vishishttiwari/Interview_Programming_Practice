package problems;
import java.util.ArrayList;

import util.Node;

public class Replace_Node_In_Binary_Tree_Sum_Inorder_Successor_Predecessor_Problem {
	static int index;
	static ArrayList<Integer> arr;
	public static Node replace(Node root) {
		Integer[] inorder= convert(root);
		index = 1;
		traverse(inorder, root);
		return root;
	}
	
	public static void traverse(Integer[] inorder, Node root) {
		if (root == null) return;
		traverse(inorder, root.left);
		root.value = inorder[index - 1] + inorder[index + 1];
		traverse(inorder, root.right);
	}
	
	public static Integer[] convert(Node root) {
		arr = new ArrayList<Integer>();
		convertTreeToArray(root);
		Integer[] array = new Integer[arr.size() + 2];
		arr.toArray(array);
		for (int i = arr.size() - 1; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0] = 0;
		array[array.length - 1] = 0;
		return array;
	}
	
	public static void convertTreeToArray(Node root) {
		if (root == null) return;
		convert(root.left);
		arr.add(root.value);
		convert(root.right);
	}
}
