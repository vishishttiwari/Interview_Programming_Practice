package problems;
/*
 * Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.

Examples

arr[] = {1, 5, 11, 5}
Output: true 
The array can be partitioned as {1, 5, 5} and {11}

arr[] = {1, 5, 3}
Output: false 
The array cannot be partitioned into equal sum sets.
 */

public class Partition_Problem {
	static String partitionProblem(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    if (sum % 2 == 1) return "NO";
	    if (subsetSum(arr, sum/2)) return "YES";
	    else return "NO";
	}
	
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
