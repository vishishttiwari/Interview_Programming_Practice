package problems;
import java.util.PriorityQueue;

public class Kth_Smallest_Element_Problem {
	public static int find(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		for (int i = 0; i < k - 1; i++) {
			pq.poll();
		}
		return pq.poll();
	}
}
