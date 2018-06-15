/* This is faulty */

package character_counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Smallest_Window_That_Contains_All_Characters_Of_String_Itself {
	public static void main(String[] args) {
		System.out.println(find("aabcbcdbca"));
	}
	
	public static String find(String string) {
		HashSet<Character> set = new HashSet<Character>();
		ArrayList<Character> arr = new ArrayList<Character>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			if (!set.contains(string.charAt(i))) {
				set.add(string.charAt(i));
				arr.add(string.charAt(i));
				map.put(string.charAt(i), index);
				index++;
			}
		}
		int[] count = new int[arr.size()];
		int counts = arr.size();
		int index1 = 0, index2 = 0;
		while (counts > 0) {
			if (count[map.get(string.charAt(index1))] == 0) counts--;
			count[map.get(string.charAt(index1))]++;
			index1++;
		}
		while (counts < arr.size()) {
			if (count[map.get(string.charAt(index2))] == 1) {
				counts--;
			}
			else {
				count[map.get(string.charAt(index2))]--;
				if (count[map.get(string.charAt(index2))] == 1) {
					counts--;
				}
			}
			index2++;
		}
		return string.substring(index2, index1);
	}
}
