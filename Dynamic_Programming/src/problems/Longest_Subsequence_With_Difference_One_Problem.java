package problems;
/*
Given an array of n size, the task is to find the longest subsequence such that difference between adjacents is one.

Examples:

Input :  arr[] = {10, 9, 4, 5, 4, 8, 6}
Output :  3
As longest subsequences with difference 1 are, "10, 9, 8", 
"4, 5, 4" and "4, 5, 6"

Input :  arr[] = {1, 2, 3, 2, 3, 7, 2, 1}
Output :  7
As longest consecutive sequence is "1, 2, 3, 2, 3, 2, 1"
 */

public final class Longest_Subsequence_With_Difference_One_Problem {
	static int oneDP(int[] arr) {
	    int[] memo = new int[arr.length];
	    int maximum = 1;
	    for (int i = 0; i < arr.length; i++) memo[i] = 1;
	    for (int i = 1; i < arr.length; i++) {
	        for (int j = 0; j < i; j++) {
	            if (Math.abs(arr[j] - arr[i]) == 1) {
	                memo[i] = Math.max(1 + memo[j],  memo[i]);
	                maximum = Math.max(memo[i], maximum);
	            }
	        }
	    }
	    return maximum;
	}
}
