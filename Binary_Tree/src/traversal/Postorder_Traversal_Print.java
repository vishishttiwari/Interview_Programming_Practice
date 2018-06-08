package traversal;
import util.Node;

public class Postorder_Traversal_Print {
	public static void postorder(Node root) {
		if (root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.value);
	}
}
