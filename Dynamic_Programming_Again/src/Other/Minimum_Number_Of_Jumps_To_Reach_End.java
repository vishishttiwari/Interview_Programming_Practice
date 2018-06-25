package Other;

public class Minimum_Number_Of_Jumps_To_Reach_End {
	public static int DP(int[] arr, int index) {
		if (index >= arr.length) return 0;
		int answer = Integer.MAX_VALUE;
		for (int i = index + 1; i <= index + arr[index]; i++) {
			answer = Math.min(answer, DP(arr, i) + 1);
		}
		return answer;
	}
}
