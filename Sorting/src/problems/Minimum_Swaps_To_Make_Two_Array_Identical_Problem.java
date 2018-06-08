package problems;
import java.util.HashMap;

public class Minimum_Swaps_To_Make_Two_Array_Identical_Problem {	
	public static void sort(int[] A, int[] B) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int counter = 0;
		for (int i = 0; i < A.length; i++) hm.put(A[i], i);
		for (int i = 0; i < B.length; i++) {
			if (A[i] != B[i]) {
				int ans = i;
				do {
					ans = hm.get(B[ans]);
					B[ans] = A[ans];
					counter++;
				} while(ans != i);
			}
		}
		System.out.println(counter);
	}
}
