package zig_zag;

import rotation.Left_Rotation;
import rotation.Right_Rotation;
import util.Node;

public class Zig_Zag_Left_Right {
	public static Node zig_zag(Node root) {
		Left_Rotation.left(root.left);
		return Right_Rotation.right(root);
	}
}
