package miscellaneous;

public class Normal_String_To_Encoded_String {
	public static String convert(String string) {
		char character = string.charAt(0);
		int index = 1;
		String answer = "";
		for (int i = 1; i < string.length(); i++) {
			if (character == string.charAt(i))
				index++;
			else {
				answer += character + Integer.toString(index);
				character = string.charAt(i);
				index = 1;
			}
		}
		answer += character + Integer.toString(index);
		return answer;
	}
}
