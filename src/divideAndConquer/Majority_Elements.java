package divideAndConquer;

import java.util.Arrays;

public class Majority_Elements {

	public static int majorityElements(int[] nums) {
		Arrays.sort(nums);

		int start = 0;
		int end = nums.length - 1;
		int mid = (start + end) / 2;
		int element = nums[mid];
		return element;

	}
	public static void main(String[] args) {
		
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(majorityElements(nums));
	}

}
