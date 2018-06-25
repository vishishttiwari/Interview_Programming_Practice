package anagram;

public class Check_Whether_Two_Strings_Are_Anagram {	
	public static boolean check(String string1, String string2) {
		int[] arr1 = new int[128];
		int[] arr2 = new int[128];
		for (int i = 0; i < string1.length(); i++) arr1[(int)string1.charAt(i)]++;
		for (int i = 0; i < string2.length(); i++) arr2[(int)string2.charAt(i)]++;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) return false;
		}
		return true;
	}
}
