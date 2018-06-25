/*
 * Naive Pattern Searching:
Slide the pattern over text one by one and 
check for a match of the whole string of pattern. 
If a match is found, then slide by 1 again 
to check for subsequent the whole string again.
 */

package pattern_searching;

import java.util.ArrayList;

public class Naive_Pattern_Searching {
	public static ArrayList<Integer> search(String txt, String pat) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < txt.length() - pat.length() + 1; i++) {
			if (pat.equals(txt.substring(i, pat.length() + i))) arr.add(i);
		}
		return arr;
	}
}
