package calculate;

import util.Node;

public class Count_Number_Of_Nodes_In_Binary_Search_Tree_That_Lie_In_A_Range {	
	static int count;
	public static int count(Node node, int min, int max) {
		count = 0;
		countNodes(node, min, max);
		return count;
	}
	
	public static void countNodes(Node node, int min, int max) {
		if (node == null) return;
		if ((node.value >= min) && (node.value <= max)) {
			count++;
			countNodes(node.left, min, max);
			countNodes(node.right, min, max);
		}
		else if (node.value < min) countNodes(node.right, min, max);
		else if (node.value > max) countNodes(node.left, min, max);
	}
	
}
