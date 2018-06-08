package properties;
import java.util.ArrayList;
import java.util.Collections;

import util.Node;

public class Path_To_A_Node_In_Binary_Tree {
	static ArrayList<Integer> arr;
	public static ArrayList<Integer> find(Node root, Node find) {
		arr = new ArrayList<Integer>();
		findPath(root, find);
		Collections.reverse(arr);
		return arr;
	}
	
	public static boolean findPath(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath(root.left, find);
		boolean right = findPath(root.right, find);
		if (root.value == find.value) {
			arr.add(root.value);
			return true;
		}
		if (left || right) {
			arr.add(root.value);
			return true;
		}
		else return false;
	}
}
