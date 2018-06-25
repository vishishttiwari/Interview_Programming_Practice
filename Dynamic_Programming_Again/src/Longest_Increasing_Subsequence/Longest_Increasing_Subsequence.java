package Longest_Increasing_Subsequence;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
	public static int memoization(int[] arr) {
		int[] memo = new int[arr.length];
		Arrays.fill(memo, 1);
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] >= arr[j]) memo[i] = Math.max(memo[i], memo[j] + 1);
				max = Math.max(max, memo[i]);
			}
		}
		return max;
	}
}
