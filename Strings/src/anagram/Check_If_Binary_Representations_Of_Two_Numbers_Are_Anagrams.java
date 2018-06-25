package anagram;

public class Check_If_Binary_Representations_Of_Two_Numbers_Are_Anagrams {
	public static boolean check(int a, int b) {
		String A = convert(a);
		String B = convert(b);
		int AA = 0, BB = 0;
		for (int i = 0; i < A.length(); i++) if (A.charAt(i) == '1') AA++;
		for (int i = 0; i < B.length(); i++) if (B.charAt(i) == '1') BB++;
		System.out.println(AA);
		System.out.println(BB);
		return (AA==BB);
	}
	
	private static String convert(int num) {
        String bin = "";
        while (num >= 1) {
            bin += Integer.toString(num % 2);
            num /= 2;
        }
        return bin;
    }
}
