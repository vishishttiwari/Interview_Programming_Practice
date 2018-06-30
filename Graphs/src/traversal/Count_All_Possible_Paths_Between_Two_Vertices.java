package traversal;

import java.util.ArrayList;

import add.Add_Edge;
import util.Graph;
import util.Node;

public class Count_All_Possible_Paths_Between_Two_Vertices {
	public static void main(String[] args) {
		Graph graph = new Graph(new int[]{1,2,3,4,5});
		
		Add_Edge.addDirected(graph, 1, 2);
		Add_Edge.addDirected(graph, 1, 3);
		Add_Edge.addDirected(graph, 1, 5);
		Add_Edge.addDirected(graph, 2, 4);
		Add_Edge.addDirected(graph, 2, 5);
		Add_Edge.addDirected(graph, 3, 5);
		Add_Edge.addDirected(graph, 4, 3);
		
		System.out.println(find(graph, 1, 5));
	}
	
	public static ArrayList<ArrayList<Integer>> find(Graph graph, int src, int dest) {
		ArrayList<ArrayList<Integer>> paths = null;
		
		Node source = null;
		
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) {
				source = graph.adjacencyList[i];
				break;
			}
		}
		paths = path(graph, source, dest);
		
		return paths;
	}
	
	private static ArrayList<ArrayList<Integer>> path(Graph graph, Node source, int dest) {
		if (source.value == dest) {
			ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> path = new ArrayList<Integer>();
			path.add(source.value);
			paths.add(path);
			return paths;
		}
		ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < source.list.size(); i++) {
			ArrayList<ArrayList<Integer>> temp = path(graph, source.list.get(i), dest);
			if (temp.size() != 0) {
				for (int j = 0; j < temp.size(); j++) {
					temp.get(j).add(0, source.value);
					answer.add(temp.get(j));
				}
			}
		}
		return answer;
	}
	
}
