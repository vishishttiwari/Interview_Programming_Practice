package problems;

/*
 * Let us discuss Longest Increasing Subsequence (LIS) problem as an example
 *  problem that can be solved using Dynamic Programming. 
 *  The Longest Increasing Subsequence (LIS) problem is to find the 
 *  length of the longest subsequence of a given sequence such that all elements
 *  of the subsequence are sorted in increasing order. For example, the 
 *  length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 */

public class Longest_Increasing_Subsequence_Problem {
	static int  LISDP(int[] arr) {
	    int[] memoDP = new int[arr.length];
	    int maximum = Integer.MIN_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	        memoDP[i] = 1;
	    }
	    for (int i = 1; i < arr.length; i++) {
	        for (int j = 0; j < i; j++) {
	            if (arr[i] > arr[j]) {
	                memoDP[i] = Math.max(memoDP[i], memoDP[j] + 1);
	                maximum = Math.max(memoDP[i], maximum);
	            }
	        }
	    }
	    return maximum;
	}
}
