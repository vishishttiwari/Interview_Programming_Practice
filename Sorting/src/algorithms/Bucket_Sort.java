package algorithms;
import java.util.ArrayList;

public class Bucket_Sort {
	public static void sort(int[] arr) {
		ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer[]> sortedBuckets = new ArrayList<Integer[]>();
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			buckets.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < (i * 10)) buckets.get(i).add(arr[i]);
		}
		for (int i = 0; i < 10; i++) {
			Integer[] bucket = new Integer[buckets.get(i).size()];
			buckets.get(i).toArray(bucket);
			InsertionSort(bucket);
			sortedBuckets.add(bucket);
			for (int j = 0; j < bucket.length; j++) sortedList.add(bucket[j]);
			for (int j = 0; j < bucket.length; j++) System.out.println(bucket[j]);
		}
		Integer[] sortedArray = new Integer[sortedList.size()];
		sortedList.toArray(sortedArray);
		for (int i = 0; i < sortedArray.length; i++) arr[i] = sortedArray[i];
	}
	
	public static void InsertionSort(Integer[] arr) {
		int num;
		for (int i = 0; i < arr.length; i++) {
			num = i;
			while (num > 0 && (arr[num] < arr[num - 1])) {
				int temp = arr[num];
				arr[num] = arr[num - 1];
				arr[num - 1] = temp;
				num--;
			}
		}
	}
}
