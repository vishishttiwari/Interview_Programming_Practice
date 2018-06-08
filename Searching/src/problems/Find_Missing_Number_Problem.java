package problems;
/*
Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. 
There are no duplicates in list. One of the integers is missing in the list. 
Write an efficient code to find the missing integer.
 */
public class Find_Missing_Number_Problem {
	public static int find(int[] arr, int n) {
		int totalSum = (n*(n+1))/2;
		for (int i = 0; i < arr.length; i++) {
			totalSum -= arr[i];
		}
		return totalSum;
	}
}
