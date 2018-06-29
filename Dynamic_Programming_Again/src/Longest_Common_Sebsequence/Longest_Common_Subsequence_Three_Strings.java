package Longest_Common_Sebsequence;

public class Longest_Common_Subsequence_Three_Strings {
	public static int memoization(String str1, String str2, String str3) {
		int[][][] memo = new int[str1.length()+1][str2.length()+1][str3.length()+1];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
				for (int k = 1; k < memo[i][j].length; k++) {
					if ((str1.charAt(i - 1) == str2.charAt(j - 1)) && 
					(str2.charAt(j - 1) == str3.charAt(k - 1)))
		                memo[i][j][k] = memo[i-1][j-1][k-1] + 1;
		            else
		                memo[i][j][k] = Math.max(Math.max(memo[i-1][j][k], memo[i][j-1][k]), memo[i][j][k-1]);
				}
			}
		}
		return memo[str1.length()][str2.length()][str3.length()];
	}
}