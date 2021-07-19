package easy;

public class Maximum_Ascending_SubArray {

	public static int MaxSum(int[] arr) {
		int currentSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			System.out.println("Arr[i] " + arr[i] + " arr[i+1] " + arr[i -1]);
			if (arr[i] > arr[i-1]) {
				
				currentSum += arr[i];
				//System.out.println("currSUm " + currentSum);
			} else
				currentSum = arr[i];

			if (currentSum > maxSum)
				maxSum = currentSum;
		}
		return maxSum;

	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40,50 };
		System.out.println(MaxSum(arr));
	}

}
