package checking;

public class Check_If_Each_Internal_Node_Of_A_Binary_Search_Tree_Has_Exactly_One_Child {	
	public static boolean check(int[] pre) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for (int i = 1; i < pre.length; i++) {
			System.out.println("Min: " + min + " Max: " + max);
			if ((pre[i] > min) && (pre[i] < max)) {
				if (pre[i] > pre[i-1]) min = pre[i-1];
				else max = pre[i-1];
			}
			else return false;
		}
		return true;
	}
}
