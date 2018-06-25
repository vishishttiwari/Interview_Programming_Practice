/*
 * Write a program to print all permutations of a given string
A permutation, also called an “arrangement number” or “order,” 
is a rearrangement of the elements of an ordered list S into 
a one-to-one correspondence with S itself. A string of length 
n has n! permutation.

Source: Mathword(http://mathworld.wolfram.com/Permutation.html)

Below are the permutations of string ABC.
ABC ACB BAC BCA CBA CAB
 */

package miscellaneous;

import java.util.ArrayList;

class permutations {
	static ArrayList<String> stringArr = new ArrayList<String>();
}

public class Print_All_Permutations_Of_A_String {
	public static ArrayList<String> check(String string) {
		ArrayList<Character> charArr = new ArrayList<Character>();
		for (int i = 0; i < string.length(); i++) 
			charArr.add(string.charAt(i));
		checkAll(charArr, "");
		return permutations.stringArr;
	}
	
	private static void checkAll(ArrayList<Character> charArr, String string) {
		if (charArr.size() == 0) return;
		if (charArr.size() == 1) {
			permutations.stringArr.add(string + charArr.get(0));
			return;
		}
		for (int i = 0; i < charArr.size(); i++) {
			char temp = charArr.get(i);
			ArrayList<Character> temp1 = (ArrayList<Character>) charArr.clone();
			temp1.remove(i);
			checkAll(temp1, string + temp);
		}
	}
}
