package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unique_Number_Of_Occurrences {

	public static boolean occurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> mapCheck = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		for (int j : map.keySet()) {
			//System.out.println("keys " + map.get(j));
			//System.out.println("mapcheck "+mapCheck.add(map.get(j)));
			if (!mapCheck.add(map.get(j))) {
				//System.out.println("in if");
				return false;
			} else {
				//System.out.println("in else");
				mapCheck.add(map.get(j));
			}
		}
		return true;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 1,1,4, 3 };
		System.out.println(occurrences(arr));
	}
}
