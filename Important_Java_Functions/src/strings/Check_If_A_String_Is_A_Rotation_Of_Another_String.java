package strings;

public class Check_If_A_String_Is_A_Rotation_Of_Another_String {
	public static boolean check(String string1, String string2) {
		String temp = string1 + string1;
		return (temp.contains(string2));
	}
}
