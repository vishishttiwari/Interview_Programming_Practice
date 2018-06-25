package Grids;

public class Maximum_Weight_Path_Ending_At_Any_Element_Of_Last_Row_In_A_Matrix {
	public static int recursion(int[][] arr, int row, int col) {
		if (row == arr.length - 1) return arr[row][col];
		if (col == arr[row].length - 1)
			return recursion(arr, row + 1, col);
		return arr[row][col] + Math.max(recursion(arr, row + 1, col), recursion(arr, row + 1, col + 1));
	}
	
	static int[][] memo;
	public static int DP(int[][] arr, int row, int col) {
		if (row == arr.length - 1) return arr[row][col];
		if (memo[row][col] != 0) return memo[row][col];
		if (col == arr[row].length - 1) {
			memo[row][col] = recursion(arr, row + 1, col);
			return memo[row][col];
		}
		return arr[row][col] + Math.max(recursion(arr, row + 1, col), recursion(arr, row + 1, col + 1));
	}
}
