package searching;

import util.Node;

public class Find_Nodes_In_Binary_Search_Tree_In_Given_Range {
	public static void print(Node node, int min, int max) {
		if (node == null) return;
		if ((node.value >= min) && (node.value <= max)) {
			System.out.print(node.value + " ");
			print(node.left, min, max);
			print(node.right, min, max);
		}
		else if (node.value < min) print(node.right, min, max);
		else if (node.value > max) print(node.left, min, max);
	}
}
