package easy;

public class Replace_Element_With_Greatest_Element_On_Right {

	public static int[] elements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = greatest(arr, i + 1, arr.length - 1);
		}

		arr[arr.length - 1] = -1;

		for (int ar : arr)
			System.out.printf("%d ", ar);
		return arr;
	}

	private static int greatest(int[] arr, int start, int end) {
		// System.out.println("start " + start + " end " + end);
		int currGreatest = Integer.MIN_VALUE;
		int greatest = Integer.MIN_VALUE;
		while (start <= end) {
			currGreatest = Math.max(arr[start], arr[end]);
			/*
			 * System.out.println(" arr[start] " + arr[start] + " arr[end] " + arr[end]);
			 * System.out.println("currgreatest " + currGreatest);
			 */if (currGreatest > greatest) {
				greatest = currGreatest;
				// System.out.println("greatest " + greatest);
			}

			start++;
			// end--;
		}
		return greatest;

	}

	public static int[] solution2(int[] arr) {
		int[] result = new int[arr.length];
		int max = Integer.MIN_VALUE;
		result[arr.length - 1] = -1;
		for (int i = 1; i < arr.length; i++) {
			max = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				max = Math.max(max, arr[j]);

			}
			result[i - 1] = max;
		}

		for (int ar : result)
			System.out.printf("%d ", ar);
		return arr;

	}

	public static int[] solution3(int[] arr) {
		int[] result = new int[arr.length];

		int max = arr[arr.length - 1];
		//System.out.println("main max "+max);
		result[result.length - 1] = -1;

		for (int i = arr.length - 2; i >= 0; i--) {
			//System.out.println("max before " + max);
			result[i] = max;
			max = Math.max(max, arr[i]);
			//System.out.println("max after " + max);
		}

		for (int ar : result)
			System.out.printf("%d ", ar);
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 17, 18, 5, 4, 6, 1 };
		// elements(arr);
		// solution2(arr);
		solution3(arr);
	}
}
