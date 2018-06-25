package problems;

import java.util.Arrays;

public class Sort_String {	
	public static String sort(String string) {
		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
	}
}
