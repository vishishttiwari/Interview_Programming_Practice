package strings;

public class Reverse_Words_In_A_Given_String {
	public static String reverse(String string) {
		String[] sentence = string.split(" ");
		String answer = "";
		for (int i = sentence.length - 1; i >= 0; i--)
			answer += sentence[i] + " ";
		return answer;
	}
}
