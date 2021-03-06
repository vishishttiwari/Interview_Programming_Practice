package problems;

public class Maximum_Product_of_a_Triplet_Problem {	
	public static int sort(int[] arr) {
	    int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;
	    int third = Integer.MIN_VALUE;
	    int lowest = Integer.MAX_VALUE;
	    int low = Integer.MAX_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > first) {
	            third = second;
	            second = first;
	            first = arr[i];
	        }
	        else if (arr[i] > second) {
	            third = second;
	            second = arr[i];
	        }
	        else if (arr[i] > third) {
	            third = arr[i];
	        }
	        if (arr[i] < lowest) {
	            low = lowest;
	            lowest = arr[i];
	        }
	        else if (arr[i] < low) {
	            low = arr[i];
	        }
	    }
	    return Math.max(first * second * third, low * lowest * first);
	}
}
