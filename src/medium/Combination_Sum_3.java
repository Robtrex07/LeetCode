package medium;

/*
 * Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

    Only numbers 1 through 9 are used.
    Each number is used at most once.

	Return a list of all possible valid combinations. 
	The list must not contain the same combination twice, and the combinations may be returned in any order.
 * 
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_3 {

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		combination(1, k, n, new LinkedList<Integer>(), result);
		return result;
	}

	private static void combination(int start, int k, int n, LinkedList<Integer> l1, List<List<Integer>> result) {
		if (k < 0 || n < 0)
			return;
		if (k == 0 && n == 0)
			result.add(new ArrayList<Integer>(l1));
		for (int i = start; i <= 9; i++) {
			l1.add(i);
			combination(i + 1, k - 1, n - i, l1, result);
			l1.removeLast();
		}

	}

	public static void main(String[] args) {

		int k = 3;
		int n = 7;

		System.out.println(combinationSum3(k, n));
	}
}
