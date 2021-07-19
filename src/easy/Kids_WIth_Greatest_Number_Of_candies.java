package easy;

import java.util.ArrayList;
import java.util.List;

public class Kids_WIth_Greatest_Number_Of_candies {

	public static List<Boolean> candies(int[] arr, int extra_candies) {

		List<Boolean> list = new ArrayList<Boolean>();

		int max = Integer.MIN_VALUE;

		for (int ar : arr) {
			max = Math.max(max, ar);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + extra_candies >= max)
				list.add(true);
			else
				list.add(false);
		}
		return list;

	}

}
