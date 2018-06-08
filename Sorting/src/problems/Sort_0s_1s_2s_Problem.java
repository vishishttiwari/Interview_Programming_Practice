package problems;

public class Sort_0s_1s_2s_Problem {
	public static void sort(int[] arr) {
	    int lo = 0, mid = 0, hi = arr.length - 1;
	    while (mid <= hi) {
	    	Print.print(arr);
	        if (arr[mid] == 0) {
	            swap(arr, lo, mid);
	            lo++;
	            mid++;
	        }
	        else if (arr[mid] == 1) {
	            mid++;
	        }
	        else if (arr[mid] == 2) {
	            swap(arr, mid, hi);
	            hi--;
	        }
	    }
	}
	
	public static void swap(int[] arr, int lo, int hi) {
	    int temp = arr[lo];
	    arr[lo] = arr[hi];
	    arr[hi] = temp;
	}
}
