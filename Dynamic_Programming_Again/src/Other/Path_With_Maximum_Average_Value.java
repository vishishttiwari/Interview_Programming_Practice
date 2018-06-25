package Other;

public class Path_With_Maximum_Average_Value {
	static double memo[][];
	public static double DPUtil(int[][]arr) {
		memo = new double[arr.length][arr[0].length];
		return DP(arr, 0, 0)/(arr.length + arr[0].length - 1);
	}
	
	public static double DP(int[][] arr, int row, int col) {
		if ((row == arr.length) || (col == arr[0].length)) return 0;
		if (memo[row][col] != 0) return memo[row][col];
		memo[row][col] = Math.max(DP(arr, row, col + 1), DP(arr, row + 1, col)) + arr[row][col];
		return memo[row][col];
	}
}
