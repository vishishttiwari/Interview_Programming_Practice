package zig_zig;

import rotation.Left_Rotation;
import util.Node;

public class Zig_Zig_Left_Left {
	public static Node zig_zig(Node root) {
		return Left_Rotation.left(Left_Rotation.left(root));
	}
}
