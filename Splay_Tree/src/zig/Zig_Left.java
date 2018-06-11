package zig;

import rotation.Left_Rotation;
import util.Node;

public class Zig_Left {
	public static Node zig(Node root) {
		return Left_Rotation.left(root);
	}
}
