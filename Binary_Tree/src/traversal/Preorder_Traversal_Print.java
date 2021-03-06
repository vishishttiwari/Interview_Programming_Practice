package traversal;
import util.Node;

public class Preorder_Traversal_Print {
	public static void preorder(Node root) {
		if (root == null) return;
		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}
}
