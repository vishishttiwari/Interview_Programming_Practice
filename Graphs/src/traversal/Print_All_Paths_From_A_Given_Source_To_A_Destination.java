package traversal;

import java.util.ArrayList;
import java.util.HashSet;

import util.Graph;
import util.Node;

class repeated {
	static HashSet<Integer> repeat = new HashSet<Integer>();
}

public class Print_All_Paths_From_A_Given_Source_To_A_Destination {
	public static ArrayList<ArrayList<Integer>> print(Graph graph, int src, int dest) {
		if (repeated.repeat.contains(src))
			return null;
		repeated.repeat.add(src);
		
		if (src == dest) {
			ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			
			arr2.add(src);
			
			arr1.add(arr2);
			
			return arr1;
		}
		Node temp = null;
		ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < graph.vertices; i++) {
			if (graph.adjacencyList[i].value == src)
				temp = graph.adjacencyList[i];
		}
		for (int i = 0; i < temp.list.size(); i++) {
			ArrayList<ArrayList<Integer>> temp1 = print(graph, temp.list.get(i).value, dest);
			for (int j = 0; j < temp1.size(); j++) {
				temp1.get(j).add(src);
			}
		}
		return answer;
	}
}
