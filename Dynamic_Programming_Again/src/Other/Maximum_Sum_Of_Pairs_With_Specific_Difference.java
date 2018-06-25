package Other;

import java.util.Arrays;

public class Maximum_Sum_Of_Pairs_With_Specific_Difference {
	public static int memoization(int[] arr, int K) {
		Arrays.sort(arr);
		
		int answer = 0;
		
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] - arr[i-1] < K) {
				answer += arr[i-1];
				answer += arr[i--];
			}
		}
		return answer;
	}
}