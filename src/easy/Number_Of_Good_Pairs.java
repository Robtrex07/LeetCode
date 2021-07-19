package easy;

import java.util.HashSet;

public class Number_Of_Good_Pairs {

	public static int goodPairs(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 1, 3 };
		System.out.println(goodPairs(nums));

	}
}
