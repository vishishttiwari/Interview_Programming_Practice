package matrix;

import util.Graph;

public class Create_Adjacency_Matrix {
	public static boolean[][] convert(Graph graph) {
		boolean[][] matrix = new boolean[graph.vertices][graph.vertices];
		for (int i = 0; i < graph.vertices; i++) {
			for (int j = 0; j < graph.adjacencyList[i].list.size(); j++)
				matrix[graph.adjacencyList[i].value][graph.adjacencyList[i].list.get(j).value] = true;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		return matrix;
	}
}
