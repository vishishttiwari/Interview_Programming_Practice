package Other;

public class Painting_Fence_Algorithm {
	public static int recursion(int N, int K, int occurred) {
		System.out.println(N + " " + K + " " + occurred);
		if (N == 0) return 1;
		if (K == 0) return 0;
		int ways = 0;
		if (occurred == 2) {
			for (int i = 0; i < K - 1; i++)
				ways += recursion(N - 1, K, 0);
		}
		else if (occurred == 1) {
			ways += recursion(N - 1, 1, 2);
			for (int i = 0; i < K - 1; i++)
				ways += recursion(N - 1, K, 1);
		}
		else if (occurred == 0) {
			for (int i = 0; i < K; i++)
				ways += recursion(N - 1, K, 1);
		}
		return ways;
	}
}
