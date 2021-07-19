package day1;

import java.util.HashMap;

public class Longest_Substring_Length {

	public static int longest_SubString(String str) {
		if (str.length() < 0 || str.isEmpty())
			return 0;
		if (str.equals(" ") || str.length() == 1)
			return 1;

		String longest_String = null;
		int longest_length = 0;
		char[] str_array = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str_array.length; i++) {

			if (!map.containsKey(str_array[i])) {
			//	System.out.println(str_array[i]);
				map.put(str_array[i], i);
			} else {
				i = map.get(str_array[i]);
				map.clear();

			}
			if (map.size() > longest_length) {
				longest_length = map.size();
				longest_String = map.keySet().toString();

			}
		}
		System.out.println("longest String " + longest_String.toString());
		return longest_length;

	}

	public static void main(String[] args) {

		String str = "abbbccda";
		System.out.println(longest_SubString(str));
	}

}
