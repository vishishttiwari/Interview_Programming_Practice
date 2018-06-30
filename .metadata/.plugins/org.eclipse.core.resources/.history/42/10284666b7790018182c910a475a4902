package traversal;

import java.util.*;

import util.Graph;
import util.Node;

public class Depth_First_Traversal {
	public static void traversal(Graph graph, int src) {
		HashSet<Node> visited = new HashSet<Node>();
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) {
				traversalUtil(graph, visited, graph.adjacencyList[i]);
				break;
			}
		}
		System.out.println("Done");
	}
	
	private static void traversalUtil(Graph graph, HashSet<Node> visited, Node src) {
		visited.add(src);
		
		System.out.print(src.value + " -> ");
		
		for (int i = 0; i < src.list.size(); i++)
			if (!visited.contains(src.list.get(i))) traversalUtil(graph, visited, src.list.get(i));
	}
}
