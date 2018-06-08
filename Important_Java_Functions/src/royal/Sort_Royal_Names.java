package royal;
import java.util.Arrays;
import java.util.HashMap;

public class Sort_Royal_Names {	
	static String[] sort(String[] names) {
		String[] temp1 = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			String temp = "";
			for (int j = 0; j < names[i].length(); j++) {
				if (names[i].charAt(j) == ' ') {
					temp += names[i].substring(0, j);
					temp += " ";
					temp += romanToInt(names[i].substring(j + 1, names[i].length()));
				}
			}
			temp1[i] = temp;
		}
		Arrays.sort(temp1);
		for (int i = 0; i < temp1.length; i++) {
			String temp = "";
			for (int j = 0; j < temp1[i].length(); j++) {
				if (temp1[i].charAt(j) == ' ') {
					temp += temp1[i].substring(0, j);
					temp += " ";
					temp += intToRoman(temp1[i].substring(j + 1, temp1[i].length()));
				}
			}
			names[i] = temp;
		}
		return names;
	}
	
	static String romanToInt(String roman) {
		int value = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL", 40);
		map.put("L", 50);
		for (int i = 0; i < roman.length(); i++) {
			if (i < roman.length() - 1) {
				if (map.get(roman.substring(i, i + 2)) != null) {
					value += map.get(roman.substring(i, i + 2));
					i++;
				}
				else value += map.get(roman.substring(i, i + 1));
			}
			else value += map.get(roman.substring(i, i + 1));
		}
		return Integer.toString(value);
	}
	
	static String intToRoman(String num) {
		String output = "";
		String[] roman = {"I", "IV", "V", "IX", "X", "XV", "V"};
		int[]  nums = {1, 4, 5, 9, 10, 40, 50};
		int number = Integer.parseInt(num);
		boolean found = false;
		while (number != 0) {
			found = false;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > number) {
					number -= nums[i-1];
					output += roman[i - 1];
					found = true;
					break;
				}
			}
			if (!found) {
				number -= 50;
				output += "V";
			}
		}
		return output;
	}
}
