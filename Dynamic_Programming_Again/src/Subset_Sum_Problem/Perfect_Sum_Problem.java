package Subset_Sum_Problem;

/* This is incomplete */

import java.util.ArrayList;

public class Perfect_Sum_Problem {
	public static void main(String[] args) {
		memo(new int[]{2, 3, 5, 6, 8, 10}, 10);
	}
	
	public static ArrayList<ArrayList<Integer>> memo(int[] arr, int N) {
		boolean[][] memo = new boolean[arr.length + 1][N + 1];
		memo[0][0] = true;
		for (int i = 1; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				if (j == 0) memo[i][j] = true;
				else if (arr[i - 1] <= j) {
					memo[i][j] = memo[i-1][j - arr[i - 1]];
				}
			}
		}
		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				System.out.print(memo[i][j] + "\t");
			}
			System.out.println();
		}
		return null;
	}
}
