package greedy;

public class Minimum_Cost_To_Move_The_Chips {

	public static int minimumCost(int[] arr) {

		int evenSum = 0;
		//int totalSum = 0;
		int oddSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenSum++;
			else
				oddSum++;
		}

		int result = Math.min(evenSum, oddSum);
		return result;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 2 };

		System.out.println(minimumCost(arr));
	}

}
