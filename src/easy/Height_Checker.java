package easy;

import java.util.Arrays;

public class Height_Checker {

	public static int heightChecker(int[] arr) {
		int[] newArr = new int[arr.length - 1];
		int count = 0;

		// Arrays.sort(arr);
		newArr = arr.clone();
		Arrays.sort(newArr);

		/*
		 * for (int i : newArr) System.out.printf("%d ", i);
		 */

		int n = 0;
		int m = 0;

		while (n < arr.length && m < newArr.length) {
			if (arr[n] != newArr[m])
				count++;

			n++;
			m++;
		}
		return count;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 4, 2, 1, 3 };
		System.out.println(heightChecker(arr));

	}
}
