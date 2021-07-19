package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMum_Absolute_DIfference {

		public List<List<Integer>> minimumAbsDifference(int[] arr) {
	
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			Arrays.sort(arr);
			int min = arr[1] - arr[0];
	
			for (int i = 0; i < arr.length - 1; i++) {
				min = Math.min(min, (arr[i + 1] - arr[i]));
	
			}
	
			for (int i = 0; i < arr.length - 1; i++) {
				if ((arr[i + 1] - arr[i]) == min) {
					result.add(Arrays.asList(arr[i], arr[i + 1]));
				}
			}
			return result;
	
		}

}
