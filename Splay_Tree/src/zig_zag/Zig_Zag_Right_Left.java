package zig_zag;

import rotation.Left_Rotation;
import rotation.Right_Rotation;
import util.Node;

public class Zig_Zag_Right_Left {
	public static Node zig_zag(Node root) {
		Right_Rotation.right(root.right);
		return Left_Rotation.left(root);
	}
}
