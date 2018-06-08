package traversal;

import util.Node;

public class Leaf_Traversal_Print {
	static void printLeaves(Node node) {
        if (node != null) {
            printLeaves(node.left);
            if (node.left == null && node.right == null) System.out.print(node.value + " ");
            printLeaves(node.right);
        }
    }
}
