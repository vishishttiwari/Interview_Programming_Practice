package prime;

public class Find_All_Prime_Numbers_Till_N {
	public static boolean[] isNotPrime(int N) {
		boolean[] list = new boolean[N + 1];
		for (int i = 2; i < list.length; i++) {
			if (!list[i])
				for (int j = 2 * i; j < list.length; j+=i) list[j] = true;
		}
		return list;
	}
}
