package easy;

import java.util.HashMap;
import java.util.HashSet;

public class Sum_Of_Unique_Elements {

	public static int uniqueElementSum(int[] arr) {

		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		for (int in : map.keySet()) {
			if (map.get(in) == 1)
				sum += in;
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2,3,4,5};
		System.out.println(uniqueElementSum(arr));
	}
}
