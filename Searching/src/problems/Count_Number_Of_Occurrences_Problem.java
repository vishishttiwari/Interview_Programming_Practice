package problems;
/*
 * Count number of occurrences (or frequency) in a sorted array
Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)

Examples:

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
 */
public class Count_Number_Of_Occurrences_Problem {
	public static void find(int[] arr, int num) {
	    System.out.println(find1(arr, num, 0, arr.length - 1));
	}
	
	public static int find1(int[] arr, int num, int lo, int hi) {
	    if (hi < lo) return -1;
	    int mid = (hi + lo)/2;
	    if (arr[mid] == num) {
	        int high = binary_Search_Right(arr, num, mid, hi);
	        int low = binary_Search_Left(arr, num, lo, mid);
	        return high - low + 1;
	    }
	    else if (arr[mid] < num) {
	        return find1(arr, num, mid + 1, hi);
	    }
	    else if (arr[mid] > num) {
	        return find1(arr, num, lo, mid - 1);
	    }
	    return -1;
	}
	
	public static int binary_Search_Right(int[] arr, int num, int lo, int hi) {
	    if (hi == lo) return hi;
	    int mid = (hi + lo)/2;
	    if (arr[mid] == num) {
	        if (arr[mid + 1] == num) {
	            binary_Search_Right(arr, num, mid + 2, hi);
	        }
	        else {
	            return mid;
	        }
	    }
	    else if (arr[mid] != num) {
	        if (arr[mid - 1] != num) {
	            binary_Search_Right(arr, num, lo, mid - 2);
	        }
	        else {
	            return mid - 1;
	        }
	    }
	    return -1;
	}
	
	public static int binary_Search_Left(int[] arr, int num, int lo, int hi) {
	    if (hi == lo) return hi;
	    int mid = (hi + lo)/2;
	    if (arr[mid] == num) {
	        if (arr[mid - 1] == num) {
	            binary_Search_Left(arr, num, lo, mid - 2);
	        }
	        else {
	            return mid;
	        }
	    }
	    else if (arr[mid] != num) {
	        if (arr[mid + 1] != num) {
	            binary_Search_Left(arr, num, mid + 2, hi);
	        }
	        else {
	            return mid + 1;
	        }
	    }
	    return -1;
	}
}
