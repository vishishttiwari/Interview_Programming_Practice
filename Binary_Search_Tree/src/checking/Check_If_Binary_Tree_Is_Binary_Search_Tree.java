package checking;

import java.util.ArrayList;

import util.Node;

public class Check_If_Binary_Tree_Is_Binary_Search_Tree {
	static ArrayList<Integer> arr;
	public static boolean check(Node root) {
		arr = new ArrayList<Integer>();
		inorder(root);
		for (int i = 1; i < arr.size(); i++) if (arr.get(i) < arr.get(i-1)) return false;
		return true;
	}
	
	private static void inorder(Node root) {
		if (root == null) return;
		inorder(root.left);
		arr.add(root.value);
		inorder(root.right);
	}
}
