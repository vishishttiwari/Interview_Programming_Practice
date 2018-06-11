package search;

import util.Node;
import zig_zag.Zig_Zag_Left_Right;
import zig_zag.Zig_Zag_Right_Left;
import zig_zig.Zig_Zig_Left_Left;
import zig_zig.Zig_Zig_Right_Right;

public class Search {
	public static Node search(Node root, int value) {
		if ((root == null) || (root.value == value)) return root;
		else if (root.value > value) {
			if (root.left == null) return null;
			if (root.left.value > value) {
				Zig_Zig_Left_Left.zig_zig(root);
				return search(root.left.left, value);
			}
			else if (root.left.value < value) {
				Zig_Zag_Left_Right.zig_zag(root);
				return search(root.left.right, value);
			}
		}
		else {
			if (root.left == null) return null;
			if (root.left.value < value) {
				Zig_Zig_Right_Right.zig_zig(root);
				return search(root.right.right, value);
			}
			else if (root.left.value > value) {
				Zig_Zag_Right_Left.zig_zag(root);
				return search(root.right.left, value);
			}
		}
		return null;
	}
}

/* This is faulty */