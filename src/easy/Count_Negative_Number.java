package easy;

public class Count_Negative_Number {

	public static int countNegativeNumber(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] < 0)
					count++;
			}
		}
		return count;
	}

	public static int countNegativeNumberSol2(int[][] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < 0) {
					count += arr[0].length - j;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[][] arr = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
		System.out.println(countNegativeNumber(arr));
		System.out.println(countNegativeNumberSol2(arr));
	}

}
