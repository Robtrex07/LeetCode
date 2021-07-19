package easy;

import java.util.Arrays;

public class Squares_Of_Sorted_Array {

	public static int[] sortedSquares(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(arr[i], 2);
		}

		Arrays.sort(arr);

		/*
		 * for (int i : arr) System.out.printf("%d ", i);
		 */
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { -4, -1, 0, 3, 10 };
		System.out.println(sortedSquares(arr));
	}

}
