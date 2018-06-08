package problems;
/* 
The task is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you
 can either move only to right or down.

Input: 
First line consists of T test cases. First line of every test case consists of N and M, denoting the number of rows and number of column respectively.

Output: 
Single line output i.e count of all the possible paths from top left to bottom right of a mXn matrix. Since output can be very large number use %10^9+7.

Example:
Input:
1
3 3
Output:
6
 */

public class All_Paths_From_TopLeft_To_BottomRight_Problem {
	static long waysRecursion(int row, int col) {
	    if (row <= 1 && col <= 1) return 1;
	    else if (row == 1) return waysRecursion(row, col - 1);
	    else if (col == 1) return waysRecursion(row - 1, col);
	    else return waysRecursion(row - 1, col) + waysRecursion(row, col - 1);
	}
	
	static long[][] memo;
	static long waysMemoization(int row, int col) {
	    if (memo[row][col] != 0) return memo[row][col];
	    else if (row == 0) memo[row][col] = waysMemoization(row, col - 1);
	    else if (col == 0) memo[row][col] = waysMemoization(row - 1, col);
	    else memo[row][col] = waysMemoization(row - 1, col) + waysMemoization(row, col - 1);
	    return memo[row][col];
	}
	
	static long waysDP(int row, int col) {
	    long[][] memoDP = new long[row][col];
	    
	    memoDP[0][0] = 1;
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            if (i == 0 && j != 0) memoDP[i][j] = memoDP[i][j-1];
	            else if (i != 0 && j == 0) memoDP[i][j] = memoDP[i-1][j];
	            else if (i != 0 && j != 0) memoDP[i][j] = memoDP[i-1][j] + memoDP[i][j-1];
	        }
	    }
	    return memoDP[row - 1][col - 1];
	}
}
