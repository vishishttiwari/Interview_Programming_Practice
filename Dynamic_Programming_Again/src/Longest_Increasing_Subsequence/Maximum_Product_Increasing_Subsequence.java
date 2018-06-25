package Longest_Increasing_Subsequence;

public class Maximum_Product_Increasing_Subsequence {
	public static int memoization(int[] arr) {
		int[] memo = arr.clone();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++)
				if (arr[i] >= arr[j]) memo[i] = Math.max(memo[i], memo[j] * arr[i]);
			max = Math.max(max, memo[i]);
		}
		return max;
	}
}
