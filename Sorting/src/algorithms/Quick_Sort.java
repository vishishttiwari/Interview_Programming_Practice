package algorithms;
public class Quick_Sort {
	public static void sort(int[] arr) {
		quick_Sort(arr, 0, arr.length - 1);
	}
	
	public static void quick_Sort(int[] arr, int lo, int hi) {
		if (hi <= lo + 1) return;
		int pivot = arr[(hi + lo)/2];
		int index1 = lo, index2 = hi;
		while (index1 < index2) {
			if ((arr[index1] >= pivot) && (arr[index2] <= pivot)) {
				swap(arr, index1, index2);
				index1++;
				index2--;
			}
			else {
				if (arr[index1] < pivot) index1++;
				if (arr[index2] > pivot) index2--;
			}
		}
		quick_Sort(arr, lo, index1);
		quick_Sort(arr, index1 + 1, hi);
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
