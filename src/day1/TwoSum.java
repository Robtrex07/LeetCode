package day1;

import java.util.HashMap;

public class TwoSum {

	public static int[] Soltion(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int comp = target - arr[i];
			if (map.containsKey(comp)) {
				return new int[] { map.get(comp), i };
				// break;
			} else
				map.put(arr[i], i);
		}
		throw new IllegalArgumentException("No Solution found");
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4 };
		int tar = 10;
		System.out.println(Soltion(arr, tar));
	}

}
