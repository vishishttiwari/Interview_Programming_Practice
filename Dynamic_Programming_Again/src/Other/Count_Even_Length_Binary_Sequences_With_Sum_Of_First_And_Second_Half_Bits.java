package Other;

public class Count_Even_Length_Binary_Sequences_With_Sum_Of_First_And_Second_Half_Bits {
	public static int count(int N) {
		memo = new int[N + 1];
		recursion(N, 0, "");
		int amount = 0;
		for (int i = 0; i < memo.length; i++) amount += memo[i] * memo[i];
		return amount;
	}
	
	static int[] memo;
	public static void recursion(int N, int sum, String str) {
		if (str.length() > N) return;
		if (str.length() == N) memo[sum]++;
		recursion(N, sum + 1, str + '1');
		recursion(N, sum, str + '0');
	}
}
