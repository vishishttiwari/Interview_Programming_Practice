package problems;
/*
 * Count number of binary strings without consecutive 1’s
Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s.

Examples:

Input:  N = 2
Output: 3
// The 3 strings are 00, 01, 10

Input: N = 3
Output: 5
// The 5 strings are 000, 001, 010, 100, 101
 */


public class Count_number_of_binary_strings_without_consecutive_1s_Problem {
	static long oneNotAllowed(int number) {
	    double[] memo = new double[number + 1];
	    memo[0] = 1;
	    memo[1] = 2;
	    for (int i = 2; i <= number; i++) memo[i] = memo[i-1] + memo[i-2];
	    return (long)(memo[number] % 1000000007);
	}
}
