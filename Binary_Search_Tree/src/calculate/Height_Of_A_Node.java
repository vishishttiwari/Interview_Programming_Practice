package calculate;

import util.Node;

public class Height_Of_A_Node {	
	public static int calculate(Node root, int value) {
		if (root == null) return -10;
		int left = -10, right = -10;
		if (root.value == value) return 0;
		else if (root.value < value) right = calculate(root.right, value);
		else if (root.value > value) left = calculate(root.left, value);
		if (right >= 0) return right + 1;
		if (left >= 0) return left + 1;
		return -10;
	}
}
