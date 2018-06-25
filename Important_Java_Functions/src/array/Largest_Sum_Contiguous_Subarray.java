package array;

public class Largest_Sum_Contiguous_Subarray {
	public static int memoization(int[] arr) {
		int[] memo1 = arr.clone();
		
		int max = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (memo1[i] <= memo1[i] + memo1[i-1]) memo1[i] = memo1[i] + memo1[i-1];
			max = Math.max(memo1[i], max);
		}
		return max;
	}
}
