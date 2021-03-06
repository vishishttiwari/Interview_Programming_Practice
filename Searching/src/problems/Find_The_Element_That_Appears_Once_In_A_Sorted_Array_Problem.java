package problems;

public class Find_The_Element_That_Appears_Once_In_A_Sorted_Array_Problem {
	public static int find(int[] arr, int lo, int hi) {
	    int mid = (lo + hi)/2;
	    if ((mid == 0) && (arr[mid] != arr[mid + 1])) return arr[mid];
	    if ((mid == (arr.length - 1)) && (arr[mid] != arr[mid - 1])) return arr[mid];
	    if ((arr[mid] != arr[mid - 1]) && (arr[mid] != arr[mid + 1])) return arr[mid];
	    if (((hi - lo)/2) % 2 == 1) {
	        if (arr[mid] != arr[mid -1]) {
	            return find(arr, lo, mid - 1);
	        }
	        else {
	            return find(arr, mid + 1, hi);
	        }
	    }//odd
	    else {
	        if (arr[mid] == arr[mid -1]) {
	            return find(arr, lo, mid - 1);
	        }
	        else {
	            return find(arr, mid + 1, hi);
	        }
	    }
	}
}
