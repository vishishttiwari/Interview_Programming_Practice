package search;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import util.Graph;
import util.Node;

public class Level_Of_Each_Node_In_A_Tree_From_Source_Node {
	public static void search(Graph graph, int src) {
		Queue<Node> Nodes = new LinkedList<Node>();
		Queue<Integer> Level = new LinkedList<Integer>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < graph.adjacencyList.length; i++) {
			if (graph.adjacencyList[i].value == src) {
				Nodes.add(graph.adjacencyList[i]);
				Level.add(0);
				break;
			}
		}

		while (!Nodes.isEmpty()) {
			Node temp = Nodes.poll();
			Integer tempLevel = Level.poll();
			if (set.contains(temp.value)) continue;
			set.add(temp.value);
			System.out.println(temp.value + " " + tempLevel);
			for (int i = 0; i < temp.list.size(); i++) {
				Nodes.add(temp.list.get(i));
				Level.add(tempLevel + 1);
			}
		}
	}
}
