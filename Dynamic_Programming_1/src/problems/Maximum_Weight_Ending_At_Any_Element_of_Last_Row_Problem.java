package problems;
/*
Given a matrix of integers where every element represents weight of the cell. 
Find the path having the maximum weight in matrix [N X N]. Path Traversal Rules are:

It should begin from top left element.
The path can end at any element of last row.
We can move to following two cells from a cell (i, j).
Down Move : (i+1, j)
Diagonal Move : (i+1, j+1)
Examples:

Input : N = 5
        mat[5][5] = {{ 4, 2 ,3 ,4 ,1 },
                     { 2 , 9 ,1 ,10 ,5 },
                     {15, 1 ,3 , 0 ,20 },
                     {16 ,92, 41, 44 ,1},
                     {8, 142, 6, 4, 8} };
Output : 255
Path with max weight : 4 + 2 +15 + 92 + 142 = 255             
*/

public class Maximum_Weight_Ending_At_Any_Element_of_Last_Row_Problem {
	static void initialization(int[][] arr) {
	    memo = new long[arr.length][arr.length];
		for (int j = 0; j < arr.length; j++) memo[0][j] = arr[0][j];
		for (int i = 1; i < arr.length; i++) memo[i][0] = arr[i][0] + memo[i-1][0];
	}
	
	static long[][] memo;
	static long maximumWightMemoization(int[][] arr) {
	    long maximum = Integer.MIN_VALUE;
	    for (int i = 1; i < arr.length; i++) {
	        for (int j = 1; j < arr.length; j++) {
	            memo[i][j] = arr[i][j] + Math.max(memo[i-1][j-1],memo[i-1][j]);
	            if (i == arr.length - 1) maximum = Math.max(maximum, memo[i][j]);
	        }
	    }
	    return maximum;
	}
}
