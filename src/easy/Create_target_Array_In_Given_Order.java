package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_target_Array_In_Given_Order {

	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> ll = new ArrayList<Integer>();
		int[] targetList = new int[nums.length];
		Arrays.asList(nums);

		for (int i = 0; i < nums.length; i++) {
			ll.add(index[i], nums[i]);
		}

		for (int j = 0; j < targetList.length; j++) {
			targetList[j] = ll.get(j).intValue();
		}

		return targetList;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 0 };
		int[] index = { 0, 1, 2, 3, 0 };
		System.out.println(createTargetArray(nums, index));
	}
}
