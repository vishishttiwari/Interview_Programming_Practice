package add;

import util.Graph;

public class Add_Edge {
	public static void addUndirected(Graph graph, int src, int dest) {
		int sourceLocation = -1, destinationLocation = -1;
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) sourceLocation = i;
			if (graph.adjacencyList[i].value == dest) destinationLocation = i;
		}
		graph.adjacencyList[sourceLocation].list.add(graph.adjacencyList[destinationLocation]);
		graph.adjacencyList[destinationLocation].list.add(graph.adjacencyList[sourceLocation]);
	}
	
	public static void addDirected(Graph graph, int src, int dest) {
		int sourceLocation = -1, destinationLocation = -1;
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) sourceLocation = i;
			if (graph.adjacencyList[i].value == dest) destinationLocation = i;
		}
		graph.adjacencyList[sourceLocation].list.add(graph.adjacencyList[destinationLocation]);
	}
}
