package traversal;

import java.util.HashSet;
import java.util.Stack;

import util.Graph;
import util.Node;

public class Depth_First_Traversal_Iterative {
	public static void traversal(Graph graph, int src) {
		HashSet<Integer> set = new HashSet<Integer>();
		Stack<Node> stack = new Stack<Node>();
		
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) {
				stack.add(graph.adjacencyList[i]);
				break;
			}
		}
		
		while (!stack.isEmpty()) {
			if (set.contains(stack.peek().value)) {
				stack.pop();
				continue;
			}
			Node temp = stack.pop();
			set.add(temp.value);
			System.out.print(temp.value + " -> ");
			for (int i = 0; i < temp.list.size(); i++)
				stack.add(temp.list.get(i));
		}
		System.out.println("Done");
	}
}
