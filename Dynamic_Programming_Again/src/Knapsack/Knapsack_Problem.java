package Knapsack;

public class Knapsack_Problem {
	public static int memoization(int[] weights, int[] values, int Weight) {
		int[][] memo = new int[weights.length + 1][Weight + 1];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
				if (weights[i-1] <= j) memo[i][j] = Math.max(memo[i][j], values[i-1] + memo[i-1][j - weights[i-1]]); 
				else memo[i][j] = memo[i-1][j];
			}
		}
		return memo[weights.length][Weight];
	}
}
