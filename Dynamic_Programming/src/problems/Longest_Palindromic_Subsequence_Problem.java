package problems;
/*As another example, if the given sequence is “BBABCBCAB”, then the output should be 7 as “BABCBAB” is the longest palindromic subseuqnce in it. “BBBBB” and 
 * “BBCBB” are also palindromic subsequences of the given sequence, but not the longest ones.
 * 
 */
public class Longest_Palindromic_Subsequence_Problem {
	static int longestPalindromicSequenceRecursion(String str) {
	    if (str.length() == 0) return 0;
	    if (str.length() == 1) return 1;
	    if (str.charAt(0) == str.charAt(str.length() - 1)) 
	        return 2 + longestPalindromicSequenceRecursion(str.substring(1,str.length()-2));
	    else return Math.max(longestPalindromicSequenceRecursion(str.substring(0,str.length()-2)), 
	        longestPalindromicSequenceRecursion(str.substring(1,str.length()-1)));
	}
}
