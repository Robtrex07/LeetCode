package easy;

public class Running_Sum_of_1D_Array {

	public static int[] running_sum(int[] arr) {

		int[] newArr = new int[arr.length];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			newArr[i] = sum;
		}

		/*
		 * for (int ch : newArr) System.out.printf("%d ", ch);
		 */
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		System.out.println(running_sum(arr));
	}
}
