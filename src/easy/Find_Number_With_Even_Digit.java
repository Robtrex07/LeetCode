package easy;

public class Find_Number_With_Even_Digit {

	public static int EvenDigit(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			String s = Integer.toString(arr[i]);
			if (s.length() % 2 == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 555,901,482,1771 };
		System.out.println(EvenDigit(arr));
	}
}
