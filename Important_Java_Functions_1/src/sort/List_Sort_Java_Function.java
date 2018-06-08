package sort;
import java.util.ArrayList;
import java.util.Collections;

public class List_Sort_Java_Function {
	public static void simple_Sort(ArrayList<String> arr) {
		Collections.sort(arr);
	}
	
	public static void descending_Sort(ArrayList<Integer> arr) {
		Collections.sort(arr, Collections.reverseOrder());
	}
}
