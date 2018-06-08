package algorithms;

public class Counting_Sort {
	public static void sort(int[] arr) {
		int largest = findLargest(arr);
		int[] count = findCount(arr, largest);
		int[] sorted = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sorted[i] = count[arr[i]];
			count[arr[i]]--;
		}
	}
	
	public static int findLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			largest = Math.max(arr[i], largest);
		}
		return largest;
	}
	
	public static int[] findCount(int[] arr, int largest) {
		int[] count = new int[largest + 1];
		for (int i = 0; i < arr.length; i++) count[arr[i]]++;
		for (int i = 1; i < arr.length; i++) count[i] += count[i-1];
		return count;
	}
}
