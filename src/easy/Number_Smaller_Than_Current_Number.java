package easy;

import java.util.Arrays;

public class Number_Smaller_Than_Current_Number {

	public static void smallerNumber(int[] arr) {
		// Arrays.sort(arr);

		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int j = 0;
			while (j < arr.length) {
				// System.out.println("arr[i] " + arr[i] + " and arr[j] " + arr[j]);
				if (arr[i] > arr[j] && j != i) {
					count++;
				}
				j++;
			}
			newArr[i] = count;
		}

		for (int ch : newArr)
			System.out.printf("%d ", ch);

	}

	public static void main(String[] args) {

		int[] arr = { 8, 1, 2, 2, 3 };
		smallerNumber(arr);
	}
}
