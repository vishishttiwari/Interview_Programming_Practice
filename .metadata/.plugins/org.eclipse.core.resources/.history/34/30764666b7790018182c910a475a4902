package print;

import util.Graph;

public class Print {
	public static void print(Graph graph) {
		for(int v = 0; v < graph.adjacencyList.length; v++)
        {
            System.out.println("Adjacency list of vertex "+ graph.adjacencyList[v].value);
            System.out.print("head");
            for (int neighbour = 0; neighbour < graph.adjacencyList[v].list.size(); neighbour++)
                System.out.print(" -> " + graph.adjacencyList[v].list.get(neighbour).value);
            System.out.println("\n");
        }
	}
}
