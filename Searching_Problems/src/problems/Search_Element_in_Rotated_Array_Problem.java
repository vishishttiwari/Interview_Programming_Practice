package problems;
/*
  Search an element in a sorted and rotated array
  An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending
  order sorted array at some pivot unknown to you beforehand. So for instance,
  1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
 */
public class Search_Element_in_Rotated_Array_Problem {
	public static int find(int[] arr, int find) {
		int lo = 0, hi = arr.length - 1, mid;
		while (hi >= lo) {
			mid = (hi + lo)/2;
			if (arr[mid] == find) return mid;
			if (arr[hi] == find) return hi;
			else if (arr[mid] < find && arr[hi] > find) lo = mid + 1;
			else if (arr[mid] < find && arr[hi] < find) hi = mid - 1;
			else if (arr[mid] > find && arr[hi] > find) hi = mid - 1;
			else if (arr[mid] > find && arr[hi] < find) hi = mid + 1;
		}
		return -1;
	}
}
