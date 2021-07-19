package greedy;

public class Best_Time_To_Buy_And_Sell_Stock_II {

	public static int buAndSell(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (i + 1 < arr.length && arr[i + 1] > arr[i])
				sum += arr[i + 1] - arr[i];
		}
		return sum;

	}

	public static void main(String[] args) {

		int[] arr = { 7,6,4,3,1};

		System.out.println(buAndSell(arr));
	}

}
