package problems;

import java.util.HashSet;

public class Minimum_Word_Break {	
	static HashSet<String> strings;
	public static int find(String[] dictionary, String pattern) {
		strings = new HashSet<String>();
		for (int i = 0; i < dictionary.length; i++) strings.add(dictionary[i]);
		return calculate(strings, pattern);
	}
	
	private static int calculate(HashSet<String> dictionary, String pattern) {
		System.out.println(pattern);
		for (int i = pattern.length(); i >= 0; i--) {
			if (dictionary.contains(pattern.substring(0, i))) {
				if (i == pattern.length()) return 0;
				else return 1 + calculate(dictionary, pattern.substring(i));
			}
		}
		return -100;
	}
}
