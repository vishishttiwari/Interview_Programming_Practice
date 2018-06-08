package algorithms;

public class Merge_Sort {
	static int[] arr1;
	public static void sort(int[] arr) {
		arr1 = new int[arr.length];
		Print.print(arr1);
		divide(arr, 0, arr.length - 1);
		Print.print(arr1);
		for (int i = 0; i < arr.length; i++) arr[i] = arr1[i];
	}
	
	public static void divide(int[] arr, int lo, int hi) {
		if (hi <= lo) return;
		int mid = (hi + lo)/2;
		divide(arr, lo, mid);
		divide(arr, mid + 1, hi);
		conquer(arr, lo, mid, hi);
	}
	
	public static void conquer(int[] arr, int lo, int mid, int hi) {
		int ind1 = lo, ind2 = mid + 1, ind3 = lo;
		while (ind1 <= mid || ind2 <= hi) {
			if (ind1 > mid) {
				arr1[ind3] = arr[ind2];
				ind2++;
				ind3++;
				continue;
			}
			if (ind2 > hi) {
				arr1[ind3] = arr[ind1];
				ind1++;
				ind3++;
				continue;
			}
			if (arr[ind1] < arr[ind2]) {
				arr1[ind3] = arr[ind1];
				ind1++;
				ind3++;
				continue;
			}
			else {
				arr1[ind3] = arr[ind2];
				ind2++;
				ind3++;
				continue;
			}
		}
	}
}
