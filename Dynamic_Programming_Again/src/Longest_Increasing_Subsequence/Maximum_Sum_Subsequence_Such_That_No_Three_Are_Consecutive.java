package Longest_Increasing_Subsequence;

public class Maximum_Sum_Subsequence_Such_That_No_Three_Are_Consecutive {
	public static int memoization(int[] arr) {
		int[] memo = arr.clone();
		boolean[] memoTwice = new boolean[arr.length];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++)
				if (arr[i] >= arr[j]) {
					if ((memo[j] + arr[i] > memo[i]) && !memoTwice[j] && j + 1 == i) {
						memo[i] = memo[j] + arr[i];
						if (j + 1 == i) memoTwice[i] = true;
					}
				}
			max = Math.max(max, memo[i]);
		}
		for (int i = 0; i < arr.length; i++) System.out.print(memo[i] + "\t");
		System.out.println();
		for (int i = 0; i < arr.length; i++) System.out.print(memoTwice[i] + "\t");
		System.out.println();
		return max;
	}
}