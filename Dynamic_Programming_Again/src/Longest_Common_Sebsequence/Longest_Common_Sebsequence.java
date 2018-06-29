package Longest_Common_Sebsequence;

public class Longest_Common_Sebsequence {
	public static int memoization(String str1, String str2) {
		int[][] memo = new int[str1.length() + 1][str2.length() + 1];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
	                memo[i][j] = memo[i-1][j-1] + 1;
	            else
	                memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
			}
		}
		return memo[str1.length()][str2.length()];
	}
	
	public static int recursion(String str1, String str2) {
		if ((str1.length() == 0) || (str2.length() == 0)) return 0;
		if (str1.charAt(0) == str2.charAt(0))
			return 1 + recursion(str1.substring(1), str2.substring(1));
		else
			return Math.max(recursion(str1.substring(1), str2), recursion(str1, str2.substring(1)));
	}
}