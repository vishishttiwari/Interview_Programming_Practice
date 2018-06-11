package insertion;

import balance.Balance;
import rotation.Left_Rotation;
import rotation.Right_Rotation;
import util.Node;

public class Insert_Node {
	public static Node insert(Node root, int value) {
		if (root == null) return new Node(value);
		else if (root.value > value) root.left = insert(root.left, value);
		else if (root.value < value) root.right = insert(root.right, value);
		
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
}
