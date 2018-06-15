package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Arrays_Of_Strings {
	public static void alphabet_Simple_Sort(String[] arr) {
		Arrays.sort(arr);
	}
	
	public static void alphabet_Descending_Sort(String[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
	}
	
	public static void simple_Sort(ArrayList<String> arr) {
		Collections.sort(arr);
	}
	
	public static void descending_Sort(ArrayList<String> arr) {
		Collections.sort(arr, Collections.reverseOrder());
	}
}
