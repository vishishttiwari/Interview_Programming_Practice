package problems;
/*
 * Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles. 
 * A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.
 */

public class Two_Row_Tiling_Problem {
	static long memo[];
	
	// Its fibonacci because once you add another column then you can either add it in a vertical form in which case you will need all
	// combinations of the previous one or you need to add it in two horizontal ways which will need all combinations of the previous to
	// previous one because laying it horizontally requires the current column and the previous column.
	static long tiling(int n) {
	    if (memo[n-1] != 0) return memo[n-1];
	    memo[n-1] = tiling(n-1) + tiling(n-2);
	    return memo[n-1];
	}
}
