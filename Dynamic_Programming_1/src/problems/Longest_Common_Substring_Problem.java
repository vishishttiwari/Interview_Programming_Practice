package problems;
/*
Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.

Examples :

Input : X = "GeeksforGeeks", y = "GeeksQuiz"
Output : 5
The longest common substring is "Geeks" and is of
length 5.

Input : X = "abcdxyz", y = "xyzabcd"
Output : 4
The longest common substring is "abcd" and is of
length 4.

Input : X = "zxabcdezy", y = "yzabcdezx"
Output : 6
The longest common substring is "abcdez" and is of
length 6.
*/

public class Longest_Common_Substring_Problem {
	static int longestCommonSubstringDP(char[] first, char[] second) {
	    int[][] memoDP = new int[first.length][second.length];
	    
	    int max = 0;
	    
	    for (int i = 0; i < first.length; i++) {
	        for (int j = 0; j < second.length; j++) {
	            if ((i == 0) || (j == 0)) {
	                if (first[i] == second[j]) 
    	                memoDP[i][j] = 1;
    	            else 
    	                memoDP[i][j] = 0;
	            }
	            else {
	                if (first[i] == second[j]) 
    	                memoDP[i][j] = 1 + memoDP[i-1][j-1];
    	            else 
    	                memoDP[i][j] = 0;
	            }
	            max = Math.max(max, memoDP[i][j]);
	        }
	    }
	    return max;
	}
}
