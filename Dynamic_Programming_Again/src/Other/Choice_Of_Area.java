package Other;
import java.util.ArrayList;

public class Choice_Of_Area {
	static int[][] memo;
	public static int area(int A, int B, ArrayList<int[]> arr) {
		int max = 0;
		for (int i = 0; i < arr.size(); i++)
			max = 1 + Math.max(findArea(A - arr.get(i)[0], B - arr.get(i)[1], arr, i), max);
		return max;
	}
	
	public static int findArea(int A, int B, ArrayList<int[]> arr, int exclude) {
		if (A < 0 || B < 0) return 0;
		if (memo[A][B] != 0) return memo[A][B];
		for (int i = 0; i < arr.size(); i++) {
			if (i == exclude) continue;
			memo[A][B] = 1 + Math.max(findArea(A - arr.get(i)[0], B - arr.get(i)[1], arr, i), memo[A][B]);
		}
		return memo[A][B];
	}
}
