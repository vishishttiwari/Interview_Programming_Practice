package problems;
/*Given a maze with obstacles, count number of paths to reach rightmost-bottommost cell from topmost-leftmost cell. A cell in given maze has value -1 if it is a blockage or dead end, else 0.

From a given cell, we are allowed to move to cells (i+1, j) and (i, j+1) only.

Examples:

Input: maze[R][C] =  {{0,  0, 0, 0},
                      {0, -1, 0, 0},
                      {-1, 0, 0, 0},
                      {0,  0, 0, 0}};
Output: 4
*/
public class Number_of_Ways_to_Reach_Destination_in_a_Maze_Problem {
	static int initialization(int rows, int cols, int[][] blocked) {
	    int[][] matrix = new int[rows][cols];
	    for (int i = 0; i < blocked.length; i++) {
	        matrix[blocked[i][0]-1][blocked[i][1]-1] = -1;
	    }
	    return waysMatrix(matrix);
	}
	
	static int waysMatrix(int[][] matrix) {
	    int[][] memo = new int[matrix.length][matrix[0].length];
	    memo[0][0] = 1;
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[0].length; j++) {
	            if (matrix[i][j] == -1) memo[i][j] = 0;
	            else {
    	            if (i == 0 && j == 0) memo[i][j] = 1;
    	            else if (i == 0) memo[i][j] = memo[i][j-1];
    	            else if (j == 0) memo[i][j] = memo[i-1][j];
    	            else memo[i][j] = memo[i-1][j] + memo[i][j-1];
	            }
	        }
	    }
	    return memo[matrix.length-1][matrix[0].length-1];   
	}
}
