package day1;

import java.util.HashMap;
import java.util.HashSet;

public class Cont_Triplets_With_Sum_0 {

	public static void find_triplets(int[] arr) {
		// HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length - 1; i++) {
			HashSet<Integer> set = new HashSet<Integer>();

			for (int j = i + 1; j < arr.length; j++) {
				int x = -(arr[i] + arr[j]);

				if (set.contains(x)) {
					System.out.println("Triplets are " + x + ", " + arr[i] + " and " + arr[j]);
				} else
					set.add(arr[j]);
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };
		find_triplets(arr);

	}

}
