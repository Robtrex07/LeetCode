package easy;

public class Three_Consecutive_Odds {

	public static boolean threeConsecutiveOdds(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			//System.out.println("value of i " + i);
			if (i + 2 <= arr.length - 1) {
				if ((arr[i] == 1 && arr[i + 1] == 1 && arr[i + 2] == 1))
					return true;
				if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0) && (arr[i + 2] % 2 != 0))
					return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1 };
		System.out.println(threeConsecutiveOdds(arr));
	}

}
