package traversal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import util.Node;

public class Reverse_Levelorder_Print {
	public static void levelorder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();
		queue.add(root);
		stack.push(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if (node.left != null) {
				queue.add(node.left);
				stack.push(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
				stack.push(node.right);
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().value + " ");
		}
	}
}
