package Longest_Increasing_Subsequence;

import java.util.Arrays;

public class Maximum_Length_Sequence_With_Difference_Between_Adjacent_Elements_Is_0_Or_1 {
	public static int memoization(int[] arr) {
		int[] memo = new int[arr.length];
		Arrays.fill(memo, 1);
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((Math.abs(arr[j] - arr[i]) == 1) || (arr[j] == arr[i]))
					memo[i] = Math.max(memo[i], memo[j] + 1);
			}
			max = Math.max(max, memo[i]);
		}
		return max;
	}
}
