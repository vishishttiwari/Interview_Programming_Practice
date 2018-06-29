package Longest_Increasing_Subsequence;

import java.util.Arrays;

public class Maximum_Length_Chain_Of_Pairs {
	public static int memoization(int[][] arr) {
		int[] memo = new int[arr.length];
		Arrays.fill(memo, 1);
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j][1] < arr[i][0]) memo[i] = Math.max(memo[i], memo[j] + 1);
			}
			max = Math.max(max, memo[i]);
		}
		return max;
	}
}