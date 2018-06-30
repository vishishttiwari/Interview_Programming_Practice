package traversal;

import java.util.*;

import util.Graph;
import util.Node;

public class Breadth_First_Traversal {
	public static void traversal(Graph graph, int src) {
		HashSet<Node> visited = new HashSet<Node>();
		Queue<Node> q = new LinkedList<Node>();
		
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) {
				q.add(graph.adjacencyList[i]);
				break;
			}
		}
		while(!q.isEmpty()) {
			if (visited.contains(q.peek())) {
				q.poll();
				continue;
			}
			visited.add(q.peek());
			System.out.print(q.peek().value + " -> ");
			for (int i = 0; i < q.peek().list.size(); i++)
				q.add(q.peek().list.get(i));
			q.poll();
		}
		System.out.println("Done");
	}
}
