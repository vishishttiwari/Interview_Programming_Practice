package problems;
/*
 * Given a cost matrix cost[][] and a position (m, n) in cost[][], 
 * write a function that returns cost of minimum cost path to reach (m, n) 
 * from (0, 0). Each cell of the matrix represents a cost to traverse through that cell. 
 * Total cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination). 
 * You can only traverse down, right and diagonally lower cells from a given cell, i.e., 
 * from a given cell (i, j), cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. 
 * You may assume that all costs are positive integers.
 */

public class Min_Cost_Path_Problem {
	static int minCostRecursion(int[][] arr, int row, int col) {
	    if (row == 0 && col == 0) return arr[row][col];
	    else if (row > 0 && col == 0)
	        return arr[row][col] + minCostRecursion(arr, row - 1, col);
	    else if (row == 0 && col > 0)
	        return arr[row][col] + minCostRecursion(arr, row, col - 1);
	    else
	        return arr[row][col] + Math.min(Math.min(minCostRecursion(arr, row - 1, col), minCostRecursion(arr, row, col - 1)), minCostRecursion(arr, row - 1, col - 1));
	}
	
	static int[][] memo;
	static int minCostMemoization(int[][] arr, int row , int col) {
	    if (memo[row][col] != 0) return memo[row][col];

	    if (row > 0 && col == 0)
	        memo[row][col] = arr[row][col] + minCostMemoization(arr, row - 1, col);
	    else if (row == 0 && col > 0)
	        memo[row][col] = arr[row][col] + minCostMemoization(arr, row, col - 1);
	    else
	        memo[row][col] = arr[row][col] + Math.min(Math.min(minCostMemoization(arr, row - 1, col), minCostMemoization(arr, row, col - 1)), minCostMemoization(arr, row - 1, col - 1));
	    return memo[row][col];
	}
	
	static int minCostDP(int[][] arr, int x, int y) {
	    int[][] memoDP = new int[arr.length][arr.length];
	    memoDP[0][0] = arr[0][0];
	    for (int row = 0; row < arr.length; row++) {
	        for (int col = 0; col < arr.length; col++) {
	            if (row == 0 && col == 0) memoDP[row][col] = arr[row][col];
	            else if (row > 0 && col == 0) memoDP[row][col] = arr[row][col] + memoDP[row - 1][col];
	            else if (row == 0 && col > 0) memoDP[row][col] = arr[row][col] + memoDP[row][col -1];
	            else memoDP[row][col] =  arr[row][col] + Math.min(Math.min(memoDP[row-1][col],memoDP[row][col-1]),memoDP[row-1][col-1]);
	        }
	    }
	    return memoDP[x][y];
	}
}
