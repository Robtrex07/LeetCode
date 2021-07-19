package easy;

public class FinalPrice_With_Special_Discount {

	public static int[] specialDiscount(int[] arr)

	{
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			// System.out.println("i value " + i);
			for (int j = i + 1; j < arr.length; j++) {
				// System.out.println("arr[i] " + arr[i] + " arr[j] " + arr[j]);
				if (arr[j] <= arr[i]) {
					// System.out.println("discount " + (arr[i] - arr[j]));
					newArr[i] = arr[i] - arr[j];
					// System.out.println("newArr value " + newArr[i] + " at i " + i);
					break;
				} else {
					// System.out.println("value of i in else " + i);
					newArr[i] = arr[i];
				}
			}

		}
		newArr[arr.length - 1] = arr[arr.length - 1];

		for (int i : newArr)
			System.out.printf("%d ", i);
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 1, 1, 6 };
		specialDiscount(arr);
	}

}
