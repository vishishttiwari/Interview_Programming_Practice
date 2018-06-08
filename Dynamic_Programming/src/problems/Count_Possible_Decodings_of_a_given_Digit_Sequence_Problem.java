package problems;
/*
 * Count Possible Decodings of a given Digit Sequence
Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number of possible decodings of the given digit sequence.

Examples:

Input:  digits[] = "121"
Output: 3
// The possible decodings are "ABA", "AU", "LA"

Input: digits[] = "1234"
Output: 3
// The possible decodings are "ABCD", "LCD", "AWD"
An empty digit sequence is considered to have one decoding. It may be assumed that the input contains valid digits from 0 to 9 
and there are no leading 0’s, no extra trailing 0’s and no two or more consecutive 0’s.
 */


public class Count_Possible_Decodings_of_a_given_Digit_Sequence_Problem {
	static long decoding(long number) {
	    if (number < 10) return 1;
	    long a = number % 100;
	    if (a > 26) return decoding(number/10);
	    else return decoding(number/100) + decoding(number/10);
	}
}
