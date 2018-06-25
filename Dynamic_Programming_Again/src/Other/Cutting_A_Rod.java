package Other;

public class Cutting_A_Rod {
	public static int memoization(int[] prices) {
		int[][] memo = new int[prices.length + 1][prices.length + 1];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
				if (j < i) memo[i][j] = memo[i-1][j];
				else memo[i][j] = Math.max(prices[i - 1] + memo[i][j - i], memo[i-1][j]);
			}
		}
		return memo[prices.length][prices.length];
	}
}
