package algorithms;
import java.util.HashSet;
import java.util.Stack;

import util.Graph;
import util.Node;

public class Topological_Sort {
	public static void sort(Graph graph) {
		Stack<Integer> stack = new Stack<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < graph.vertices; i++) {
			if (!set.contains(graph.adjacencyList[i].value)) {
				sortUtil(graph, graph.adjacencyList[i], stack, set);
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	private static void sortUtil(Graph graph, Node source, Stack<Integer> stack, HashSet<Integer> set) {
		set.add(source.value);
		for (int i = 0; i < source.list.size(); i++) {
			if (!set.contains(source.list.get(i).value))
				sortUtil(graph, source.list.get(i), stack, set);
		}
		stack.push(source.value);
		return;
	}
}
