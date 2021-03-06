package Longest_Increasing_Subsequence;

public class Maximum_Sum_Bitonic_Subsequence {
	public static int memoization(int[] arr) {
		int[] memoInc = arr.clone();
		int[] memoDec = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++)
				if (arr[i] >= arr[j]) memoInc[i] = Math.max(memoInc[i], memoInc[j] + arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1; j > i; j--)
				if (arr[i] >= arr[j]) memoDec[i] = Math.max(memoDec[i], memoDec[j] + arr[i]);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) max = Math.max(max, memoInc[i] + memoDec[i] - arr[i]);
		return max;
	}
}
