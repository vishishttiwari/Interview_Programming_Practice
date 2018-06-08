package problems;
/*
LCS Problem Statement: Given two sequences, 
find the length of longest subsequence present in both of them. 
A subsequence is a sequence that appears in the same relative order, 
but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are 
subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.

It is a classic computer science problem, 
the basis of diff (a file comparison program that outputs the differences between two files), 
and has applications in bioinformatics.

Examples:
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
*/

public class Longest_Common_Subsequence_Prolem {

	static int LCSRecursion(char[] first, char[] second, int firstIndex, int secondIndex) {
	    if (firstIndex == 0 || secondIndex == 0) {
	        return 0;
	    }
	    if (first[firstIndex - 1] == second[secondIndex - 1]) {
	        return 1 + LCSRecursion(first, second, firstIndex - 1, secondIndex - 1);
	    }
	    else {
	        return Math.max(LCSRecursion(first, second, firstIndex - 1, secondIndex), LCSRecursion(first, second, firstIndex, secondIndex - 1));
	    }
	}
	
	static int memo[][];
	static int LCSMemoization(char[] first, char[] second, int firstIndex, int secondIndex) {
	    if (memo[firstIndex - 1][secondIndex - 1] != 0) return memo[firstIndex - 1][secondIndex - 1];
	    if (firstIndex == 0 || secondIndex == 0) {
	        return 0;
	    }
	    if (first[firstIndex - 1] == second[secondIndex - 1]) {
	        memo[firstIndex - 1][secondIndex - 1] = 1 + LCSMemoization(first, second, firstIndex - 1, secondIndex - 1);
	    }
	    else {
	        memo[firstIndex - 1][secondIndex - 1] = Math.max(LCSMemoization(first, second, firstIndex - 1, secondIndex), LCSMemoization(first, second, firstIndex, secondIndex - 1));
	    }
	    return memo[firstIndex - 1][secondIndex - 1];
	}
	
	static int LCSDP(char[] first, char[] second, int firstIndex, int secondIndex) {
	    int[][] memoDP = new int[firstIndex][secondIndex];
	    
	    for (int i = 0; i < firstIndex; i++) {
	        for (int j = 0; j < secondIndex; j++) {
	            if (i == 0 || j == 0)
	                memoDP[i][j] = 0;
	            else if (first[i-1] == second[j-1])
	                memoDP[i][j] = memoDP[i-1][j-1] + 1;
	            else
	                memoDP[i][j] = Math.max(memoDP[i-1][j], memoDP[i][j-1]);
	          }
	    }
	    return memoDP[firstIndex][secondIndex];
	}
}