package strings;

public class Encoded_String_to_Normal_String_a2b2c3_aabbccc {
	public static String find(String string, int k) {
		int index = 0, temp, temp1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
				temp = i;
				while ( i < string.length() && string.charAt(i) >= '0' && string.charAt(i) <= '9') {
					i++;
				}
				temp1 = Integer.parseInt(string.substring(temp, i));
				for (int j = 0; j < temp1; j++) sb.append(string.substring(index, temp));
				index = i;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
}