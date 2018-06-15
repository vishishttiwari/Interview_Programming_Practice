package character_counting;

public class Kth_Non_Repeating_Character {
	public static void main(String[] args) {
		System.out.println(find("geeksforgeeks", 3));
	}
	
	public static char find(String string, int k) {
		int[] arr = new int[128];
		for (int i = 0; i < string.length(); i++) arr[string.charAt(i)]++;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]) == 1) k--;
			if (k == 0) return (char)i;
		}
		return (char)0;
	}
}
