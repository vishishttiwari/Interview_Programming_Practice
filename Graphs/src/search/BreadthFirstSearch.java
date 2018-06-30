package search;

import java.util.*;

import util.Graph;
import util.Node;

public class BreadthFirstSearch {
	public static Node search(Graph graph, int value) {
		HashSet<Node> visited = new HashSet<Node>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(graph.adjacencyList[0]);
		while (!q.isEmpty()) {
			Node temp = q.poll();
			if (value == temp.value) return temp;
			visited.add(temp);
			System.out.println(temp.value);
			for (int i = 0; i < temp.list.size(); i++) {
				if (!visited.contains(temp.list.get(i)))
					q.add(temp.list.get(i));
			}
		}
		return null;
	}
}
