package problems;
import java.util.ArrayList;

public class Union_Intersection_Of_Two_Arrays_Problem {	
	public static Integer[] union(int[] arr1, int[] arr2) {
		int ind1 = 0, ind2 = 0;
		ArrayList<Integer> Union = new ArrayList<Integer>();
		while ((ind1 < arr1.length) || (ind2 < arr2.length)) {
			if (ind1 == arr1.length) {
				Union.add(arr2[ind2]);
				ind2++;
			}
			else if (ind2 == arr2.length) {
				Union.add(arr1[ind1]);
				ind1++;
			}
			else {
				if (arr1[ind1] < arr2[ind2]) {
					Union.add(arr1[ind1]);
					ind1++;
				}
				else if (arr1[ind1] > arr2[ind2]) {
					Union.add(arr2[ind2]);
					ind2++;
				}
				else {
					Union.add(arr2[ind2]);
					ind1++;
					ind2++;
				}
			}
		}
		Integer[] answer = new Integer[Union.size()];
		Union.toArray(answer);
		return answer;
	}
	
	public static Integer[] intersection(int[] arr1, int[] arr2) {
		int ind1 = 0, ind2 = 0;
		ArrayList<Integer> Intersection = new ArrayList<Integer>();
		while ((ind1 < arr1.length) || (ind2 < arr2.length)) {
			if (ind1 == arr1.length) {
				ind2++;
			}
			else if (ind2 == arr2.length) {
				ind1++;
			}
			else {
				if (arr1[ind1] < arr2[ind2]) {
					ind1++;
				}
				else if (arr1[ind1] > arr2[ind2]) {
					ind2++;
				}
				else {
					Intersection.add(arr2[ind2]);
					ind1++;
					ind2++;
				}
			}
		}
		Integer[] answer = new Integer[Intersection.size()];
		Intersection.toArray(answer);
		return answer;
	}
}
