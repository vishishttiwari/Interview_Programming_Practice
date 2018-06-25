package Other;

public class Maximum_Games_Played_By_Winner {
	public static int recurssion(int N) {
		if (N == 1) return 0;
		if (N == 2) return 1;
		if (N % 2 == 1) return 1 + recurssion(N - 1);
		else return 1 + recurssion(N - 2);
	}
	
	static int[] memo;
	public static int DPUtil(int N) {
		memo  = new int[N + 1];
		return DP(N);
	}
	
	public static int DP(int N) {
		if (N == 1) return 0;
		if (N == 2) return 1;
		if (memo[N] != 0) return memo[N];
		if (N % 2 == 1) memo[N] =  1 + recurssion(N - 1);
		else memo[N] =  1 + recurssion(N - 2);
		return memo[N];
	}
}
