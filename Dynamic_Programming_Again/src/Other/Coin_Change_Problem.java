package Other;

public class Coin_Change_Problem {
	public static int recursion(int[] coins, int value, int coin) {
		if (value == 0) return 1;
		else if (value < 0) return 0;
		int ways = 0;
		for (int i = coin; i < coins.length; i++) 
			ways += recursion(coins, value - coins[i], i);
		return ways;
	}
	
	static int[] memo;
	public static int DP(int[] coins, int value, int coin) {
		if (value == 0) return 1;
		else if (value < 0) return 0;
		if (memo[value] != 0) return memo[value];
		int ways = 0;
		for (int i = coin; i < coins.length; i++) 
			ways += recursion(coins, value - coins[i], i);
		memo[value] = ways;
		return ways;
	}
	
	public static int memoization(int[] coins, int N) {
		int[][] memo = new int[coins.length + 1][N + 1];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				if (j == 0) memo[i][j] = 1;
				else {
					if (coins[i - 1] <= j)
						memo[i][j] = memo[i-1][j] + memo[i][j - coins[i - 1]];
					else
						memo[i][j] = memo[i-1][j];
				}
			}
		}
		return memo[coins.length][N];
	}
}
