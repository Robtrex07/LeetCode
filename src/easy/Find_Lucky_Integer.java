package easy;

import java.util.HashMap;
import java.util.Set;

public class Find_Lucky_Integer {

	public static int luckyNumber(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		Set<Integer> set = map.keySet();

		for (int j : set) {

			if (j == map.get(j)) {
				if (j > largest)
					largest = j;

			}

		}
		if (largest > 0)
			return largest;
		else
			return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 7,7,7,7,7,7,77};
		System.out.println(luckyNumber(arr));

	}
}
