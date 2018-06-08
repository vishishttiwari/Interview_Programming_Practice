package problems;
/*
 * Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
 * 
 * Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
 * Output:  True  //There is a subset (4, 5) with sum 9.
 */

public class Subset_Sum_Problem {
	
	static boolean subsetSum(int[] arr, int n) {
		boolean[][] memo = new boolean[arr.length + 1][n + 1];
		
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0) memo[i][j] = false;
				if (j == 0) memo[i][j] = false;
				if (i != 0 && j != 0) {
					if (arr[i-1] == j) memo[i][j] = true;
					else if (arr[i-1] < j) memo[i][j] = memo[i-1][j - arr[i-1]] || memo[i-1][j];
					else if (arr[i-1] > j) memo[i][j] = memo[i-1][j];
				}
			}
		}
		return memo[arr.length][n];
	}
}