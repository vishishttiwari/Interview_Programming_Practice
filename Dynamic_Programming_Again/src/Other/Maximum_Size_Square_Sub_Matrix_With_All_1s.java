package Other;

import java.util.Arrays;

public class Maximum_Size_Square_Sub_Matrix_With_All_1s {
	public static int memoization(int[][] arr) {
		int[][] memo = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) Arrays.fill(memo[i], 1);
		
		int max = 0;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if ((arr[i-1][j] == arr[i][j-1]) && (arr[i-1][j] == arr[i-1][j-1]))
					memo[i][j] = memo[i-1][j] + 1;
				max = Math.max(max, memo[i][j]);
			}
		}
		return max;
	}
}