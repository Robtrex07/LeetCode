package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_SubSequence_Non_decreasing_Order {

	public static List<Integer> minimumSunSequence(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int halfSum = sum / 2;

		Arrays.sort(arr);
		
		int currSum = 0;
		int index = 0;
		for (int k = arr.length - 1; k >= 0; k--) {
			currSum += arr[k];
			if (currSum > halfSum) {
				index = k;
				break;
			}

		}
		int z = arr.length - 1;
		while (z >= index) {
			list.add(arr[z]);
			z--;
		}
		return list;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 10, 9, 8 };

		System.out.println(minimumSunSequence(arr));
	}

}
