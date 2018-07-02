package add;

import util.Weighted_Edge;
import util.Weighted_Graph;

public class Add_Weighted_Edge {
	public static void addDirected(Weighted_Graph graph, int src, int dest, int weight) {
		int sourceLocation = -1, destinationLocation = -1;
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) sourceLocation = i;
			if (graph.adjacencyList[i].value == dest) destinationLocation = i;
		}
		graph.adjacencyList[sourceLocation].list.add(
				new Weighted_Edge(graph.adjacencyList[sourceLocation], 
						graph.adjacencyList[destinationLocation], weight));
	}
	
	public static void addUndirected(Weighted_Graph graph, int src, int dest, int weight) {
		int sourceLocation = -1, destinationLocation = -1;
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) sourceLocation = i;
			if (graph.adjacencyList[i].value == dest) destinationLocation = i;
		}
		graph.adjacencyList[sourceLocation].list.add(
				new Weighted_Edge(graph.adjacencyList[sourceLocation], 
						graph.adjacencyList[destinationLocation], weight));
		graph.adjacencyList[sourceLocation].list.add(
				new Weighted_Edge(graph.adjacencyList[destinationLocation], 
						graph.adjacencyList[sourceLocation], weight));
	}
}
