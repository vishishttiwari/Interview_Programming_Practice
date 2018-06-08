package problems;
/*
Given 3 strings of all having length < 100,the task is to find the longest common 
sub-sequence in all three given sequences.

Examples:

Input : str1 = "geeks"  
        str2 = "geeksfor"  
        str3 = "geeksforgeeks"
Output : 5
Longest common subsequence is "geeks"
i.e., length = 5

Input : str1 = "abcd1e2"  
        str2 = "bc12ea"  
        str3 = "bd1ea"
Output : 3
Longest common subsequence is "b1e" 
i.e. length = 3.
*/

public class Longest_Common_Subsequence_of_Three_Substrings_Problem {
	static int LCSThreeDP(char[] first, char[] second, char[] third) {
	    int[][][] memo = new int[first.length + 1]
	    [second.length + 1][third.length + 1];
	    
	    int maximum = 1;
	    for (int i = 1; i <= first.length; i++) {
	        for (int j = 1; j <= second.length; j++) {
	            for (int k = 1; k <= third.length; k++) {
	                if ((first[i-1] == second[j-1]) && (first[i-1] == third[k-1])) {
	                    memo[i][j][k] = 1 + memo[i-1][j-1][k-1];
	                }
	                else {
	                    memo[i][j][k] = Math.max(Math.max(memo[i-1][j][k], 
	                    memo[i][j-1][k]), memo[i][j][k-1]);
	                }
	                maximum = Math.max(maximum, memo[i][j][k]);
	            }
	        }
	    }
	    return maximum;
	}
}
