package traversal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import util.Graph;
import util.Node;

public class Count_Nodes_At_A_Given_Level {
	public static ArrayList<Node> traversal(Graph graph, int src, int levelWanted) {
		HashSet<Node> visited = new HashSet<Node>();
		Queue<Node> q = new LinkedList<Node>();
		Queue<Integer> level = new LinkedList<Integer>();
		
		ArrayList<Node> allNodes = new ArrayList<Node>();
		
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) {
				q.add(graph.adjacencyList[i]);
				level.add(0);
				break;
			}
		}
		while(!q.isEmpty()) {
			if (visited.contains(q.peek())) {
				q.poll();
				level.poll();
				continue;
			}
			visited.add(q.peek());
			if (level.peek() == levelWanted) allNodes.add(q.peek());
			for (int i = 0; i < q.peek().list.size(); i++) {
				q.add(q.peek().list.get(i));
				level.add(level.peek() + 1);
			}
			q.poll();
			level.poll();
		}
		return allNodes;
	}
}
