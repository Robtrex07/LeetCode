package medium;

/*
 * Given an array of distinct integers nums and a target integer target, 
 * return the number of possible combinations that add up to target.

The answer is guaranteed to fit in a 32-bit integer.

 

Example 1:
 */

public class Combination_Sum_4 {

	public int combinationSum4(int[] nums, int target) {

		int[] count = new int[target + 1];

		count[0] = 1;
		for (int i = 1; i <= target; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i >= nums[j])
					count[i] += count[i - nums[j]];
			}
		}
		return count[target];

	}

}
