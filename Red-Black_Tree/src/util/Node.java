package util;

public class Node {
	public int value;
	public NodeColor color;
	public Node left;
	public Node right;
	public Node parent;
	
	public Node(int value) {
		this.value = value;
		this.color = NodeColor.RED;
	}
}
