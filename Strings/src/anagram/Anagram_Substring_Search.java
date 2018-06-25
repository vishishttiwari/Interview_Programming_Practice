package anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram_Substring_Search {	
	public static ArrayList<Integer> search(String txt, String pat) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String sortedPat = sort(pat);
		for (int i = 0; i < txt.length() - pat.length() + 1; i++) {
			if (sort(txt.substring(i, pat.length() + i)).equals(sortedPat)) {
				arr.add(i);
			}
		}
		return arr;
	}
	
	private static String sort(String string) {
		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
	}
}