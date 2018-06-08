package algorithms;

public class Insertion_Sort {
	public static void sort(int[] arr) {
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
