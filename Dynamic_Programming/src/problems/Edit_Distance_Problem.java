package problems;
/*
 * Given two strings str1 and str2 and below operations that can performed on str1. 
 * Find minimum number of edits (operations) required to convert ‘str1′ into ‘str2′.
 * Insert
 * Remove
 * Replace
 * All of the above operations are of cost=1.
 * Both the strings are of lowercase.
 */


public class Edit_Distance_Problem {
	static int editDistanceRecursion(char[] first, char[] second, int firstIndex, int secondIndex) {
        if (firstIndex == 0) return secondIndex;
	    else if (secondIndex == 0) return firstIndex;
	    else if (first[firstIndex-1] == second[secondIndex-1]) 
	        return editDistanceRecursion(first, second , firstIndex - 1, secondIndex - 1);
	    else
	        return 1 + Math.min(Math.min(editDistanceRecursion(first, second , firstIndex - 1, secondIndex),
	        editDistanceRecursion(first, second , firstIndex, secondIndex - 1)), 
	        editDistanceRecursion(first, second , firstIndex - 1, secondIndex - 1));
	}
	
	static int editDistanceDP(char[] first, char[] second) {
        int[][] memo = new int[first.length][second.length];
        
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (i == 0) memo[i][j] = j;
                else if (j == 0) memo[i][j] = i;
                else if (first[i] == second[j]) memo[i][j] = memo[i-1][j-1];
                else memo[i][j] = 1 + Math.min(Math.min(memo[i-1][j], memo[i][j-1]), memo[i-1][j-1]);
            }
        }
        return memo[first.length -1][second.length - 1];
	}
}
