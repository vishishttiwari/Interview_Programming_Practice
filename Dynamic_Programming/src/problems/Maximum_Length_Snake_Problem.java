package problems;
/*
Given a grid of numbers, find maximum length Snake sequence and print it. If multiple snake sequences exists with the maximum length, print any one of them.

A snake sequence is made up of adjacent numbers in the grid such that for each number, 
the number on the right or the number below it is +1 or -1 its value. 
For example, if you are at location (x, y) in the grid, you can either move right i.e. (x, y+1) if 
that number is ± 1 or move down i.e. (x+1, y) if that number is ± 1.

For example,

9, 6, 5, 2
8, 7, 6, 5
7, 3, 1, 6
1, 1, 1, 7

In above grid, the longest snake sequence is: (9, 8, 7, 6, 5, 6, 7)
 */

public class Maximum_Length_Snake_Problem {
	
	static long snakeDP(int[][] arr) {
		int[][] memoDP = new int[arr.length][arr[1].length];
		int maximum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				memoDP[i][j] = 1;
			}
		}
		
		boolean a = false, b = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (i == 0 && j != 0) {
					if (Math.abs((arr[i][j-1] - arr[i][j])) == 1) memoDP[i][j] = 1 + memoDP[i][j-1];
				}
				if (i != 0 && j == 0) {
					if (Math.abs((arr[i-1][j] - arr[i][j])) == 1) memoDP[i][j] = 1 + memoDP[i-1][j];
				}
				if (i != 0 && j != 0) {
					a = false;
					b = false;
					if (Math.abs((arr[i-1][j] - arr[i][j])) == 1) a= true;
					if (Math.abs((arr[i][j-1] - arr[i][j])) == 1) b= true;
					if (a && b) memoDP[i][j] = 1 + Math.max(memoDP[i-1][j], memoDP[i][j-1]);
					else if (a && !b) memoDP[i][j] = 1 + memoDP[i-1][j];
					else if (!a && b) memoDP[i][j] = 1 + memoDP[i][j-1];
				}
				maximum = Math.max(maximum, memoDP[i][j]);
			}
		}
		return maximum;
	}
}
