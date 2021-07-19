package easy;

public class Minimum_Start_Value {

	public static int miniumValue(int[] arr) {
		int currSum = 0;
		int minSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			if (currSum <= 0) {
				minSum += Math.abs(currSum) + 1;
				currSum = 1;
			}
		}
		if(minSum==0)
			return 1;
		
		
		return minSum;
	}

	public static int sol2(int[] arr) {
		int currSum = 0;
		int minSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			minSum = Math.min(minSum, currSum);
		}
		return Math.abs(minSum) + 1;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2 };
		System.out.println(sol2(arr));
	}

}
