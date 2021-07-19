package medium;

/*
 * 
 * Given an array of distinct integers candidates and a target integer target,
 return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. 
Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 
 * 
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findCombinations(candidates, 0, target, new LinkedList<Integer>(), result);
		return result;

	}

	private void findCombinations(int[] candidates, int start, int target, LinkedList<Integer> l1,
			List<List<Integer>> result) {
		if (target < 0)
			return;
		if (target == 0)
			result.add(new ArrayList<Integer>(l1));
		for (int i = start; i < candidates.length; i++) {
			l1.add(candidates[i]);
			findCombinations(candidates, i, target - candidates[i], l1, result);
			l1.removeLast();
		}

	}

}
