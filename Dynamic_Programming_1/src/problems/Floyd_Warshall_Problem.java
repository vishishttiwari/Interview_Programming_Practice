package problems;
/*Dynamic Programming | Set 16 (Floyd Warshall Algorithm)
The Floyd Warshall Algorithm is for solving the All Pairs Shortest Path problem. 
The problem is to find shortest distances between every pair of vertices in a given edge weighted directed Graph.

Example:

Input:
       graph[][] = { {0,   5,  INF, 10},
                    {INF,  0,  3,  INF},
                    {INF, INF, 0,   1},
                    {INF, INF, INF, 0} }
which represents the following graph
             10
       (0)------->(3)
        |         /|\
      5 |          |
        |          | 1
       \|/         |
       (1)------->(2)
            3       
Note that the value of graph[i][j] is 0 if i is equal to j 
And graph[i][j] is INF (infinite) if there is no edge from vertex i to j.

Output:
Shortest distance matrix
      0      5      8      9
    INF      0      3      4
    INF    INF      0      1
    INF    INF    INF      0 
*/

public class Floyd_Warshall_Problem {
	static int[][] floydWarshallWithoutComments(int[][] arr) {
	    int length = arr.length;
	    int[][] memo = new int[length][length];
	    for (int i = 0; i < length; i++) {
	        for (int j = 0; j < length; j++) {
	            memo[i][j] = arr[i][j];
	        }
	    }
	    for (int i = 0; i < length; i++) {
	        for (int j = 0; j < length; j++) {
	            for (int k = 0; k < length; k++) {
	                if (memo[i][k] + memo[k][j] < memo[i][j]) memo[i][j] = memo[i][k] + memo[k][j];
	            }
	        }
	    }
	    return memo;
	}
	
	static int[][] floydWarshallWithComments(int[][] arr) {
	    int length = arr.length;
	    int[][] memo = new int[length][length];
	    
	    /* Initialize the solution matrix same as input graph matrix.
        Or we can say the initial values of shortest distances
        are based on shortest paths considering no intermediate
        vertex. */
	    for (int i = 0; i < length; i++) {
	        for (int j = 0; j < length; j++) {
	            memo[i][j] = arr[i][j];
	        }
	    }
	    
	    /* Add all vertices one by one to the set of intermediate
        vertices.
       ---> Before start of a iteration, we have shortest
            distances between all pairs of vertices such that
            the shortest distances consider only the vertices in
            set {0, 1, 2, .. k-1} as intermediate vertices.
       ----> After the end of a iteration, vertex no. k is added
             to the set of intermediate vertices and the set
             becomes {0, 1, 2, .. k} */
	    for (int i = 0; i < length; i++) {
	    	
	    	// Pick all vertices as source one by one
	        for (int j = 0; j < length; j++) {
	        	
	        	// Pick all vertices as destination for the
                // above picked source
	            for (int k = 0; k < length; k++) {
	            	
	            	// If vertex k is on the shortest path from
                    // i to j, then update the value of dist[i][j]
	                if (memo[i][k] + memo[k][j] < memo[i][j]) memo[i][j] = memo[i][k] + memo[k][j];
	            }
	        }
	    }
	    // Return the shortest distance matrix
	    return memo;
	}
}
