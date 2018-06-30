package search;

import java.util.HashSet;

import util.Graph;
import util.Node;

public class Depth_First_Search {
	public static Node traversal(Graph graph, int value) {
		HashSet<Node> visited = new HashSet<Node>();
		return traversalUtil(graph, visited, graph.adjacencyList[0], value);
	}
	
	private static Node traversalUtil(Graph graph, HashSet<Node> visited, Node src, int value) {
		visited.add(src);
		
		if (value == src.value) return src;
		
		for (int i = 0; i < src.list.size(); i++)
			if (!visited.contains(src.list.get(i))) traversalUtil(graph, visited, src.list.get(i), value);
		
		return null;
	}
}
