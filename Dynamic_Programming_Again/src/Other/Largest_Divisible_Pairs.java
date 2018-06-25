package Other;
import java.util.Arrays;

public class Largest_Divisible_Pairs {
	public static int memo(int[] arr) {
		int memo[] = new int[arr.length];
		Arrays.sort(arr);
		Arrays.fill(memo, 1);
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] % arr[j] == 0) {
					memo[i] = Math.max(memo[i], memo[j] + 1);
				}
			}
			max = Math.max(max, memo[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(memo[i] + "\t");
		}
		System.out.println();
		return max;
	}
}
