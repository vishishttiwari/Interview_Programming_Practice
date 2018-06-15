package strings;

public class Count_Words_In_An_Array {
	public static int count(String string) {
		int index = 0;
		int count = 1;
		if (check(string.charAt(0))) count--;
		if (check(string.charAt(string.length() - 1))) count--;
		while (index < string.length()) {
			if (check(string.charAt(index))) {
				count++;
				index++;
				while ((index < string.length()) && (check(string.charAt(index)))) {
					index++;
				}
			}
			index++;
		}
		return count;
	}
	
	public static boolean check(char character) {
		if ((character == ' ') || (character == '\t') || (character == '\n')) return true;
		return false;
	}
}
