package problems;

public class Convert_An_Array_To_Reduced_Form_Problem {
	public static void sort(int[] arr) {
	    int[] maxmin = findMaxMin(arr);
	    
	    int[] count = new int[maxmin[0] - maxmin[1] + 1];
	    
	    for (int i = 0; i < arr.length; i++) count[arr[i] - maxmin[1]]++;
	    for (int i = 1; i < count.length; i++) count[i] += count[i-1];
	    
	    int[] ans = new int[arr.length];
	    
	    for (int i = 0; i < ans.length; i++) ans[i] = count[arr[i] - maxmin[1]];
	    for (int i = 0; i < ans.length; i++) System.out.print(ans[i] - 1 + " ");
	    System.out.println();
	}
	
	public static int[] findMaxMin(int[] arr) {
	    int[] answer = new int[2];
	    answer[0] = Integer.MIN_VALUE;
	    answer[1] = Integer.MAX_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	        answer[0] = Math.max(arr[i], answer[0]);
	        answer[1] = Math.min(arr[i], answer[1]);
	    }
	    return answer;
	}
}
