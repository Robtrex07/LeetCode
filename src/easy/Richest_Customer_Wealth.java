package easy;

public class Richest_Customer_Wealth {

	public static int maxWealth(int[][] arr) {

		int max_Sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
				sum += arr[i][j];
			}

			if (sum > max_Sum)
				max_Sum = sum;
		}
		return max_Sum;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		System.out.println(maxWealth(arr));
	}

}
