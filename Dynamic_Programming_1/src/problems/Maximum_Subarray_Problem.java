package problems;

public class Maximum_Subarray_Problem {

    static int[] maxSubarrayBruteForce(int[] arr) {
        int[] result = new int[2];
        int maximum = Integer.MIN_VALUE, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) result[1] += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                }
                maximum = Math.max(maximum, temp);
            }
        }
        result[0] = maximum;
        return result;
    }
    
    // ****************Kadane's Algorithm********************
    // Basically the max_global keeps track of the greatest sum occurred in the array
    // max_current keeps track if the current sum should be included.
    // Consider the case {1, 2, 3, -10, 5, 2}, now for max_global is kept track of the fact that 1,2,3 is the highest.
    // The max_current now has 1+2+3-10 = -4. Now when it sees 5, it will try to start a new array from here but
    // because this is still less than 6, it will not be saved as global. Now when 2 is added then this becomes higher
    // than global and is now becomes the global highest.
    static int[] maxSubarrayDP(int[] arr) {
        int[] result = new int[2];
        
        if (arr[0] > 0) result[1] = arr[0]; // This is for subsequence
        
        int max_current = arr[0], max_global = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max_current = Math.max(arr[i], max_current + arr[i]);
            max_global = Math.max(max_global, max_current);
            
            if (arr[i] > 0) result[1] += arr[i]; // This is for subsequence
        }
        result[0] = max_global;
        return result;
    }
    /*
    Lets take the example:
    {-2, -3, 4, -1, -2, 1, 5, -3}

    max_so_far = max_ending_here = 0

    for i=0,  a[0] =  -2
    max_ending_here = max_ending_here + (-2)
    Set max_ending_here = 0 because max_ending_here < 0

    for i=1,  a[1] =  -3
    max_ending_here = max_ending_here + (-3)
    Set max_ending_here = 0 because max_ending_here < 0

    for i=2,  a[2] =  4
    max_ending_here = max_ending_here + (4)
    max_ending_here = 4
    max_so_far is updated to 4 because max_ending_here greater 
    than max_so_far which was 0 till now

    for i=3,  a[3] =  -1
    max_ending_here = max_ending_here + (-1)
    max_ending_here = 3

    for i=4,  a[4] =  -2
    max_ending_here = max_ending_here + (-2)
    max_ending_here = 1

    for i=5,  a[5] =  1
    max_ending_here = max_ending_here + (1)
    max_ending_here = 2

    for i=6,  a[6] =  5
    max_ending_here = max_ending_here + (5)
    max_ending_here = 7
    max_so_far is updated to 7 because max_ending_here is 
    greater than max_so_far

    for i=7,  a[7] =  -3
    max_ending_here = max_ending_here + (-3)
    max_ending_here = 4
    */
}