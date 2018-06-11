package deletion;

import balance.Balance;
import rotation.Left_Rotation;
import rotation.Right_Rotation;
import util.Node;

public class Delete_Node {
	
	public static Node delete(Node root, int value) {
		if (root == null) return  null;
		if (root.value == value) {
			if ((root.left == null) && (root.right == null)) return null;
			else if ((root.left != null) && (root.right == null)) return root.left;
			else if ((root.left == null) && (root.right != null)) return root.right;
			else {
				Node Successor =  inOrderSuccessor(root);
				delete(root, Successor.value);
				root.value = Successor.value;
			}
		}
		else if (root.value < value) root.right = delete(root.right, value);
		else if (root.value > value) root.left = delete(root.left, value);
		
		root.height = Math.max(root.left.height, root.right.height) + 1;
		
		// Left Left case
		if ((Balance.balance(root) > 1) && (value < root.left.value)) return Right_Rotation.right(root);
		// Right Right case
		else if ((Balance.balance(root) < -1) && (value > root.right.value)) return Left_Rotation.left(root);
		// Left Right case
		else if ((Balance.balance(root) > 1) && (value > root.left.value)) {
			root.left = Left_Rotation.left(root);
			return Right_Rotation.right(root);
		}
		// Right Left case
		else if ((Balance.balance(root) < -1) && (value < root.right.value)) {
			root.left = Right_Rotation.right(root);
			return Left_Rotation.left(root);
		}
		return root;
	}

	static Node successor;
	static boolean found;
	private static Node inOrderSuccessor(Node root) {
		successor = null;
		found = false;
		inOrder(root, root);
		return successor;
	}
	
	private static void inOrder(Node root, Node node) {
		if (root == null) return;
		inOrder(root.left, node);
		if (found) {
			successor = root;
			found = false;
		}
		if (root.value == node.value) found = true;
		inOrder(root.right, node);
	}
}
