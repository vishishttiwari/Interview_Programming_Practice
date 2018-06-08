package checking;

import util.Node;

public class Check_If_Two_Tree_Are_Mirror {	
	static boolean found;
	public static boolean check(Node root1, Node root2) {
		found = true;
		checkTrees(root1, root2);
		return found;
	}
	
	public static void checkTrees(Node root1, Node root2) {
		if ((root1 == null) && (root2 != null)) {
			found = false;
			return;
		}
		if ((root1 != null) && (root2 == null)) {
			found = false;
			return;
		}
		if ((root1 == null) && (root2 == null)) return;
		if (root1.value != root2.value) {
			found = false;
			return;
		}
		checkTrees(root1.left, root2.right);
		checkTrees(root1.right, root2.left);
	}
}
/*Check if two trees are Mirror
Given two Binary Trees, write a function that returns true if two trees are mirror of each other, else false. 
For example, the function should return true for following input trees.
*/