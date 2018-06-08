package roman_numerals;
import java.util.HashMap;

public class Convert_Roman_to_Decimal {
	public int romanToInt(String s) {
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("I", 1);
        hm.put("IV", 4);
        hm.put("V", 5);
        hm.put("IX", 9);
        hm.put("X", 10);
        hm.put("XL", 40);
        hm.put("L", 50);
        hm.put("XC", 90);
        hm.put("C", 100);
        hm.put("CD", 400);
        hm.put("D", 500);
        hm.put("CM", 900);
        hm.put("M", 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (hm.get(s.substring(i, i + 2)) != null) {
                    answer += hm.get(s.substring(i, i + 2));
                    i++;
                }
                else answer += hm.get(s.substring(i, i + 1));
            }
            else answer += hm.get(s.substring(i, i + 1));
        }
        return answer;
    }
}
