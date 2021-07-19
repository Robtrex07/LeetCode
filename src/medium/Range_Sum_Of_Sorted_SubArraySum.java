package medium;

import java.util.PriorityQueue;

public class Range_Sum_Of_Sorted_SubArraySum {

	public static int rangeSum(int[] nums, int n, int left, int right) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int i, j, sum;

		for (i = 0; i < n; i++) {
			sum = 0;
			for (j = i; j < n; j++) {
				sum += nums[j];
				minHeap.offer(sum);
			}
		}

		int result = 0;
		int MOD = 1000000007;

		for (i = 0; i < left - 1; i++) {
			minHeap.poll();
		}

		for (; i < right; i++) {
			result = (result + minHeap.poll()) % MOD;
		}

		return result;
	}

}
