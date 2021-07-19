package easy;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class First_NonREpeatingCharacter_Using_Set {

	public static void repeatingCharacter(String str) {
		char c = 0;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			else
				map.put(str.charAt(i), 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				c = entry.getKey();
				System.out.println("Character is c " + c);
				break;
			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				System.out.println("index is "+i);
		}

	}

	public static void main(String[] args) {

		String str = "aabcc";
		repeatingCharacter(str);
	}

}
