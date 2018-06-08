package problems;
/*Dynamic Programming | Set 15 (Longest Bitonic Subsequence)
Given an array arr[0 … n-1] containing n positive integers, a subsequence of arr[] is 
called Bitonic if it is first increasing, then decreasing. Write a function that takes 
an array as argument and returns the length of the longest bitonic subsequence.

A sequence, sorted in increasing order is considered Bitonic with the decreasing part as empty. 
Similarly, decreasing order sequence is considered Bitonic with the increasing part as empty.

Examples:

Input arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
Output: 6 (A Longest Bitonic Subsequence of length 6 is 1, 2, 10, 4, 2, 1)

Input arr[] = {12, 11, 40, 5, 3, 1}
Output: 5 (A Longest Bitonic Subsequence of length 5 is 12, 11, 5, 3, 1)

Input arr[] = {80, 60, 30, 40, 20, 10}
Output: 5 (A Longest Bitonic Subsequence of length 5 is 80, 60, 30, 20, 10)
*/

import java.util.*;

public class Longest_Bitonic_Subsequence_Problem {
	static int bitonicDP(int[] arr) {
	    int length = arr.length;
	    int[] memo1 = new int[length];
	    int[] memo2 = new int[length];
	    Arrays.fill(memo1, 1);
	    Arrays.fill(memo2, 1);
	    for (int i = 1; i < length; i++) {
	        for (int j = 0; j < i; j++) {
	            if (arr[i] > arr[j]) memo1[i] = Math.max(memo1[i], 1 + memo1[j]);
	        }
	    }
	    for (int i = length; i >= 0 ; i--) {
	        for (int j = length - 1; j > i; j--) {
	            if (arr[i] > arr[j]) memo2[i] = Math.max(memo2[i], 1 + memo2[j]);
	        }
	    }
	    int maximum = Integer.MIN_VALUE;
	    for (int i = 0; i < length; i++) maximum = Math.max(maximum, memo1[i] + memo2[i]);
	    return maximum - 1;
	}
}
