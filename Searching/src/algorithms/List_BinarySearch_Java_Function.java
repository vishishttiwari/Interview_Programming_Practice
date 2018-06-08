package algorithms;
import java.util.ArrayList;
import java.util.Collections;

public class List_BinarySearch_Java_Function {
	public static int binary_Search(int find, ArrayList<Integer> arr) {
		Collections.sort(arr);
		return Collections.binarySearch(arr, find);
	}
}
