package greedy;

public class Lemonade_Change_Problem {

	public static boolean lemonadeChangeProblem(int[] arr) {
		if (arr[0] == 10 || arr[0] == 20)
			return false;

		int count_5 = 0;
		int count_10 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5)
				count_5++;
			else if (arr[i] == 10) {
				count_10++;
				if (count_5 >= 1)
					count_5--;
				else
					return false;

			} else {

				if (count_5 > 0 && count_10 > 0) {
					count_5--;
					count_10--;
				} else if (count_5 >= 3)
					count_5 -= 3;
				else
					return false;

			}
		}
		return true;

	}

	public static void main(String[] args) {

		int[] arr = { 5, 5, 10, 10, 20 };
		System.out.println(lemonadeChangeProblem(arr));
	}

}
