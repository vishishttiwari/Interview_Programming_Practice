package miscellaneous;

public class Check_If_Strings_Are_Rotations_Of_Each_Other_Or_Not {
	public static boolean check(String string1, String string2) {
		String temp = string1 + string1;
		return (temp.contains(string2));
	}
}
