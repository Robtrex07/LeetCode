package medium;

/*
 * Given a collection of candidate numbers (candidates) and a target number (target), 
find all unique combinations in candidates where the candidate numbers sum to target.

	Each number in candidates may only be used once in the combination.

	Note: The solution set must not contain duplicate combinations.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_2 {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);

		findCombination(candidates, 0, target, new LinkedList<Integer>(), result);
		return result;

	}

	private void findCombination(int[] candidates, int index, int target, LinkedList<Integer> l1,
			List<List<Integer>> result) {
		if (target == 0)
			result.add(new ArrayList<Integer>(l1));
		if (target < 0)
			return;

		for (int i = index; i < candidates.length; i++) {
			if (i == index || candidates[i] != candidates[i - 1]) {
				l1.add(candidates[i]);
				findCombination(candidates, i + 1, target - candidates[i], l1, result);
				l1.removeLast();
			}
		}

	}

}
