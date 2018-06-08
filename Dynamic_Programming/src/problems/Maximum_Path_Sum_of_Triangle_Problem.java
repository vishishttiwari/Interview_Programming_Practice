package problems;
/*
Maximum path sum in a triangle.
We have given numbers in form of triangle, 
by starting at the top of the triangle and moving to adjacent numbers on the row below, 
find the maximum total from top to bottom.

Examples:

Input : 
   3
  7 4
 2 4 6
8 5 9 3
Output : 23
Explanation : 3 + 7 + 4 + 9 = 23 

Input :
   8
 -4 4
 2 2 6
1 1 1 1
Output : 19
Explanation : 8 + 4 + 6 + 1 = 19 
 */

public class Maximum_Path_Sum_of_Triangle_Problem {
	
	static int triangleDP(int[] arr, int rank) {
		int[][] array = new int[rank][rank];
		int[][] memo = new int[rank][rank];
		
		int counter = 0;
		for (int i = 1; i <= rank; i++) {
			for (int j = 0; j < i; j++) {
				array[i-1][j] = arr[counter];
				counter++;
			}
		}
		memo[0][0] = array[0][0];
		int maximum = 0;
		for (int i = 1; i < rank; i++) {
			for (int j = 0; j < rank; j++) {
				if (j > 0) memo[i][j] = Math.max(array[i][j] + Math.max(memo[i-1][j], memo[i-1][j-1]),
						memo[i][j]);
				else memo[i][j] = array[i][j] + array[i-1][j];
				if (i == rank - 1) maximum = Math.max(maximum, memo[i][j]);
			}
		}
		return maximum;
	}
}
