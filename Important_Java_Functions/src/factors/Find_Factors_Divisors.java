package factors;
import java.util.ArrayList;

public class Find_Factors_Divisors {
	static Integer[] findFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) factors.add(i);
		}
		Integer[] result = new Integer[factors.size()];
		factors.toArray(result);
		return result;
	}
}
