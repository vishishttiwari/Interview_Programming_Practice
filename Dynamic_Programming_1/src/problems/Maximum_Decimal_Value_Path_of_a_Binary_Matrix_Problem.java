package problems;
/*
 * Maximum decimal value path in a binary matrix
Given binary square matrix [n*n]. Find maximum integer value in a path from top left to bottom right. We compute integer value using bits of traversed path. We start at index [0,0] and end at index [n-1][n-1]. from index [i, j], we can move [i, j+1] or [i+1, j].

Examples:

Input : mat[][] = {{1, 1, 0, 1},
                   {0, 1, 1, 0},
                   {1, 0, 0, 1},
                   {1, 0, 1, 1}}
Output : 111
Explanation : 
Path :   (0,0) -> (0,1) -> (1,1) -> (1,2) ->
         (2,2) -> (3,2) ->(4,4)  
Decimal value : 1*(2^0) + 1*(2^1) + 1*(2^2) + 1*(2^3) + 
                0*(2^4) + 1*(2^5) + 1*(2^6) = 111
 */
public class Maximum_Decimal_Value_Path_of_a_Binary_Matrix_Problem {	
	static int answerDP(int[][] arr) {
		int[][][] memo = new int[arr.length][arr[0].length][2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				memo[i][j][0] = i + j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0 && j == 0) memo[i][j][1] = arr[i][j] * (int)Math.pow(2, memo[i][j][0]);
				else if (i == 0 && j != 0) memo[i][j][1] = arr[i][j] * (int)Math.pow(2, memo[i][j][0]) + memo[i][j - 1][1];
				else if (i != 0 && j == 0) memo[i][j][1] = arr[i][j] * (int)Math.pow(2, memo[i][j][0]) + memo[i - 1][j][1];
				else if (i != 0 && j != 0) memo[i][j][1] = arr[i][j] * (int)Math.pow(2, memo[i][j][0]) + Math.max(memo[i - 1][j][1], memo[i][j - 1][1]);
			}
		}
		return memo[arr.length - 1][arr[0].length - 1][1];
	}
}
