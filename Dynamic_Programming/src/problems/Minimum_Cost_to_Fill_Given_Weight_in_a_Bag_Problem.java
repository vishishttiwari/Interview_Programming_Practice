package problems;
/*
You are given a bag of size W kg and you are provided costs of packets different weights of oranges in 
array cost[] where cost[i] is basically cost of ‘i’ kg packet of oranges. Where cost[i] = -1 means that ‘i’ kg packet of orange is unavailable

Find the minimum total cost to buy exactly W kg oranges and if it is not possible to buy exactly W kg oranges then print -1. 
It may be assumed that there is infinite supply of all available packet types.

Note : array starts from index 1.
Examples:

Input  : W = 5, cost[] = {20, 10, 4, 50, 100}
Output : 14
We can choose two oranges to minimize cost. First 
orange of 2Kg and cost 10. Second orange of 3Kg
and cost 4. 

Input  : W = 5, cost[] = {1, 10, 4, 50, 100}
Output : 5
We can choose five oranges of weight 1 kg.

Input  : W = 5, cost[] = {1, 2, 3, 4, 5}
Output : 5
Costs of 1, 2, 3, 4 and 5 kg packets are 1, 2, 3, 
4 and 5 Rs respectively. 
We choose packet of 5kg having cost 5 for minimum
cost to get 5Kg oranges.

Input  : W = 5, cost[] = {-1, -1, 4, 5, -1}
Output : -1
Packets of size 1, 2 and 5 kg are unavailable
because they have cost -1. Cost of 3 kg packet 
is 4 Rs and of 4 kg is 5 Rs. Here we have only 
weights 3 and 4 so by using these two we can  
not make exactly W kg weight, therefore answer 
is -1.
 */

public class Minimum_Cost_to_Fill_Given_Weight_in_a_Bag_Problem {
	static int minimumDP(int[] arr, int w) {
	    int[][] memoDP = new int[w + 1][arr.length + 1];
	    
	    for (int i = 1; i <= w; i++) {
	        for (int j = 0; j <= arr.length; j++) {
	            memoDP[i][j] = Integer.MAX_VALUE;
	        }
	    }
	    
	    for (int i = 1; i <= w; i++) {
	        for (int j = 1; j <= arr.length; j++) {
	            if (j > i) {
	                memoDP[i][j] = memoDP[i][j-1];
	            }
	            else if (j == i) {
	                memoDP[i][j] = Math.min(arr[i - 1],memoDP[i][j - 1]);
	            }
	            else if (j < i) {
	                memoDP[i][j] = Math.min(memoDP[i][j - 1], arr[j - 1] + memoDP[i - j][arr.length]);
	            }
	        }
	    }
	    
	    if (memoDP[w][arr.length] < 0) return -1;
	    return memoDP[w][arr.length];
	}
}
